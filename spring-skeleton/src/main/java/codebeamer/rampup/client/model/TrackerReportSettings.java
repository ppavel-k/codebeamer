

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
 * Settings of a report on a tracker.
 */
@JsonPropertyOrder({
  TrackerReportSettings.JSON_PROPERTY_REPORT_ID,
  TrackerReportSettings.JSON_PROPERTY_CB_QL,
  TrackerReportSettings.JSON_PROPERTY_NAME,
  TrackerReportSettings.JSON_PROPERTY_DESCRIPTION,
  TrackerReportSettings.JSON_PROPERTY_COLUMNS,
  TrackerReportSettings.JSON_PROPERTY_SHOW_ANCESTORS,
  TrackerReportSettings.JSON_PROPERTY_SHOW_DESCENDANTS,
  TrackerReportSettings.JSON_PROPERTY_SHOW_ALL_CHILDREN,
  TrackerReportSettings.JSON_PROPERTY_TRACKER,
  TrackerReportSettings.JSON_PROPERTY_IS_PUBLIC,
  TrackerReportSettings.JSON_PROPERTY_RENDERING_METHOD,
  TrackerReportSettings.JSON_PROPERTY_REFERENCE_LEVEL_SETTINGS
})
public class TrackerReportSettings {
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

  public static final String JSON_PROPERTY_SHOW_ANCESTORS = "showAncestors";
  private Boolean showAncestors;

  public static final String JSON_PROPERTY_SHOW_DESCENDANTS = "showDescendants";
  private Boolean showDescendants;

  public static final String JSON_PROPERTY_SHOW_ALL_CHILDREN = "showAllChildren";
  private Boolean showAllChildren;

  public static final String JSON_PROPERTY_TRACKER = "tracker";
  private TrackerReference tracker;

  public static final String JSON_PROPERTY_IS_PUBLIC = "isPublic";
  private Boolean isPublic;

  /**
   * Rendering method for Intelligent Table View.
   */
  public enum RenderingMethodEnum {
    DISABLED("disabled"),
    
    TABLE("table"),
    
    TREE("tree");

    private String value;

    RenderingMethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RenderingMethodEnum fromValue(String value) {
      for (RenderingMethodEnum b : RenderingMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RENDERING_METHOD = "renderingMethod";
  private RenderingMethodEnum renderingMethod;

  public static final String JSON_PROPERTY_REFERENCE_LEVEL_SETTINGS = "referenceLevelSettings";
  private List<ReportReferenceLevelSettings> referenceLevelSettings;

  public TrackerReportSettings() {
  }

  public TrackerReportSettings reportId(Integer reportId) {
    
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


  public TrackerReportSettings cbQl(String cbQl) {
    
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


  public TrackerReportSettings name(String name) {
    
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


  public TrackerReportSettings description(String description) {
    
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


  public TrackerReportSettings columns(List<ResizableReportColumnSettings> columns) {
    
    this.columns = columns;
    return this;
  }

  public TrackerReportSettings addColumnsItem(ResizableReportColumnSettings columnsItem) {
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


  public TrackerReportSettings showAncestors(Boolean showAncestors) {
    
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


  public TrackerReportSettings showDescendants(Boolean showDescendants) {
    
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


  public TrackerReportSettings showAllChildren(Boolean showAllChildren) {
    
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


  public TrackerReportSettings tracker(TrackerReference tracker) {
    
    this.tracker = tracker;
    return this;
  }

   /**
   * Get tracker
   * @return tracker
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_TRACKER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TrackerReference getTracker() {
    return tracker;
  }


  @JsonProperty(JSON_PROPERTY_TRACKER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTracker(TrackerReference tracker) {
    this.tracker = tracker;
  }


  public TrackerReportSettings isPublic(Boolean isPublic) {
    
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Public report indicator.
   * @return isPublic
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsPublic() {
    return isPublic;
  }


  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public TrackerReportSettings renderingMethod(RenderingMethodEnum renderingMethod) {
    
    this.renderingMethod = renderingMethod;
    return this;
  }

   /**
   * Rendering method for Intelligent Table View.
   * @return renderingMethod
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_RENDERING_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RenderingMethodEnum getRenderingMethod() {
    return renderingMethod;
  }


  @JsonProperty(JSON_PROPERTY_RENDERING_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRenderingMethod(RenderingMethodEnum renderingMethod) {
    this.renderingMethod = renderingMethod;
  }


  public TrackerReportSettings referenceLevelSettings(List<ReportReferenceLevelSettings> referenceLevelSettings) {
    
    this.referenceLevelSettings = referenceLevelSettings;
    return this;
  }

  public TrackerReportSettings addReferenceLevelSettingsItem(ReportReferenceLevelSettings referenceLevelSettingsItem) {
    if (this.referenceLevelSettings == null) {
      this.referenceLevelSettings = new ArrayList<>();
    }
    this.referenceLevelSettings.add(referenceLevelSettingsItem);
    return this;
  }

   /**
   * Reference level setting for Intelligent Table View.
   * @return referenceLevelSettings
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_LEVEL_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReportReferenceLevelSettings> getReferenceLevelSettings() {
    return referenceLevelSettings;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_LEVEL_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceLevelSettings(List<ReportReferenceLevelSettings> referenceLevelSettings) {
    this.referenceLevelSettings = referenceLevelSettings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerReportSettings trackerReportSettings = (TrackerReportSettings) o;
    return Objects.equals(this.reportId, trackerReportSettings.reportId) &&
        Objects.equals(this.cbQl, trackerReportSettings.cbQl) &&
        Objects.equals(this.name, trackerReportSettings.name) &&
        Objects.equals(this.description, trackerReportSettings.description) &&
        Objects.equals(this.columns, trackerReportSettings.columns) &&
        Objects.equals(this.showAncestors, trackerReportSettings.showAncestors) &&
        Objects.equals(this.showDescendants, trackerReportSettings.showDescendants) &&
        Objects.equals(this.showAllChildren, trackerReportSettings.showAllChildren) &&
        Objects.equals(this.tracker, trackerReportSettings.tracker) &&
        Objects.equals(this.isPublic, trackerReportSettings.isPublic) &&
        Objects.equals(this.renderingMethod, trackerReportSettings.renderingMethod) &&
        Objects.equals(this.referenceLevelSettings, trackerReportSettings.referenceLevelSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, cbQl, name, description, columns, showAncestors, showDescendants, showAllChildren, tracker, isPublic, renderingMethod, referenceLevelSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerReportSettings {\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    cbQl: ").append(toIndentedString(cbQl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    showAncestors: ").append(toIndentedString(showAncestors)).append("\n");
    sb.append("    showDescendants: ").append(toIndentedString(showDescendants)).append("\n");
    sb.append("    showAllChildren: ").append(toIndentedString(showAllChildren)).append("\n");
    sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    renderingMethod: ").append(toIndentedString(renderingMethod)).append("\n");
    sb.append("    referenceLevelSettings: ").append(toIndentedString(referenceLevelSettings)).append("\n");
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

