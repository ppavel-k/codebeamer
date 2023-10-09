

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.NonNull;

/**
 * Settings for a column definition.
 */
@JsonPropertyOrder({
  ReportColumnSettings.JSON_PROPERTY_FIELD,
  ReportColumnSettings.JSON_PROPERTY_COLUMN_INDEX
})
public class ReportColumnSettings {
  public static final String JSON_PROPERTY_FIELD = "field";
  private FieldReference field;

  public static final String JSON_PROPERTY_COLUMN_INDEX = "columnIndex";
  private Integer columnIndex;

  public ReportColumnSettings() {
  }

  public ReportColumnSettings field(FieldReference field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FieldReference getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setField(FieldReference field) {
    this.field = field;
  }


  public ReportColumnSettings columnIndex(Integer columnIndex) {
    
    this.columnIndex = columnIndex;
    return this;
  }

   /**
   * Index of the column in the report table.
   * @return columnIndex
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_COLUMN_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getColumnIndex() {
    return columnIndex;
  }


  @JsonProperty(JSON_PROPERTY_COLUMN_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setColumnIndex(Integer columnIndex) {
    this.columnIndex = columnIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportColumnSettings reportColumnSettings = (ReportColumnSettings) o;
    return Objects.equals(this.field, reportColumnSettings.field) &&
        Objects.equals(this.columnIndex, reportColumnSettings.columnIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, columnIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportColumnSettings {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    columnIndex: ").append(toIndentedString(columnIndex)).append("\n");
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

