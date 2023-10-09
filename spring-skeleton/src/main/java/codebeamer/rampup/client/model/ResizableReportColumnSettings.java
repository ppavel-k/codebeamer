

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * Settings for a resizeable column definition.
 */
@JsonPropertyOrder({
  ResizableReportColumnSettings.JSON_PROPERTY_FIELD,
  ResizableReportColumnSettings.JSON_PROPERTY_COLUMN_INDEX,
  ResizableReportColumnSettings.JSON_PROPERTY_COLUMN_WIDTH_PERCENTAGE
})
public class ResizableReportColumnSettings {
  public static final String JSON_PROPERTY_FIELD = "field";
  private FieldReference field;

  public static final String JSON_PROPERTY_COLUMN_INDEX = "columnIndex";
  private Integer columnIndex;

  public static final String JSON_PROPERTY_COLUMN_WIDTH_PERCENTAGE = "columnWidthPercentage";
  private Double columnWidthPercentage;

  public ResizableReportColumnSettings() {
  }

  public ResizableReportColumnSettings field(FieldReference field) {
    
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


  public ResizableReportColumnSettings columnIndex(Integer columnIndex) {
    
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


  public ResizableReportColumnSettings columnWidthPercentage(Double columnWidthPercentage) {
    
    this.columnWidthPercentage = columnWidthPercentage;
    return this;
  }

   /**
   * Width of the column in percentage.
   * @return columnWidthPercentage
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN_WIDTH_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getColumnWidthPercentage() {
    return columnWidthPercentage;
  }


  @JsonProperty(JSON_PROPERTY_COLUMN_WIDTH_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColumnWidthPercentage(Double columnWidthPercentage) {
    this.columnWidthPercentage = columnWidthPercentage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResizableReportColumnSettings resizableReportColumnSettings = (ResizableReportColumnSettings) o;
    return Objects.equals(this.field, resizableReportColumnSettings.field) &&
        Objects.equals(this.columnIndex, resizableReportColumnSettings.columnIndex) &&
        Objects.equals(this.columnWidthPercentage, resizableReportColumnSettings.columnWidthPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, columnIndex, columnWidthPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResizableReportColumnSettings {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    columnIndex: ").append(toIndentedString(columnIndex)).append("\n");
    sb.append("    columnWidthPercentage: ").append(toIndentedString(columnWidthPercentage)).append("\n");
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

