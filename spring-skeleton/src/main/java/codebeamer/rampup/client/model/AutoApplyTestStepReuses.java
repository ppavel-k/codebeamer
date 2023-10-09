

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
 * Specifies which Test Cases are checked for duplicate Steps
 */
@JsonPropertyOrder({
  AutoApplyTestStepReuses.JSON_PROPERTY_TEST_CASES,
  AutoApplyTestStepReuses.JSON_PROPERTY_SCAN_TEST_CASE_LIBRARIES
})
public class AutoApplyTestStepReuses {
  public static final String JSON_PROPERTY_TEST_CASES = "testCases";
  private List<TrackerItemReference> testCases;

  public static final String JSON_PROPERTY_SCAN_TEST_CASE_LIBRARIES = "scanTestCaseLibraries";
  private Boolean scanTestCaseLibraries;

  public AutoApplyTestStepReuses() {
  }

  public AutoApplyTestStepReuses testCases(List<TrackerItemReference> testCases) {
    
    this.testCases = testCases;
    return this;
  }

  public AutoApplyTestStepReuses addTestCasesItem(TrackerItemReference testCasesItem) {
    if (this.testCases == null) {
      this.testCases = new ArrayList<>();
    }
    this.testCases.add(testCasesItem);
    return this;
  }

   /**
   * The Test Cases to find the duplicated steps inside: if these Test Cases has duplicated Steps these will be converted to Step-Reuses.
   * @return testCases
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TEST_CASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemReference> getTestCases() {
    return testCases;
  }


  @JsonProperty(JSON_PROPERTY_TEST_CASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestCases(List<TrackerItemReference> testCases) {
    this.testCases = testCases;
  }


  public AutoApplyTestStepReuses scanTestCaseLibraries(Boolean scanTestCaseLibraries) {
    
    this.scanTestCaseLibraries = scanTestCaseLibraries;
    return this;
  }

   /**
   * If it scans/finds the duplicate Steps in Test Case libraries of the user? Note: that only Reusable Steps will be reused from these libraries!
   * @return scanTestCaseLibraries
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SCAN_TEST_CASE_LIBRARIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getScanTestCaseLibraries() {
    return scanTestCaseLibraries;
  }


  @JsonProperty(JSON_PROPERTY_SCAN_TEST_CASE_LIBRARIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScanTestCaseLibraries(Boolean scanTestCaseLibraries) {
    this.scanTestCaseLibraries = scanTestCaseLibraries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoApplyTestStepReuses autoApplyTestStepReuses = (AutoApplyTestStepReuses) o;
    return Objects.equals(this.testCases, autoApplyTestStepReuses.testCases) &&
        Objects.equals(this.scanTestCaseLibraries, autoApplyTestStepReuses.scanTestCaseLibraries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testCases, scanTestCaseLibraries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoApplyTestStepReuses {\n");
    sb.append("    testCases: ").append(toIndentedString(testCases)).append("\n");
    sb.append("    scanTestCaseLibraries: ").append(toIndentedString(scanTestCaseLibraries)).append("\n");
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

