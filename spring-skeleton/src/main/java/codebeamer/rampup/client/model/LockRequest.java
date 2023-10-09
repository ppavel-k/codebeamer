

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
 * Configuration to request a lock. If &#39;hard&#39; is true, duration must be null, or unspecified.
 */
@JsonPropertyOrder({
  LockRequest.JSON_PROPERTY_HARD,
  LockRequest.JSON_PROPERTY_DURATION
})
public class LockRequest {
  public static final String JSON_PROPERTY_HARD = "hard";
  private Boolean hard;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private String duration;

  public LockRequest() {
  }

  public LockRequest hard(Boolean hard) {
    
    this.hard = hard;
    return this;
  }

   /**
   * Whether the lock should be hard
   * @return hard
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_HARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHard() {
    return hard;
  }


  @JsonProperty(JSON_PROPERTY_HARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHard(Boolean hard) {
    this.hard = hard;
  }


  public LockRequest duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * If not a hard lock, the duration specified in time notation
   * @return duration
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(String duration) {
    this.duration = duration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LockRequest lockRequest = (LockRequest) o;
    return Objects.equals(this.hard, lockRequest.hard) &&
        Objects.equals(this.duration, lockRequest.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hard, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockRequest {\n");
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

