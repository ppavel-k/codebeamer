

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.Nullable;

/**
 * Model that contains permissions connected to roles
 */
@JsonPropertyOrder({
  RoleWithPermissions.JSON_PROPERTY_ROLE,
  RoleWithPermissions.JSON_PROPERTY_TRACKER_PERMISSIONS
})
public class RoleWithPermissions {
  public static final String JSON_PROPERTY_ROLE = "role";
  private RoleReference role;

  public static final String JSON_PROPERTY_TRACKER_PERMISSIONS = "trackerPermissions";
  private List<TrackerPermissionReference> trackerPermissions;

  public RoleWithPermissions() {
  }

  public RoleWithPermissions role(RoleReference role) {
    
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


  public RoleWithPermissions trackerPermissions(List<TrackerPermissionReference> trackerPermissions) {
    
    this.trackerPermissions = trackerPermissions;
    return this;
  }

  public RoleWithPermissions addTrackerPermissionsItem(TrackerPermissionReference trackerPermissionsItem) {
    if (this.trackerPermissions == null) {
      this.trackerPermissions = new ArrayList<>();
    }
    this.trackerPermissions.add(trackerPermissionsItem);
    return this;
  }

   /**
   * Permission for the role
   * @return trackerPermissions
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TRACKER_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerPermissionReference> getTrackerPermissions() {
    return trackerPermissions;
  }


  @JsonProperty(JSON_PROPERTY_TRACKER_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackerPermissions(List<TrackerPermissionReference> trackerPermissions) {
    this.trackerPermissions = trackerPermissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleWithPermissions roleWithPermissions = (RoleWithPermissions) o;
    return Objects.equals(this.role, roleWithPermissions.role) &&
        Objects.equals(this.trackerPermissions, roleWithPermissions.trackerPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, trackerPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleWithPermissions {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    trackerPermissions: ").append(toIndentedString(trackerPermissions)).append("\n");
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

