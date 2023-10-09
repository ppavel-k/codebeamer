

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
 * Basic properties of system status
 */
@JsonPropertyOrder({
  SystemStatus.JSON_PROPERTY_SYSTEM_MODE
})
public class SystemStatus {
  /**
   * System mode
   */
  public enum SystemModeEnum {
    NORMAL("NORMAL"),
    
    MAINTENANCE("MAINTENANCE");

    private String value;

    SystemModeEnum(String value) {
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
    public static SystemModeEnum fromValue(String value) {
      for (SystemModeEnum b : SystemModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SYSTEM_MODE = "systemMode";
  private SystemModeEnum systemMode;

  public SystemStatus() {
  }

  public SystemStatus systemMode(SystemModeEnum systemMode) {
    
    this.systemMode = systemMode;
    return this;
  }

   /**
   * System mode
   * @return systemMode
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SYSTEM_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SystemModeEnum getSystemMode() {
    return systemMode;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemMode(SystemModeEnum systemMode) {
    this.systemMode = systemMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemStatus systemStatus = (SystemStatus) o;
    return Objects.equals(this.systemMode, systemStatus.systemMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemStatus {\n");
    sb.append("    systemMode: ").append(toIndentedString(systemMode)).append("\n");
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

