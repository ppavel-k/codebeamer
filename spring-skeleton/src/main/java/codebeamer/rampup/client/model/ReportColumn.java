

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.Nullable;

/**
 * Column definition for a report
 */
@JsonPropertyOrder({
  ReportColumn.JSON_PROPERTY_COLUMN_REF,
  ReportColumn.JSON_PROPERTY_FIELD,
  ReportColumn.JSON_PROPERTY_NAME,
  ReportColumn.JSON_PROPERTY_TYPE,
  ReportColumn.JSON_PROPERTY_COLUMN_WIDTH_PERCENTAGE,
  ReportColumn.JSON_PROPERTY_COLUMN_INDEX
})
public class ReportColumn {
  public static final String JSON_PROPERTY_COLUMN_REF = "columnRef";
  private String columnRef;

  public static final String JSON_PROPERTY_FIELD = "field";
  private FieldReference field;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_COLUMN_WIDTH_PERCENTAGE = "columnWidthPercentage";
  private Double columnWidthPercentage;

  public static final String JSON_PROPERTY_COLUMN_INDEX = "columnIndex";
  private Integer columnIndex;

  public ReportColumn() {
  }

  public ReportColumn columnRef(String columnRef) {
    
    this.columnRef = columnRef;
    return this;
  }

   /**
   * Column reference
   * @return columnRef
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColumnRef() {
    return columnRef;
  }


  @JsonProperty(JSON_PROPERTY_COLUMN_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColumnRef(String columnRef) {
    this.columnRef = columnRef;
  }


  public ReportColumn field(FieldReference field) {
    
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


  public ReportColumn name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Column name
   * @return name
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ReportColumn type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Column type
   * @return type
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public ReportColumn columnWidthPercentage(Double columnWidthPercentage) {
    
    this.columnWidthPercentage = columnWidthPercentage;
    return this;
  }

   /**
   * Column width in percentage
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


  public ReportColumn columnIndex(Integer columnIndex) {
    
    this.columnIndex = columnIndex;
    return this;
  }

   /**
   * Column position index in the report.
   * @return columnIndex
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getColumnIndex() {
    return columnIndex;
  }


  @JsonProperty(JSON_PROPERTY_COLUMN_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    ReportColumn reportColumn = (ReportColumn) o;
    return Objects.equals(this.columnRef, reportColumn.columnRef) &&
        Objects.equals(this.field, reportColumn.field) &&
        Objects.equals(this.name, reportColumn.name) &&
        Objects.equals(this.type, reportColumn.type) &&
        Objects.equals(this.columnWidthPercentage, reportColumn.columnWidthPercentage) &&
        Objects.equals(this.columnIndex, reportColumn.columnIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnRef, field, name, type, columnWidthPercentage, columnIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportColumn {\n");
    sb.append("    columnRef: ").append(toIndentedString(columnRef)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    columnWidthPercentage: ").append(toIndentedString(columnWidthPercentage)).append("\n");
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

