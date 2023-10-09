

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
 * Tracker field permissions
 */
@JsonPropertyOrder({
  TrackerFieldPermissions.JSON_PROPERTY_FIELD_REFERENCE,
  TrackerFieldPermissions.JSON_PROPERTY_FIELD_PERMISSIONS
})
public class TrackerFieldPermissions {
  public static final String JSON_PROPERTY_FIELD_REFERENCE = "fieldReference";
  private FieldReference fieldReference;

  public static final String JSON_PROPERTY_FIELD_PERMISSIONS = "fieldPermissions";
  private List<TrackerFieldStatusPermissions> fieldPermissions;

  public TrackerFieldPermissions() {
  }

  public TrackerFieldPermissions fieldReference(FieldReference fieldReference) {
    
    this.fieldReference = fieldReference;
    return this;
  }

   /**
   * Get fieldReference
   * @return fieldReference
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FieldReference getFieldReference() {
    return fieldReference;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldReference(FieldReference fieldReference) {
    this.fieldReference = fieldReference;
  }


  public TrackerFieldPermissions fieldPermissions(List<TrackerFieldStatusPermissions> fieldPermissions) {
    
    this.fieldPermissions = fieldPermissions;
    return this;
  }

  public TrackerFieldPermissions addFieldPermissionsItem(TrackerFieldStatusPermissions fieldPermissionsItem) {
    if (this.fieldPermissions == null) {
      this.fieldPermissions = new ArrayList<>();
    }
    this.fieldPermissions.add(fieldPermissionsItem);
    return this;
  }

   /**
   * Permissions for the given field
   * @return fieldPermissions
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerFieldStatusPermissions> getFieldPermissions() {
    return fieldPermissions;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldPermissions(List<TrackerFieldStatusPermissions> fieldPermissions) {
    this.fieldPermissions = fieldPermissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerFieldPermissions trackerFieldPermissions = (TrackerFieldPermissions) o;
    return Objects.equals(this.fieldReference, trackerFieldPermissions.fieldReference) &&
        Objects.equals(this.fieldPermissions, trackerFieldPermissions.fieldPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldReference, fieldPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerFieldPermissions {\n");
    sb.append("    fieldReference: ").append(toIndentedString(fieldReference)).append("\n");
    sb.append("    fieldPermissions: ").append(toIndentedString(fieldPermissions)).append("\n");
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

