

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
 * Cell value for a column.
 */
@JsonPropertyOrder({
  ReportCell.JSON_PROPERTY_COLUMN_REF,
  ReportCell.JSON_PROPERTY_VALUE
})
public class ReportCell {
  public static final String JSON_PROPERTY_COLUMN_REF = "columnRef";
  private String columnRef;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value;

  public ReportCell() {
  }

  public ReportCell columnRef(String columnRef) {
    
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


  public ReportCell value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * Cell value
   * @return value
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Object value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportCell reportCell = (ReportCell) o;
    return Objects.equals(this.columnRef, reportCell.columnRef) &&
        Objects.equals(this.value, reportCell.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnRef, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportCell {\n");
    sb.append("    columnRef: ").append(toIndentedString(columnRef)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

