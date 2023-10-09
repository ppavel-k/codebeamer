

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
 * Model to contain Test Case run update request models
 */
@JsonPropertyOrder({
  UpdateTestRunRequest.JSON_PROPERTY_UPDATE_REQUEST_MODELS,
  UpdateTestRunRequest.JSON_PROPERTY_PARENT_RESULT_PROPAGATION
})
public class UpdateTestRunRequest {
  public static final String JSON_PROPERTY_UPDATE_REQUEST_MODELS = "updateRequestModels";
  private List<UpdateTestCaseRunRequest> updateRequestModels = new ArrayList<>();

  public static final String JSON_PROPERTY_PARENT_RESULT_PROPAGATION = "parentResultPropagation";
  private Boolean parentResultPropagation = true;

  public UpdateTestRunRequest() {
  }

  public UpdateTestRunRequest updateRequestModels(List<UpdateTestCaseRunRequest> updateRequestModels) {
    
    this.updateRequestModels = updateRequestModels;
    return this;
  }

  public UpdateTestRunRequest addUpdateRequestModelsItem(UpdateTestCaseRunRequest updateRequestModelsItem) {
    if (this.updateRequestModels == null) {
      this.updateRequestModels = new ArrayList<>();
    }
    this.updateRequestModels.add(updateRequestModelsItem);
    return this;
  }

   /**
   * List of update Test Case run request models
   * @return updateRequestModels
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_UPDATE_REQUEST_MODELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<UpdateTestCaseRunRequest> getUpdateRequestModels() {
    return updateRequestModels;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_REQUEST_MODELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdateRequestModels(List<UpdateTestCaseRunRequest> updateRequestModels) {
    this.updateRequestModels = updateRequestModels;
  }


  public UpdateTestRunRequest parentResultPropagation(Boolean parentResultPropagation) {
    
    this.parentResultPropagation = parentResultPropagation;
    return this;
  }

   /**
   * The propagation of the result is enabled for parent Test Run or not
   * @return parentResultPropagation
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_RESULT_PROPAGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getParentResultPropagation() {
    return parentResultPropagation;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_RESULT_PROPAGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentResultPropagation(Boolean parentResultPropagation) {
    this.parentResultPropagation = parentResultPropagation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTestRunRequest updateTestRunRequest = (UpdateTestRunRequest) o;
    return Objects.equals(this.updateRequestModels, updateTestRunRequest.updateRequestModels) &&
        Objects.equals(this.parentResultPropagation, updateTestRunRequest.parentResultPropagation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateRequestModels, parentResultPropagation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTestRunRequest {\n");
    sb.append("    updateRequestModels: ").append(toIndentedString(updateRequestModels)).append("\n");
    sb.append("    parentResultPropagation: ").append(toIndentedString(parentResultPropagation)).append("\n");
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

