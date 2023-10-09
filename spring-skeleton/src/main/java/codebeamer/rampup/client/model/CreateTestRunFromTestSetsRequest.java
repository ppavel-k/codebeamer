

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;

/**
 * Request model to create a test run from multiple test sets
 */
@JsonPropertyOrder({
  CreateTestRunFromTestSetsRequest.JSON_PROPERTY_TEST_SET_REFS,
  CreateTestRunFromTestSetsRequest.JSON_PROPERTY_TEST_RUN_MODEL
})
public class CreateTestRunFromTestSetsRequest {
  public static final String JSON_PROPERTY_TEST_SET_REFS = "testSetRefs";
  private List<TrackerItemReference> testSetRefs;

  public static final String JSON_PROPERTY_TEST_RUN_MODEL = "testRunModel";
  private TrackerItem testRunModel;

  public CreateTestRunFromTestSetsRequest() {
  }

  public CreateTestRunFromTestSetsRequest testSetRefs(List<TrackerItemReference> testSetRefs) {
    
    this.testSetRefs = testSetRefs;
    return this;
  }

  public CreateTestRunFromTestSetsRequest addTestSetRefsItem(TrackerItemReference testSetRefsItem) {
    if (this.testSetRefs == null) {
      this.testSetRefs = new ArrayList<>();
    }
    this.testSetRefs.add(testSetRefsItem);
    return this;
  }

   /**
   * Test set ids to include into the test run. Only the first test set will be considered.
   * @return testSetRefs
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TEST_SET_REFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemReference> getTestSetRefs() {
    return testSetRefs;
  }


  @JsonProperty(JSON_PROPERTY_TEST_SET_REFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestSetRefs(List<TrackerItemReference> testSetRefs) {
    this.testSetRefs = testSetRefs;
  }


  public CreateTestRunFromTestSetsRequest testRunModel(TrackerItem testRunModel) {
    
    this.testRunModel = testRunModel;
    return this;
  }

   /**
   * Get testRunModel
   * @return testRunModel
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TEST_RUN_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrackerItem getTestRunModel() {
    return testRunModel;
  }


  @JsonProperty(JSON_PROPERTY_TEST_RUN_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestRunModel(TrackerItem testRunModel) {
    this.testRunModel = testRunModel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTestRunFromTestSetsRequest createTestRunFromTestSetsRequest = (CreateTestRunFromTestSetsRequest) o;
    return Objects.equals(this.testSetRefs, createTestRunFromTestSetsRequest.testSetRefs) &&
        Objects.equals(this.testRunModel, createTestRunFromTestSetsRequest.testRunModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testSetRefs, testRunModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTestRunFromTestSetsRequest {\n");
    sb.append("    testSetRefs: ").append(toIndentedString(testSetRefs)).append("\n");
    sb.append("    testRunModel: ").append(toIndentedString(testRunModel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

