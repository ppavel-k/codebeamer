

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
 * ResourceUnauthorizedException
 */
@JsonPropertyOrder({
  ResourceUnauthorizedException.JSON_PROPERTY_MESSAGE,
  ResourceUnauthorizedException.JSON_PROPERTY_RESOURCE_URI
})
public class ResourceUnauthorizedException {
  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_RESOURCE_URI = "resourceUri";
  private String resourceUri;

  public ResourceUnauthorizedException() {
  }

  public ResourceUnauthorizedException message(String message) {
    
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


  public ResourceUnauthorizedException resourceUri(String resourceUri) {
    
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
    ResourceUnauthorizedException resourceUnauthorizedException = (ResourceUnauthorizedException) o;
    return Objects.equals(this.message, resourceUnauthorizedException.message) &&
        Objects.equals(this.resourceUri, resourceUnauthorizedException.resourceUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, resourceUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceUnauthorizedException {\n");
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

