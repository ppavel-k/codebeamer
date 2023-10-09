

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.NonNull;

/**
 * ProjectFilteringRequest
 */
@JsonPropertyOrder({
  ProjectFilteringRequest.JSON_PROPERTY_KEY_NAME
})
public class ProjectFilteringRequest {
  public static final String JSON_PROPERTY_KEY_NAME = "keyName";
  private String keyName;

  public ProjectFilteringRequest() {
  }

  public ProjectFilteringRequest keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * Key name of the project
   * @return keyName
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_KEY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKeyName() {
    return keyName;
  }


  @JsonProperty(JSON_PROPERTY_KEY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectFilteringRequest projectFilteringRequest = (ProjectFilteringRequest) o;
    return Objects.equals(this.keyName, projectFilteringRequest.keyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectFilteringRequest {\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
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

