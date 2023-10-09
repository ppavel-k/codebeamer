

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
 * Multiple Test Runs
 */
@JsonPropertyOrder({
  TestRunResult.JSON_PROPERTY_TEST_RUNS
})
public class TestRunResult {
  public static final String JSON_PROPERTY_TEST_RUNS = "testRuns";
  private List<TrackerItem> testRuns;

  public TestRunResult() {
  }

  public TestRunResult testRuns(List<TrackerItem> testRuns) {
    
    this.testRuns = testRuns;
    return this;
  }

  public TestRunResult addTestRunsItem(TrackerItem testRunsItem) {
    if (this.testRuns == null) {
      this.testRuns = new ArrayList<>();
    }
    this.testRuns.add(testRunsItem);
    return this;
  }

   /**
   * Get testRuns
   * @return testRuns
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TEST_RUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItem> getTestRuns() {
    return testRuns;
  }


  @JsonProperty(JSON_PROPERTY_TEST_RUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestRuns(List<TrackerItem> testRuns) {
    this.testRuns = testRuns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRunResult testRunResult = (TestRunResult) o;
    return Objects.equals(this.testRuns, testRunResult.testRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testRuns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestRunResult {\n");
    sb.append("    testRuns: ").append(toIndentedString(testRuns)).append("\n");
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

