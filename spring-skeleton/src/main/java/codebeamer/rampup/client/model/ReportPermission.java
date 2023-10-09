

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
 * Access permissions for the report.
 */
@JsonPropertyOrder({
  ReportPermission.JSON_PROPERTY_PROJECT,
  ReportPermission.JSON_PROPERTY_ROLE,
  ReportPermission.JSON_PROPERTY_ACCESS
})
public class ReportPermission {
  public static final String JSON_PROPERTY_PROJECT = "project";
  private ProjectReference project;

  public static final String JSON_PROPERTY_ROLE = "role";
  private RoleReference role;

  /**
   * Access level
   */
  public enum AccessEnum {
    NONE("NONE"),
    
    READ("READ"),
    
    WRITE("WRITE");

    private String value;

    AccessEnum(String value) {
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
    public static AccessEnum fromValue(String value) {
      for (AccessEnum b : AccessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACCESS = "access";
  private AccessEnum access;

  public ReportPermission() {
  }

  public ReportPermission project(ProjectReference project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProjectReference getProject() {
    return project;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProject(ProjectReference project) {
    this.project = project;
  }


  public ReportPermission role(RoleReference role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoleReference getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(RoleReference role) {
    this.role = role;
  }


  public ReportPermission access(AccessEnum access) {
    
    this.access = access;
    return this;
  }

   /**
   * Access level
   * @return access
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccessEnum getAccess() {
    return access;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccess(AccessEnum access) {
    this.access = access;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportPermission reportPermission = (ReportPermission) o;
    return Objects.equals(this.project, reportPermission.project) &&
        Objects.equals(this.role, reportPermission.role) &&
        Objects.equals(this.access, reportPermission.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, role, access);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportPermission {\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
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

