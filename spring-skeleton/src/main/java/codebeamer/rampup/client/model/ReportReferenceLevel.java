

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
 * Reference results for an item.
 */
@JsonPropertyOrder({
  ReportReferenceLevel.JSON_PROPERTY_COLUMNS,
  ReportReferenceLevel.JSON_PROPERTY_UPSTREAM_REFERENCE_ROWS,
  ReportReferenceLevel.JSON_PROPERTY_DOWNSTREAM_REFERENCE_ROWS,
  ReportReferenceLevel.JSON_PROPERTY_REFERENCE_LEVEL
})
public class ReportReferenceLevel {
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<ReportColumn> columns;

  public static final String JSON_PROPERTY_UPSTREAM_REFERENCE_ROWS = "upstreamReferenceRows";
  private List<ReportReferencedRow> upstreamReferenceRows;

  public static final String JSON_PROPERTY_DOWNSTREAM_REFERENCE_ROWS = "downstreamReferenceRows";
  private List<ReportReferencedRow> downstreamReferenceRows;

  public static final String JSON_PROPERTY_REFERENCE_LEVEL = "referenceLevel";
  private Integer referenceLevel;

  public ReportReferenceLevel() {
  }

  public ReportReferenceLevel columns(List<ReportColumn> columns) {
    
    this.columns = columns;
    return this;
  }

  public ReportReferenceLevel addColumnsItem(ReportColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Columns to show on this reference level.
   * @return columns
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReportColumn> getColumns() {
    return columns;
  }


  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColumns(List<ReportColumn> columns) {
    this.columns = columns;
  }


  public ReportReferenceLevel upstreamReferenceRows(List<ReportReferencedRow> upstreamReferenceRows) {
    
    this.upstreamReferenceRows = upstreamReferenceRows;
    return this;
  }

  public ReportReferenceLevel addUpstreamReferenceRowsItem(ReportReferencedRow upstreamReferenceRowsItem) {
    if (this.upstreamReferenceRows == null) {
      this.upstreamReferenceRows = new ArrayList<>();
    }
    this.upstreamReferenceRows.add(upstreamReferenceRowsItem);
    return this;
  }

   /**
   * Upstream reference results.
   * @return upstreamReferenceRows
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_UPSTREAM_REFERENCE_ROWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReportReferencedRow> getUpstreamReferenceRows() {
    return upstreamReferenceRows;
  }


  @JsonProperty(JSON_PROPERTY_UPSTREAM_REFERENCE_ROWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpstreamReferenceRows(List<ReportReferencedRow> upstreamReferenceRows) {
    this.upstreamReferenceRows = upstreamReferenceRows;
  }


  public ReportReferenceLevel downstreamReferenceRows(List<ReportReferencedRow> downstreamReferenceRows) {
    
    this.downstreamReferenceRows = downstreamReferenceRows;
    return this;
  }

  public ReportReferenceLevel addDownstreamReferenceRowsItem(ReportReferencedRow downstreamReferenceRowsItem) {
    if (this.downstreamReferenceRows == null) {
      this.downstreamReferenceRows = new ArrayList<>();
    }
    this.downstreamReferenceRows.add(downstreamReferenceRowsItem);
    return this;
  }

   /**
   * Downstream reference results.
   * @return downstreamReferenceRows
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_DOWNSTREAM_REFERENCE_ROWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReportReferencedRow> getDownstreamReferenceRows() {
    return downstreamReferenceRows;
  }


  @JsonProperty(JSON_PROPERTY_DOWNSTREAM_REFERENCE_ROWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownstreamReferenceRows(List<ReportReferencedRow> downstreamReferenceRows) {
    this.downstreamReferenceRows = downstreamReferenceRows;
  }


  public ReportReferenceLevel referenceLevel(Integer referenceLevel) {
    
    this.referenceLevel = referenceLevel;
    return this;
  }

   /**
   * Reference level.
   * @return referenceLevel
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReferenceLevel() {
    return referenceLevel;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceLevel(Integer referenceLevel) {
    this.referenceLevel = referenceLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportReferenceLevel reportReferenceLevel = (ReportReferenceLevel) o;
    return Objects.equals(this.columns, reportReferenceLevel.columns) &&
        Objects.equals(this.upstreamReferenceRows, reportReferenceLevel.upstreamReferenceRows) &&
        Objects.equals(this.downstreamReferenceRows, reportReferenceLevel.downstreamReferenceRows) &&
        Objects.equals(this.referenceLevel, reportReferenceLevel.referenceLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, upstreamReferenceRows, downstreamReferenceRows, referenceLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportReferenceLevel {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    upstreamReferenceRows: ").append(toIndentedString(upstreamReferenceRows)).append("\n");
    sb.append("    downstreamReferenceRows: ").append(toIndentedString(downstreamReferenceRows)).append("\n");
    sb.append("    referenceLevel: ").append(toIndentedString(referenceLevel)).append("\n");
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

