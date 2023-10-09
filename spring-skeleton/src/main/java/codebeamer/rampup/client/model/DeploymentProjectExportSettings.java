

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
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * Project export settings for deployment
 */
@JsonPropertyOrder({
  DeploymentProjectExportSettings.JSON_PROPERTY_PROJECT_ID,
  DeploymentProjectExportSettings.JSON_PROPERTY_INCLUDE_TRACKER_ITEMS,
  DeploymentProjectExportSettings.JSON_PROPERTY_INCLUDE_QUERIES,
  DeploymentProjectExportSettings.JSON_PROPERTY_INCLUDE_TRACKERS,
  DeploymentProjectExportSettings.JSON_PROPERTY_TRACKERS
})
public class DeploymentProjectExportSettings {
  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private Integer projectId;

  public static final String JSON_PROPERTY_INCLUDE_TRACKER_ITEMS = "includeTrackerItems";
  private Boolean includeTrackerItems;

  public static final String JSON_PROPERTY_INCLUDE_QUERIES = "includeQueries";
  private Boolean includeQueries;

  public static final String JSON_PROPERTY_INCLUDE_TRACKERS = "includeTrackers";
  private Boolean includeTrackers;

  public static final String JSON_PROPERTY_TRACKERS = "trackers";
  private List<DeploymentTrackerExportSettings> trackers;

  public DeploymentProjectExportSettings() {
  }

  public DeploymentProjectExportSettings projectId(Integer projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Project id
   * @return projectId
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }


  public DeploymentProjectExportSettings includeTrackerItems(Boolean includeTrackerItems) {
    
    this.includeTrackerItems = includeTrackerItems;
    return this;
  }

   /**
   * Flag if tracker items are included.
   * @return includeTrackerItems
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_TRACKER_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeTrackerItems() {
    return includeTrackerItems;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_TRACKER_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeTrackerItems(Boolean includeTrackerItems) {
    this.includeTrackerItems = includeTrackerItems;
  }


  public DeploymentProjectExportSettings includeQueries(Boolean includeQueries) {
    
    this.includeQueries = includeQueries;
    return this;
  }

   /**
   * Flag if queries are included.
   * @return includeQueries
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeQueries() {
    return includeQueries;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeQueries(Boolean includeQueries) {
    this.includeQueries = includeQueries;
  }


  public DeploymentProjectExportSettings includeTrackers(Boolean includeTrackers) {
    
    this.includeTrackers = includeTrackers;
    return this;
  }

   /**
   * Flag if trackers are included.
   * @return includeTrackers
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_TRACKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeTrackers() {
    return includeTrackers;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_TRACKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeTrackers(Boolean includeTrackers) {
    this.includeTrackers = includeTrackers;
  }


  public DeploymentProjectExportSettings trackers(List<DeploymentTrackerExportSettings> trackers) {
    
    this.trackers = trackers;
    return this;
  }

  public DeploymentProjectExportSettings addTrackersItem(DeploymentTrackerExportSettings trackersItem) {
    if (this.trackers == null) {
      this.trackers = new ArrayList<>();
    }
    this.trackers.add(trackersItem);
    return this;
  }

   /**
   * Tracker export settings
   * @return trackers
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TRACKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DeploymentTrackerExportSettings> getTrackers() {
    return trackers;
  }


  @JsonProperty(JSON_PROPERTY_TRACKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackers(List<DeploymentTrackerExportSettings> trackers) {
    this.trackers = trackers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentProjectExportSettings deploymentProjectExportSettings = (DeploymentProjectExportSettings) o;
    return Objects.equals(this.projectId, deploymentProjectExportSettings.projectId) &&
        Objects.equals(this.includeTrackerItems, deploymentProjectExportSettings.includeTrackerItems) &&
        Objects.equals(this.includeQueries, deploymentProjectExportSettings.includeQueries) &&
        Objects.equals(this.includeTrackers, deploymentProjectExportSettings.includeTrackers) &&
        Objects.equals(this.trackers, deploymentProjectExportSettings.trackers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, includeTrackerItems, includeQueries, includeTrackers, trackers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentProjectExportSettings {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    includeTrackerItems: ").append(toIndentedString(includeTrackerItems)).append("\n");
    sb.append("    includeQueries: ").append(toIndentedString(includeQueries)).append("\n");
    sb.append("    includeTrackers: ").append(toIndentedString(includeTrackers)).append("\n");
    sb.append("    trackers: ").append(toIndentedString(trackers)).append("\n");
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

