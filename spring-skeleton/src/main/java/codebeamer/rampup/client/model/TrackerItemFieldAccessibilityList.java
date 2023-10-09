

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
 * TrackerItemFieldAccessibilityList
 */
@JsonPropertyOrder({
  TrackerItemFieldAccessibilityList.JSON_PROPERTY_FIELDS
})
public class TrackerItemFieldAccessibilityList {
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<TrackerItemFieldAccessibility> fields;

  public TrackerItemFieldAccessibilityList() {
  }

  public TrackerItemFieldAccessibilityList fields(List<TrackerItemFieldAccessibility> fields) {
    
    this.fields = fields;
    return this;
  }

  public TrackerItemFieldAccessibilityList addFieldsItem(TrackerItemFieldAccessibility fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Accessibilities of fields
   * @return fields
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemFieldAccessibility> getFields() {
    return fields;
  }


  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFields(List<TrackerItemFieldAccessibility> fields) {
    this.fields = fields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemFieldAccessibilityList trackerItemFieldAccessibilityList = (TrackerItemFieldAccessibilityList) o;
    return Objects.equals(this.fields, trackerItemFieldAccessibilityList.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemFieldAccessibilityList {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

