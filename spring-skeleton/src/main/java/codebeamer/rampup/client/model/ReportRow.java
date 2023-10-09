

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
 * A row of the report containing cell information.
 */
@JsonPropertyOrder({
  ReportRow.JSON_PROPERTY_ITEM_REF,
  ReportRow.JSON_PROPERTY_CELLS,
  ReportRow.JSON_PROPERTY_OUTLINE_LEVEL,
  ReportRow.JSON_PROPERTY_IS_REAL_RESULT
})
public class ReportRow {
  public static final String JSON_PROPERTY_ITEM_REF = "itemRef";
  private ReportItemReference itemRef;

  public static final String JSON_PROPERTY_CELLS = "cells";
  private List<ReportCell> cells;

  public static final String JSON_PROPERTY_OUTLINE_LEVEL = "outlineLevel";
  private Integer outlineLevel;

  public static final String JSON_PROPERTY_IS_REAL_RESULT = "isRealResult";
  private Boolean isRealResult;

  public ReportRow() {
  }

  public ReportRow itemRef(ReportItemReference itemRef) {
    
    this.itemRef = itemRef;
    return this;
  }

   /**
   * Get itemRef
   * @return itemRef
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ITEM_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportItemReference getItemRef() {
    return itemRef;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemRef(ReportItemReference itemRef) {
    this.itemRef = itemRef;
  }


  public ReportRow cells(List<ReportCell> cells) {
    
    this.cells = cells;
    return this;
  }

  public ReportRow addCellsItem(ReportCell cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<>();
    }
    this.cells.add(cellsItem);
    return this;
  }

   /**
   * Cells in a row.
   * @return cells
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CELLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReportCell> getCells() {
    return cells;
  }


  @JsonProperty(JSON_PROPERTY_CELLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCells(List<ReportCell> cells) {
    this.cells = cells;
  }


  public ReportRow outlineLevel(Integer outlineLevel) {
    
    this.outlineLevel = outlineLevel;
    return this;
  }

   /**
   * Item&#39;s level in the tracker outline.
   * @return outlineLevel
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_OUTLINE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOutlineLevel() {
    return outlineLevel;
  }


  @JsonProperty(JSON_PROPERTY_OUTLINE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutlineLevel(Integer outlineLevel) {
    this.outlineLevel = outlineLevel;
  }


  public ReportRow isRealResult(Boolean isRealResult) {
    
    this.isRealResult = isRealResult;
    return this;
  }

   /**
   * Indicator if the item is a real query result (e.g. not an ancestor item).
   * @return isRealResult
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_IS_REAL_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRealResult() {
    return isRealResult;
  }


  @JsonProperty(JSON_PROPERTY_IS_REAL_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRealResult(Boolean isRealResult) {
    this.isRealResult = isRealResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRow reportRow = (ReportRow) o;
    return Objects.equals(this.itemRef, reportRow.itemRef) &&
        Objects.equals(this.cells, reportRow.cells) &&
        Objects.equals(this.outlineLevel, reportRow.outlineLevel) &&
        Objects.equals(this.isRealResult, reportRow.isRealResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemRef, cells, outlineLevel, isRealResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRow {\n");
    sb.append("    itemRef: ").append(toIndentedString(itemRef)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    outlineLevel: ").append(toIndentedString(outlineLevel)).append("\n");
    sb.append("    isRealResult: ").append(toIndentedString(isRealResult)).append("\n");
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

