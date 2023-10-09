

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
 * TooManyRequestsException
 */
@JsonPropertyOrder({
  TooManyRequestsException.JSON_PROPERTY_MESSAGE,
  TooManyRequestsException.JSON_PROPERTY_RESOURCE_URI,
  TooManyRequestsException.JSON_PROPERTY_RETRY_AFTER_SECOND
})
public class TooManyRequestsException {
  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_RESOURCE_URI = "resourceUri";
  private String resourceUri;

  public static final String JSON_PROPERTY_RETRY_AFTER_SECOND = "retryAfterSecond";
  private Long retryAfterSecond;

  public TooManyRequestsException() {
  }

  public TooManyRequestsException message(String message) {
    
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


  public TooManyRequestsException resourceUri(String resourceUri) {
    
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


  public TooManyRequestsException retryAfterSecond(Long retryAfterSecond) {
    
    this.retryAfterSecond = retryAfterSecond;
    return this;
  }

   /**
   * Get retryAfterSecond
   * @return retryAfterSecond
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_RETRY_AFTER_SECOND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRetryAfterSecond() {
    return retryAfterSecond;
  }


  @JsonProperty(JSON_PROPERTY_RETRY_AFTER_SECOND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetryAfterSecond(Long retryAfterSecond) {
    this.retryAfterSecond = retryAfterSecond;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TooManyRequestsException tooManyRequestsException = (TooManyRequestsException) o;
    return Objects.equals(this.message, tooManyRequestsException.message) &&
        Objects.equals(this.resourceUri, tooManyRequestsException.resourceUri) &&
        Objects.equals(this.retryAfterSecond, tooManyRequestsException.retryAfterSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, resourceUri, retryAfterSecond);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TooManyRequestsException {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
    sb.append("    retryAfterSecond: ").append(toIndentedString(retryAfterSecond)).append("\n");
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

