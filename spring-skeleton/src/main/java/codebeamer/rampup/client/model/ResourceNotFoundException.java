

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.Nullable;

/**
 * ResourceNotFoundException
 */
@JsonPropertyOrder({
  ResourceNotFoundException.JSON_PROPERTY_MESSAGE,
  ResourceNotFoundException.JSON_PROPERTY_RESOURCE_URI
})
public class ResourceNotFoundException {
  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_RESOURCE_URI = "resourceUri";
  private String resourceUri;

  public ResourceNotFoundException() {
  }

  public ResourceNotFoundException message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public ResourceNotFoundException resourceUri(String resourceUri) {
    
    this.resourceUri = resourceUri;
    return this;
  }

   /**
   * Get resourceUri
   * @return resourceUri
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResourceUri() {
    return resourceUri;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceNotFoundException resourceNotFoundException = (ResourceNotFoundException) o;
    return Objects.equals(this.message, resourceNotFoundException.message) &&
        Objects.equals(this.resourceUri, resourceNotFoundException.resourceUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, resourceUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceNotFoundException {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
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

