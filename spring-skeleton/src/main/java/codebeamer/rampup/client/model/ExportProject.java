

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
import org.springframework.lang.Nullable;

/**
 * ExportProject
 */
@JsonPropertyOrder({
  ExportProject.JSON_PROPERTY_PASSWORD,
  ExportProject.JSON_PROPERTY_SKIP_TRACKER_ITEMS,
  ExportProject.JSON_PROPERTY_SKIP_WIKI_PAGES,
  ExportProject.JSON_PROPERTY_SKIP_ASSOCIATIONS,
  ExportProject.JSON_PROPERTY_SKIP_REPORTS,
  ExportProject.JSON_PROPERTY_SELECTED_TRACKER_IDS
})
public class ExportProject {
  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_SKIP_TRACKER_ITEMS = "skipTrackerItems";
  private Boolean skipTrackerItems = false;

  public static final String JSON_PROPERTY_SKIP_WIKI_PAGES = "skipWikiPages";
  private Boolean skipWikiPages = true;

  public static final String JSON_PROPERTY_SKIP_ASSOCIATIONS = "skipAssociations";
  private Boolean skipAssociations = false;

  public static final String JSON_PROPERTY_SKIP_REPORTS = "skipReports";
  private Boolean skipReports = false;

  public static final String JSON_PROPERTY_SELECTED_TRACKER_IDS = "selectedTrackerIds";
  private List<Integer> selectedTrackerIds;

  public ExportProject() {
  }

  public ExportProject password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * A password that is used during the project encryption.
   * @return password
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public ExportProject skipTrackerItems(Boolean skipTrackerItems) {
    
    this.skipTrackerItems = skipTrackerItems;
    return this;
  }

   /**
   * If true, then the Tracker Items are not exported
   * @return skipTrackerItems
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SKIP_TRACKER_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipTrackerItems() {
    return skipTrackerItems;
  }


  @JsonProperty(JSON_PROPERTY_SKIP_TRACKER_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkipTrackerItems(Boolean skipTrackerItems) {
    this.skipTrackerItems = skipTrackerItems;
  }


  public ExportProject skipWikiPages(Boolean skipWikiPages) {
    
    this.skipWikiPages = skipWikiPages;
    return this;
  }

   /**
   * If true, then the Wiki PAges are not exported
   * @return skipWikiPages
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SKIP_WIKI_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipWikiPages() {
    return skipWikiPages;
  }


  @JsonProperty(JSON_PROPERTY_SKIP_WIKI_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkipWikiPages(Boolean skipWikiPages) {
    this.skipWikiPages = skipWikiPages;
  }


  public ExportProject skipAssociations(Boolean skipAssociations) {
    
    this.skipAssociations = skipAssociations;
    return this;
  }

   /**
   * If true, then the Associations are not exported
   * @return skipAssociations
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SKIP_ASSOCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipAssociations() {
    return skipAssociations;
  }


  @JsonProperty(JSON_PROPERTY_SKIP_ASSOCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkipAssociations(Boolean skipAssociations) {
    this.skipAssociations = skipAssociations;
  }


  public ExportProject skipReports(Boolean skipReports) {
    
    this.skipReports = skipReports;
    return this;
  }

   /**
   * If true, then the Reports are not exported
   * @return skipReports
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SKIP_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipReports() {
    return skipReports;
  }


  @JsonProperty(JSON_PROPERTY_SKIP_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkipReports(Boolean skipReports) {
    this.skipReports = skipReports;
  }


  public ExportProject selectedTrackerIds(List<Integer> selectedTrackerIds) {
    
    this.selectedTrackerIds = selectedTrackerIds;
    return this;
  }

  public ExportProject addSelectedTrackerIdsItem(Integer selectedTrackerIdsItem) {
    if (this.selectedTrackerIds == null) {
      this.selectedTrackerIds = new ArrayList<>();
    }
    this.selectedTrackerIds.add(selectedTrackerIdsItem);
    return this;
  }

   /**
   * If this list is not empty then only the Trackers listed here are exported.é
   * @return selectedTrackerIds
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SELECTED_TRACKER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getSelectedTrackerIds() {
    return selectedTrackerIds;
  }


  @JsonProperty(JSON_PROPERTY_SELECTED_TRACKER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelectedTrackerIds(List<Integer> selectedTrackerIds) {
    this.selectedTrackerIds = selectedTrackerIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportProject exportProject = (ExportProject) o;
    return Objects.equals(this.password, exportProject.password) &&
        Objects.equals(this.skipTrackerItems, exportProject.skipTrackerItems) &&
        Objects.equals(this.skipWikiPages, exportProject.skipWikiPages) &&
        Objects.equals(this.skipAssociations, exportProject.skipAssociations) &&
        Objects.equals(this.skipReports, exportProject.skipReports) &&
        Objects.equals(this.selectedTrackerIds, exportProject.selectedTrackerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, skipTrackerItems, skipWikiPages, skipAssociations, skipReports, selectedTrackerIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportProject {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    skipTrackerItems: ").append(toIndentedString(skipTrackerItems)).append("\n");
    sb.append("    skipWikiPages: ").append(toIndentedString(skipWikiPages)).append("\n");
    sb.append("    skipAssociations: ").append(toIndentedString(skipAssociations)).append("\n");
    sb.append("    skipReports: ").append(toIndentedString(skipReports)).append("\n");
    sb.append("    selectedTrackerIds: ").append(toIndentedString(selectedTrackerIds)).append("\n");
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

