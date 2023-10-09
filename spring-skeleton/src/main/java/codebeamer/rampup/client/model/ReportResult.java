

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
 * Report data model
 */
@JsonPropertyOrder({
  ReportResult.JSON_PROPERTY_REPORT,
  ReportResult.JSON_PROPERTY_CB_Q_L,
  ReportResult.JSON_PROPERTY_COLUMNS,
  ReportResult.JSON_PROPERTY_PAGING_INFORMATION,
  ReportResult.JSON_PROPERTY_DATA,
  ReportResult.JSON_PROPERTY_SHOW_ALL_CHILDREN
})
public class ReportResult {
  public static final String JSON_PROPERTY_REPORT = "report";
  private ReportReference report;

  public static final String JSON_PROPERTY_CB_Q_L = "cbQL";
  private String cbQL;

  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<ReportColumn> columns;

  public static final String JSON_PROPERTY_PAGING_INFORMATION = "pagingInformation";
  private ReportPagingInformation pagingInformation;

  public static final String JSON_PROPERTY_DATA = "data";
  private ReportGroup data;

  public static final String JSON_PROPERTY_SHOW_ALL_CHILDREN = "showAllChildren";
  private Boolean showAllChildren;

  public ReportResult() {
  }

  public ReportResult report(ReportReference report) {
    
    this.report = report;
    return this;
  }

   /**
   * Get report
   * @return report
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportReference getReport() {
    return report;
  }


  @JsonProperty(JSON_PROPERTY_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReport(ReportReference report) {
    this.report = report;
  }


  public ReportResult cbQL(String cbQL) {
    
    this.cbQL = cbQL;
    return this;
  }

   /**
   * CbQL query behind the report
   * @return cbQL
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CB_Q_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCbQL() {
    return cbQL;
  }


  @JsonProperty(JSON_PROPERTY_CB_Q_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCbQL(String cbQL) {
    this.cbQL = cbQL;
  }


  public ReportResult columns(List<ReportColumn> columns) {
    
    this.columns = columns;
    return this;
  }

  public ReportResult addColumnsItem(ReportColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Column information
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


  public ReportResult pagingInformation(ReportPagingInformation pagingInformation) {
    
    this.pagingInformation = pagingInformation;
    return this;
  }

   /**
   * Get pagingInformation
   * @return pagingInformation
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PAGING_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportPagingInformation getPagingInformation() {
    return pagingInformation;
  }


  @JsonProperty(JSON_PROPERTY_PAGING_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagingInformation(ReportPagingInformation pagingInformation) {
    this.pagingInformation = pagingInformation;
  }


  public ReportResult data(ReportGroup data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportGroup getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(ReportGroup data) {
    this.data = data;
  }


  public ReportResult showAllChildren(Boolean showAllChildren) {
    
    this.showAllChildren = showAllChildren;
    return this;
  }

   /**
   * Indicator to ability to collapse/expand all child items.
   * @return showAllChildren
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_ALL_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowAllChildren() {
    return showAllChildren;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_ALL_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowAllChildren(Boolean showAllChildren) {
    this.showAllChildren = showAllChildren;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportResult reportResult = (ReportResult) o;
    return Objects.equals(this.report, reportResult.report) &&
        Objects.equals(this.cbQL, reportResult.cbQL) &&
        Objects.equals(this.columns, reportResult.columns) &&
        Objects.equals(this.pagingInformation, reportResult.pagingInformation) &&
        Objects.equals(this.data, reportResult.data) &&
        Objects.equals(this.showAllChildren, reportResult.showAllChildren);
  }

  @Override
  public int hashCode() {
    return Objects.hash(report, cbQL, columns, pagingInformation, data, showAllChildren);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportResult {\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    cbQL: ").append(toIndentedString(cbQL)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    pagingInformation: ").append(toIndentedString(pagingInformation)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    showAllChildren: ").append(toIndentedString(showAllChildren)).append("\n");
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

