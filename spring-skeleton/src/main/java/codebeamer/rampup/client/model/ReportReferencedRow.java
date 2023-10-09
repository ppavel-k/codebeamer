

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
 * Result row having references.
 */
@JsonPropertyOrder({
  ReportReferencedRow.JSON_PROPERTY_ITEM_REF,
  ReportReferencedRow.JSON_PROPERTY_CELLS,
  ReportReferencedRow.JSON_PROPERTY_OUTLINE_LEVEL,
  ReportReferencedRow.JSON_PROPERTY_IS_REAL_RESULT,
  ReportReferencedRow.JSON_PROPERTY_REFERENCES
})
public class ReportReferencedRow {
  public static final String JSON_PROPERTY_ITEM_REF = "itemRef";
  private ReportItemReference itemRef;

  public static final String JSON_PROPERTY_CELLS = "cells";
  private List<ReportCell> cells;

  public static final String JSON_PROPERTY_OUTLINE_LEVEL = "outlineLevel";
  private Integer outlineLevel;

  public static final String JSON_PROPERTY_IS_REAL_RESULT = "isRealResult";
  private Boolean isRealResult;

  public static final String JSON_PROPERTY_REFERENCES = "references";
  private ReportReferenceLevel references;

  public ReportReferencedRow() {
  }

  public ReportReferencedRow itemRef(ReportItemReference itemRef) {
    
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


  public ReportReferencedRow cells(List<ReportCell> cells) {
    
    this.cells = cells;
    return this;
  }

  public ReportReferencedRow addCellsItem(ReportCell cellsItem) {
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


  public ReportReferencedRow outlineLevel(Integer outlineLevel) {
    
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


  public ReportReferencedRow isRealResult(Boolean isRealResult) {
    
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


  public ReportReferencedRow references(ReportReferenceLevel references) {
    
    this.references = references;
    return this;
  }

   /**
   * Get references
   * @return references
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportReferenceLevel getReferences() {
    return references;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferences(ReportReferenceLevel references) {
    this.references = references;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportReferencedRow reportReferencedRow = (ReportReferencedRow) o;
    return Objects.equals(this.itemRef, reportReferencedRow.itemRef) &&
        Objects.equals(this.cells, reportReferencedRow.cells) &&
        Objects.equals(this.outlineLevel, reportReferencedRow.outlineLevel) &&
        Objects.equals(this.isRealResult, reportReferencedRow.isRealResult) &&
        Objects.equals(this.references, reportReferencedRow.references);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemRef, cells, outlineLevel, isRealResult, references);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportReferencedRow {\n");
    sb.append("    itemRef: ").append(toIndentedString(itemRef)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    outlineLevel: ").append(toIndentedString(outlineLevel)).append("\n");
    sb.append("    isRealResult: ").append(toIndentedString(isRealResult)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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

