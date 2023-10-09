

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
 * Access permission of specific role
 */
@JsonPropertyOrder({
  AccessPermission.JSON_PROPERTY_ROLE,
  AccessPermission.JSON_PROPERTY_FIELD,
  AccessPermission.JSON_PROPERTY_PROJECT,
  AccessPermission.JSON_PROPERTY_ACCESS_LEVEL
})
public class AccessPermission {
  public static final String JSON_PROPERTY_ROLE = "role";
  private RoleReference role;

  public static final String JSON_PROPERTY_FIELD = "field";
  private FieldReference field;

  public static final String JSON_PROPERTY_PROJECT = "project";
  private ProjectReference project;

  /**
   * Access level
   */
  public enum AccessLevelEnum {
    NONE("NONE"),
    
    READ("READ"),
    
    WRITE("WRITE");

    private String value;

    AccessLevelEnum(String value) {
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
    public static AccessLevelEnum fromValue(String value) {
      for (AccessLevelEnum b : AccessLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACCESS_LEVEL = "accessLevel";
  private AccessLevelEnum accessLevel;

  public AccessPermission() {
  }

  public AccessPermission role(RoleReference role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoleReference getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(RoleReference role) {
    this.role = role;
  }


  public AccessPermission field(FieldReference field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FieldReference getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField(FieldReference field) {
    this.field = field;
  }


  public AccessPermission project(ProjectReference project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProjectReference getProject() {
    return project;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProject(ProjectReference project) {
    this.project = project;
  }


  public AccessPermission accessLevel(AccessLevelEnum accessLevel) {
    
    this.accessLevel = accessLevel;
    return this;
  }

   /**
   * Access level
   * @return accessLevel
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccessLevelEnum getAccessLevel() {
    return accessLevel;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessLevel(AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessPermission accessPermission = (AccessPermission) o;
    return Objects.equals(this.role, accessPermission.role) &&
        Objects.equals(this.field, accessPermission.field) &&
        Objects.equals(this.project, accessPermission.project) &&
        Objects.equals(this.accessLevel, accessPermission.accessLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, field, project, accessLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessPermission {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
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

