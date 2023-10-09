

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;

/**
 * Field permissions by role for specific status
 */
@JsonPropertyOrder({
  TrackerFieldStatusPermissions.JSON_PROPERTY_STATUS,
  TrackerFieldStatusPermissions.JSON_PROPERTY_PERMISSIONS
})
public class TrackerFieldStatusPermissions {
  public static final String JSON_PROPERTY_STATUS = "status";
  private ChoiceOptionReference status;

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private List<AccessPermission> permissions;

  public TrackerFieldStatusPermissions() {
  }

  public TrackerFieldStatusPermissions status(ChoiceOptionReference status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChoiceOptionReference getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(ChoiceOptionReference status) {
    this.status = status;
  }


  public TrackerFieldStatusPermissions permissions(List<AccessPermission> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public TrackerFieldStatusPermissions addPermissionsItem(AccessPermission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Access permissions by role
   * @return permissions
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccessPermission> getPermissions() {
    return permissions;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermissions(List<AccessPermission> permissions) {
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
    TrackerFieldStatusPermissions trackerFieldStatusPermissions = (TrackerFieldStatusPermissions) o;
    return Objects.equals(this.status, trackerFieldStatusPermissions.status) &&
        Objects.equals(this.permissions, trackerFieldStatusPermissions.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerFieldStatusPermissions {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

