

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
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * Request model to update Test Run&#39;s result for a Test Case
 */
@JsonPropertyOrder({
  UpdateTestCaseRunRequest.JSON_PROPERTY_TEST_CASE_REFERENCE,
  UpdateTestCaseRunRequest.JSON_PROPERTY_RESULT,
  UpdateTestCaseRunRequest.JSON_PROPERTY_CONCLUSION,
  UpdateTestCaseRunRequest.JSON_PROPERTY_RUN_TIME,
  UpdateTestCaseRunRequest.JSON_PROPERTY_REPORTED_BUG_REFERENCES,
  UpdateTestCaseRunRequest.JSON_PROPERTY_CUSTOM_FIELDS
})
public class UpdateTestCaseRunRequest {
  public static final String JSON_PROPERTY_TEST_CASE_REFERENCE = "testCaseReference";
  private TrackerItemReference testCaseReference;

  /**
   * Result of the test case
   */
  public enum ResultEnum {
    PASSED("PASSED"),
    
    FAILED("FAILED"),
    
    BLOCKED("BLOCKED");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResultEnum fromValue(String value) {
      for (ResultEnum b : ResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RESULT = "result";
  private ResultEnum result;

  public static final String JSON_PROPERTY_CONCLUSION = "conclusion";
  private String conclusion;

  public static final String JSON_PROPERTY_RUN_TIME = "runTime";
  private Integer runTime;

  public static final String JSON_PROPERTY_REPORTED_BUG_REFERENCES = "reportedBugReferences";
  private List<TrackerItemReference> reportedBugReferences;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  private List<AbstractFieldValue> customFields;

  public UpdateTestCaseRunRequest() {
  }

  public UpdateTestCaseRunRequest testCaseReference(TrackerItemReference testCaseReference) {
    
    this.testCaseReference = testCaseReference;
    return this;
  }

   /**
   * Get testCaseReference
   * @return testCaseReference
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_TEST_CASE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TrackerItemReference getTestCaseReference() {
    return testCaseReference;
  }


  @JsonProperty(JSON_PROPERTY_TEST_CASE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTestCaseReference(TrackerItemReference testCaseReference) {
    this.testCaseReference = testCaseReference;
  }


  public UpdateTestCaseRunRequest result(ResultEnum result) {
    
    this.result = result;
    return this;
  }

   /**
   * Result of the test case
   * @return result
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResultEnum getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public UpdateTestCaseRunRequest conclusion(String conclusion) {
    
    this.conclusion = conclusion;
    return this;
  }

   /**
   * Optional conclusion text
   * @return conclusion
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CONCLUSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConclusion() {
    return conclusion;
  }


  @JsonProperty(JSON_PROPERTY_CONCLUSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConclusion(String conclusion) {
    this.conclusion = conclusion;
  }


  public UpdateTestCaseRunRequest runTime(Integer runTime) {
    
    this.runTime = runTime;
    return this;
  }

   /**
   * Optional runtime in seconds
   * @return runTime
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_RUN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRunTime() {
    return runTime;
  }


  @JsonProperty(JSON_PROPERTY_RUN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRunTime(Integer runTime) {
    this.runTime = runTime;
  }


  public UpdateTestCaseRunRequest reportedBugReferences(List<TrackerItemReference> reportedBugReferences) {
    
    this.reportedBugReferences = reportedBugReferences;
    return this;
  }

  public UpdateTestCaseRunRequest addReportedBugReferencesItem(TrackerItemReference reportedBugReferencesItem) {
    if (this.reportedBugReferences == null) {
      this.reportedBugReferences = new ArrayList<>();
    }
    this.reportedBugReferences.add(reportedBugReferencesItem);
    return this;
  }

   /**
   * Optional reference list of Bugs attached to the Test result
   * @return reportedBugReferences
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REPORTED_BUG_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemReference> getReportedBugReferences() {
    return reportedBugReferences;
  }


  @JsonProperty(JSON_PROPERTY_REPORTED_BUG_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportedBugReferences(List<TrackerItemReference> reportedBugReferences) {
    this.reportedBugReferences = reportedBugReferences;
  }


  public UpdateTestCaseRunRequest customFields(List<AbstractFieldValue> customFields) {
    
    this.customFields = customFields;
    return this;
  }

  public UpdateTestCaseRunRequest addCustomFieldsItem(AbstractFieldValue customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Optional field values to set on the Test Run
   * @return customFields
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractFieldValue> getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(List<AbstractFieldValue> customFields) {
    this.customFields = customFields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTestCaseRunRequest updateTestCaseRunRequest = (UpdateTestCaseRunRequest) o;
    return Objects.equals(this.testCaseReference, updateTestCaseRunRequest.testCaseReference) &&
        Objects.equals(this.result, updateTestCaseRunRequest.result) &&
        Objects.equals(this.conclusion, updateTestCaseRunRequest.conclusion) &&
        Objects.equals(this.runTime, updateTestCaseRunRequest.runTime) &&
        Objects.equals(this.reportedBugReferences, updateTestCaseRunRequest.reportedBugReferences) &&
        Objects.equals(this.customFields, updateTestCaseRunRequest.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testCaseReference, result, conclusion, runTime, reportedBugReferences, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTestCaseRunRequest {\n");
    sb.append("    testCaseReference: ").append(toIndentedString(testCaseReference)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
    sb.append("    runTime: ").append(toIndentedString(runTime)).append("\n");
    sb.append("    reportedBugReferences: ").append(toIndentedString(reportedBugReferences)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

