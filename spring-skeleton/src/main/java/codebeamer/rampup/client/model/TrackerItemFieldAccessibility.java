

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
 * Accessibilities of fields
 */
@JsonPropertyOrder({
  TrackerItemFieldAccessibility.JSON_PROPERTY_FIELD,
  TrackerItemFieldAccessibility.JSON_PROPERTY_VISIBLE,
  TrackerItemFieldAccessibility.JSON_PROPERTY_MANDATORY,
  TrackerItemFieldAccessibility.JSON_PROPERTY_EDITABLE
})
public class TrackerItemFieldAccessibility {
  public static final String JSON_PROPERTY_FIELD = "field";
  private FieldReference field;

  public static final String JSON_PROPERTY_VISIBLE = "visible";
  private Boolean visible;

  public static final String JSON_PROPERTY_MANDATORY = "mandatory";
  private Boolean mandatory;

  public static final String JSON_PROPERTY_EDITABLE = "editable";
  private Boolean editable;

  public TrackerItemFieldAccessibility() {
  }

  public TrackerItemFieldAccessibility field(FieldReference field) {
    
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


  public TrackerItemFieldAccessibility visible(Boolean visible) {
    
    this.visible = visible;
    return this;
  }

   /**
   * Field is visible
   * @return visible
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVisible() {
    return visible;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  public TrackerItemFieldAccessibility mandatory(Boolean mandatory) {
    
    this.mandatory = mandatory;
    return this;
  }

   /**
   * Field is mandatory
   * @return mandatory
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MANDATORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMandatory() {
    return mandatory;
  }


  @JsonProperty(JSON_PROPERTY_MANDATORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }


  public TrackerItemFieldAccessibility editable(Boolean editable) {
    
    this.editable = editable;
    return this;
  }

   /**
   * Field is editable
   * @return editable
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_EDITABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEditable() {
    return editable;
  }


  @JsonProperty(JSON_PROPERTY_EDITABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemFieldAccessibility trackerItemFieldAccessibility = (TrackerItemFieldAccessibility) o;
    return Objects.equals(this.field, trackerItemFieldAccessibility.field) &&
        Objects.equals(this.visible, trackerItemFieldAccessibility.visible) &&
        Objects.equals(this.mandatory, trackerItemFieldAccessibility.mandatory) &&
        Objects.equals(this.editable, trackerItemFieldAccessibility.editable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, visible, mandatory, editable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemFieldAccessibility {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
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

