

package codebeamer.rampup.client.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.Nullable;

/**
 * Basic properties of maintenance mode
 */
@JsonPropertyOrder({
  MaintenanceMode.JSON_PROPERTY_SYSTEM_MODE,
  MaintenanceMode.JSON_PROPERTY_PROPERTIES
})
public class MaintenanceMode {
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

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private MaintenanceModeProperties properties;

  public MaintenanceMode() {
  }

  public MaintenanceMode systemMode(SystemModeEnum systemMode) {
    
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


  public MaintenanceMode properties(MaintenanceModeProperties properties) {
    this.properties = properties;
    
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @Nullable
  @JsonIgnore

  public MaintenanceModeProperties getProperties() {
        return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  public void setProperties_JsonNullable(MaintenanceModeProperties properties) {
    this.properties = properties;
  }

  public void setProperties(MaintenanceModeProperties properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceMode maintenanceMode = (MaintenanceMode) o;
    return Objects.equals(this.systemMode, maintenanceMode.systemMode) &&
        equalsNullable(this.properties, maintenanceMode.properties);
  }

  private static <T> boolean equalsNullable(MaintenanceModeProperties a, MaintenanceModeProperties b) {
    return a == b || (a != null && b != null && Objects.deepEquals(a, b));
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemMode, hashCodeNullable(properties));
  }

  private static <T> int hashCodeNullable(MaintenanceModeProperties a) {
    if (a == null) {
      return 1;
    }
    return Arrays.deepHashCode(new Object[]{a});
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceMode {\n");
    sb.append("    systemMode: ").append(toIndentedString(systemMode)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

