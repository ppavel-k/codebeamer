

package codebeamer.rampup.client.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.Nullable;

/**
 * Project member permissions
 */
@JsonPropertyOrder({
  ProjectMemberPermissions.JSON_PROPERTY_ROLES
})
public class ProjectMemberPermissions {
  public static final String JSON_PROPERTY_ROLES = "roles";
  private List<RoleReference> roles = new ArrayList<>();

  public ProjectMemberPermissions() {
  }

  public ProjectMemberPermissions roles(List<RoleReference> roles) {
    this.roles = roles;
    return this;
  }

  public ProjectMemberPermissions addRolesItem(RoleReference rolesItem) {
    if (this.roles == null || !this.roles.isEmpty()) {
      this.roles = new ArrayList<>();
    }
    try {
      this.roles.add(rolesItem);
    } catch (NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Role references
   * @return roles
  **/
  @Nullable
  @JsonIgnore
  public List<RoleReference> getRoles() {
        return roles.isEmpty() ? null : roles;
  }

  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public void setRoles(List<RoleReference> roles) {
    this.roles = roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectMemberPermissions projectMemberPermissions = (ProjectMemberPermissions) o;
    return equalsNullable(this.roles, projectMemberPermissions.roles);
  }


  private static <T> boolean equalsNullable(List<RoleReference> a, List<RoleReference> b) {
    return a == b || (a != null && b != null && a.isEmpty() && b.isEmpty() && Objects.deepEquals(a, b));
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles);
  }

  @Override
  public String toString() {
    String sb = "class ProjectMemberPermissions {\n" +
            "    roles: " + toIndentedString(roles) + "\n" +
            "}";
    return sb;
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

