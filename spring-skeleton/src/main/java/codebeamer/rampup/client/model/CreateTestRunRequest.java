

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.Nullable;

/**
 * Request model to create a test run from multiple test cases or 1 test set
 */
@JsonPropertyOrder({
  CreateTestRunRequest.JSON_PROPERTY_TEST_CASE_IDS,
  CreateTestRunRequest.JSON_PROPERTY_TEST_SET_IDS,
  CreateTestRunRequest.JSON_PROPERTY_TEST_RUN_MODEL,
  CreateTestRunRequest.JSON_PROPERTY_TEST_SET_REFS,
  CreateTestRunRequest.JSON_PROPERTY_TEST_CASE_REFS
})
public class CreateTestRunRequest {
  public static final String JSON_PROPERTY_TEST_CASE_IDS = "testCaseIds";
  private List<TrackerItemReference> testCaseIds;

  public static final String JSON_PROPERTY_TEST_SET_IDS = "testSetIds";
  private List<TrackerItemReference> testSetIds;

  public static final String JSON_PROPERTY_TEST_RUN_MODEL = "testRunModel";
  private TrackerItem testRunModel;

  public static final String JSON_PROPERTY_TEST_SET_REFS = "testSetRefs";
  private List<TrackerItemReference> testSetRefs;

  public static final String JSON_PROPERTY_TEST_CASE_REFS = "testCaseRefs";
  private List<TrackerItemReference> testCaseRefs;

  public CreateTestRunRequest() {
  }

  public CreateTestRunRequest testCaseIds(List<TrackerItemReference> testCaseIds) {
    
    this.testCaseIds = testCaseIds;
    return this;
  }

  public CreateTestRunRequest addTestCaseIdsItem(TrackerItemReference testCaseIdsItem) {
    if (this.testCaseIds == null) {
      this.testCaseIds = new ArrayList<>();
    }
    this.testCaseIds.add(testCaseIdsItem);
    return this;
  }

   /**
   * Get testCaseIds
   * @return testCaseIds
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TEST_CASE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemReference> getTestCaseIds() {
    return testCaseIds;
  }


  @JsonProperty(JSON_PROPERTY_TEST_CASE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestCaseIds(List<TrackerItemReference> testCaseIds) {
    this.testCaseIds = testCaseIds;
  }


  public CreateTestRunRequest testSetIds(List<TrackerItemReference> testSetIds) {
    
    this.testSetIds = testSetIds;
    return this;
  }

  public CreateTestRunRequest addTestSetIdsItem(TrackerItemReference testSetIdsItem) {
    if (this.testSetIds == null) {
      this.testSetIds = new ArrayList<>();
    }
    this.testSetIds.add(testSetIdsItem);
    return this;
  }

   /**
   * Get testSetIds
   * @return testSetIds
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TEST_SET_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemReference> getTestSetIds() {
    return testSetIds;
  }


  @JsonProperty(JSON_PROPERTY_TEST_SET_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestSetIds(List<TrackerItemReference> testSetIds) {
    this.testSetIds = testSetIds;
  }


  public CreateTestRunRequest testRunModel(TrackerItem testRunModel) {
    
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


  public CreateTestRunRequest testSetRefs(List<TrackerItemReference> testSetRefs) {
    
    this.testSetRefs = testSetRefs;
    return this;
  }

  public CreateTestRunRequest addTestSetRefsItem(TrackerItemReference testSetRefsItem) {
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


  public CreateTestRunRequest testCaseRefs(List<TrackerItemReference> testCaseRefs) {
    
    this.testCaseRefs = testCaseRefs;
    return this;
  }

  public CreateTestRunRequest addTestCaseRefsItem(TrackerItemReference testCaseRefsItem) {
    if (this.testCaseRefs == null) {
      this.testCaseRefs = new ArrayList<>();
    }
    this.testCaseRefs.add(testCaseRefsItem);
    return this;
  }

   /**
   * Test case ids to include into the test run
   * @return testCaseRefs
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TEST_CASE_REFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemReference> getTestCaseRefs() {
    return testCaseRefs;
  }


  @JsonProperty(JSON_PROPERTY_TEST_CASE_REFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestCaseRefs(List<TrackerItemReference> testCaseRefs) {
    this.testCaseRefs = testCaseRefs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTestRunRequest createTestRunRequest = (CreateTestRunRequest) o;
    return Objects.equals(this.testCaseIds, createTestRunRequest.testCaseIds) &&
        Objects.equals(this.testSetIds, createTestRunRequest.testSetIds) &&
        Objects.equals(this.testRunModel, createTestRunRequest.testRunModel) &&
        Objects.equals(this.testSetRefs, createTestRunRequest.testSetRefs) &&
        Objects.equals(this.testCaseRefs, createTestRunRequest.testCaseRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testCaseIds, testSetIds, testRunModel, testSetRefs, testCaseRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTestRunRequest {\n");
    sb.append("    testCaseIds: ").append(toIndentedString(testCaseIds)).append("\n");
    sb.append("    testSetIds: ").append(toIndentedString(testSetIds)).append("\n");
    sb.append("    testRunModel: ").append(toIndentedString(testRunModel)).append("\n");
    sb.append("    testSetRefs: ").append(toIndentedString(testSetRefs)).append("\n");
    sb.append("    testCaseRefs: ").append(toIndentedString(testCaseRefs)).append("\n");
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

