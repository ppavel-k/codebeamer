

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
 * Holds the response of a bulk operation
 */
@JsonPropertyOrder({
  BulkOperationResponse.JSON_PROPERTY_SUCCESSFUL_OPERATIONS_COUNT,
  BulkOperationResponse.JSON_PROPERTY_FAILED_OPERATIONS
})
public class BulkOperationResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL_OPERATIONS_COUNT = "successfulOperationsCount";
  private Integer successfulOperationsCount;

  public static final String JSON_PROPERTY_FAILED_OPERATIONS = "failedOperations";
  private List<FailedOperation> failedOperations;

  public BulkOperationResponse() {
  }

  public BulkOperationResponse successfulOperationsCount(Integer successfulOperationsCount) {
    
    this.successfulOperationsCount = successfulOperationsCount;
    return this;
  }

   /**
   * Count of successful operations
   * @return successfulOperationsCount
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL_OPERATIONS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSuccessfulOperationsCount() {
    return successfulOperationsCount;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESSFUL_OPERATIONS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessfulOperationsCount(Integer successfulOperationsCount) {
    this.successfulOperationsCount = successfulOperationsCount;
  }


  public BulkOperationResponse failedOperations(List<FailedOperation> failedOperations) {
    
    this.failedOperations = failedOperations;
    return this;
  }

  public BulkOperationResponse addFailedOperationsItem(FailedOperation failedOperationsItem) {
    if (this.failedOperations == null) {
      this.failedOperations = new ArrayList<>();
    }
    this.failedOperations.add(failedOperationsItem);
    return this;
  }

   /**
   * List of failed operations
   * @return failedOperations
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FailedOperation> getFailedOperations() {
    return failedOperations;
  }


  @JsonProperty(JSON_PROPERTY_FAILED_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailedOperations(List<FailedOperation> failedOperations) {
    this.failedOperations = failedOperations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkOperationResponse bulkOperationResponse = (BulkOperationResponse) o;
    return Objects.equals(this.successfulOperationsCount, bulkOperationResponse.successfulOperationsCount) &&
        Objects.equals(this.failedOperations, bulkOperationResponse.failedOperations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successfulOperationsCount, failedOperations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOperationResponse {\n");
    sb.append("    successfulOperationsCount: ").append(toIndentedString(successfulOperationsCount)).append("\n");
    sb.append("    failedOperations: ").append(toIndentedString(failedOperations)).append("\n");
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

