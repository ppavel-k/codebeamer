

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;

/**
 * Holds the details of a failed operation
 */
@JsonPropertyOrder({
  FailedOperation.JSON_PROPERTY_ID,
  FailedOperation.JSON_PROPERTY_EXCEPTION_MESSAGE
})
public class FailedOperation {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_EXCEPTION_MESSAGE = "exceptionMessage";
  private String exceptionMessage;

  public FailedOperation() {
  }

  public FailedOperation id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Entity id
   * @return id
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public FailedOperation exceptionMessage(String exceptionMessage) {
    
    this.exceptionMessage = exceptionMessage;
    return this;
  }

   /**
   * Exception message
   * @return exceptionMessage
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_EXCEPTION_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExceptionMessage() {
    return exceptionMessage;
  }


  @JsonProperty(JSON_PROPERTY_EXCEPTION_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExceptionMessage(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedOperation failedOperation = (FailedOperation) o;
    return Objects.equals(this.id, failedOperation.id) &&
        Objects.equals(this.exceptionMessage, failedOperation.exceptionMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, exceptionMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedOperation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    exceptionMessage: ").append(toIndentedString(exceptionMessage)).append("\n");
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

