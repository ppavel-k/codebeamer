

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
 * All field permissions by role for specific status
 */
@JsonPropertyOrder({
  TrackerFieldsStatusPermissions.JSON_PROPERTY_PERMISSIONS
})
public class TrackerFieldsStatusPermissions {
  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private List<TrackerFieldPermissions> permissions;

  public TrackerFieldsStatusPermissions() {
  }

  public TrackerFieldsStatusPermissions permissions(List<TrackerFieldPermissions> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public TrackerFieldsStatusPermissions addPermissionsItem(TrackerFieldPermissions permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Permissions
   * @return permissions
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerFieldPermissions> getPermissions() {
    return permissions;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermissions(List<TrackerFieldPermissions> permissions) {
    this.permissions = permissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerFieldsStatusPermissions trackerFieldsStatusPermissions = (TrackerFieldsStatusPermissions) o;
    return Objects.equals(this.permissions, trackerFieldsStatusPermissions.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerFieldsStatusPermissions {\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

