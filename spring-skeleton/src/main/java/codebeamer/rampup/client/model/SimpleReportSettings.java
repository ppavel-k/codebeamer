

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * Settings for a simple report.
 */
@JsonPropertyOrder({
  SimpleReportSettings.JSON_PROPERTY_REPORT_ID,
  SimpleReportSettings.JSON_PROPERTY_CB_QL,
  SimpleReportSettings.JSON_PROPERTY_NAME,
  SimpleReportSettings.JSON_PROPERTY_DESCRIPTION,
  SimpleReportSettings.JSON_PROPERTY_COLUMNS,
  SimpleReportSettings.JSON_PROPERTY_ADDED_PERMISSIONS,
  SimpleReportSettings.JSON_PROPERTY_SHOW_ANCESTORS,
  SimpleReportSettings.JSON_PROPERTY_SHOW_DESCENDANTS,
  SimpleReportSettings.JSON_PROPERTY_SHOW_ALL_CHILDREN
})
public class SimpleReportSettings {
  public static final String JSON_PROPERTY_REPORT_ID = "reportId";
  private Integer reportId;

  public static final String JSON_PROPERTY_CB_QL = "cbQl";
  private String cbQl;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<ResizableReportColumnSettings> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_ADDED_PERMISSIONS = "addedPermissions";
  private List<ReportPermission> addedPermissions;

  public static final String JSON_PROPERTY_SHOW_ANCESTORS = "showAncestors";
  private Boolean showAncestors;

  public static final String JSON_PROPERTY_SHOW_DESCENDANTS = "showDescendants";
  private Boolean showDescendants;

  public static final String JSON_PROPERTY_SHOW_ALL_CHILDREN = "showAllChildren";
  private Boolean showAllChildren;

  public SimpleReportSettings() {
  }

  public SimpleReportSettings reportId(Integer reportId) {
    
    this.reportId = reportId;
    return this;
  }

   /**
   * Id of a report
   * @return reportId
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReportId() {
    return reportId;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportId(Integer reportId) {
    this.reportId = reportId;
  }


  public SimpleReportSettings cbQl(String cbQl) {
    
    this.cbQl = cbQl;
    return this;
  }

   /**
   * CbQL query string of the report.
   * @return cbQl
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_CB_QL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCbQl() {
    return cbQl;
  }


  @JsonProperty(JSON_PROPERTY_CB_QL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCbQl(String cbQl) {
    this.cbQl = cbQl;
  }


  public SimpleReportSettings name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the report.
   * @return name
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public SimpleReportSettings description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the report.
   * @return description
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public SimpleReportSettings columns(List<ResizableReportColumnSettings> columns) {
    
    this.columns = columns;
    return this;
  }

  public SimpleReportSettings addColumnsItem(ResizableReportColumnSettings columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Column definitions.
   * @return columns
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ResizableReportColumnSettings> getColumns() {
    return columns;
  }


  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setColumns(List<ResizableReportColumnSettings> columns) {
    this.columns = columns;
  }


  public SimpleReportSettings addedPermissions(List<ReportPermission> addedPermissions) {
    
    this.addedPermissions = addedPermissions;
    return this;
  }

  public SimpleReportSettings addAddedPermissionsItem(ReportPermission addedPermissionsItem) {
    if (this.addedPermissions == null) {
      this.addedPermissions = new ArrayList<>();
    }
    this.addedPermissions.add(addedPermissionsItem);
    return this;
  }

   /**
   * Access permissions for the report.
   * @return addedPermissions
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ADDED_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReportPermission> getAddedPermissions() {
    return addedPermissions;
  }


  @JsonProperty(JSON_PROPERTY_ADDED_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddedPermissions(List<ReportPermission> addedPermissions) {
    this.addedPermissions = addedPermissions;
  }


  public SimpleReportSettings showAncestors(Boolean showAncestors) {
    
    this.showAncestors = showAncestors;
    return this;
  }

   /**
   * Indicator to show the ancestors of a result item.
   * @return showAncestors
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_ANCESTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowAncestors() {
    return showAncestors;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_ANCESTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowAncestors(Boolean showAncestors) {
    this.showAncestors = showAncestors;
  }


  public SimpleReportSettings showDescendants(Boolean showDescendants) {
    
    this.showDescendants = showDescendants;
    return this;
  }

   /**
   * Indicator to show the descendants of a result item.
   * @return showDescendants
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_DESCENDANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowDescendants() {
    return showDescendants;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_DESCENDANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowDescendants(Boolean showDescendants) {
    this.showDescendants = showDescendants;
  }


  public SimpleReportSettings showAllChildren(Boolean showAllChildren) {
    
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
    SimpleReportSettings simpleReportSettings = (SimpleReportSettings) o;
    return Objects.equals(this.reportId, simpleReportSettings.reportId) &&
        Objects.equals(this.cbQl, simpleReportSettings.cbQl) &&
        Objects.equals(this.name, simpleReportSettings.name) &&
        Objects.equals(this.description, simpleReportSettings.description) &&
        Objects.equals(this.columns, simpleReportSettings.columns) &&
        Objects.equals(this.addedPermissions, simpleReportSettings.addedPermissions) &&
        Objects.equals(this.showAncestors, simpleReportSettings.showAncestors) &&
        Objects.equals(this.showDescendants, simpleReportSettings.showDescendants) &&
        Objects.equals(this.showAllChildren, simpleReportSettings.showAllChildren);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, cbQl, name, description, columns, addedPermissions, showAncestors, showDescendants, showAllChildren);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleReportSettings {\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    cbQl: ").append(toIndentedString(cbQl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    addedPermissions: ").append(toIndentedString(addedPermissions)).append("\n");
    sb.append("    showAncestors: ").append(toIndentedString(showAncestors)).append("\n");
    sb.append("    showDescendants: ").append(toIndentedString(showDescendants)).append("\n");
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

