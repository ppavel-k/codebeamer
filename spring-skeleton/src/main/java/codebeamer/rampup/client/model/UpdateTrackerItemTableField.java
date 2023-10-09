

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
 * UpdateTrackerItemTableField
 */
@JsonPropertyOrder({
  UpdateTrackerItemTableField.JSON_PROPERTY_ROWS
})
public class UpdateTrackerItemTableField {
  public static final String JSON_PROPERTY_ROWS = "rows";
  private List<List<AbstractFieldValue>> rows;

  public UpdateTrackerItemTableField() {
  }

  public UpdateTrackerItemTableField rows(List<List<AbstractFieldValue>> rows) {
    
    this.rows = rows;
    return this;
  }

  public UpdateTrackerItemTableField addRowsItem(List<AbstractFieldValue> rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Table rows of a tracker table item
   * @return rows
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ROWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<List<AbstractFieldValue>> getRows() {
    return rows;
  }


  @JsonProperty(JSON_PROPERTY_ROWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRows(List<List<AbstractFieldValue>> rows) {
    this.rows = rows;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTrackerItemTableField updateTrackerItemTableField = (UpdateTrackerItemTableField) o;
    return Objects.equals(this.rows, updateTrackerItemTableField.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTrackerItemTableField {\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

