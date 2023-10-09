

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * Tracker export settings for deployment
 */
@JsonPropertyOrder({
  DeploymentTrackerExportSettings.JSON_PROPERTY_TRACKER_ID,
  DeploymentTrackerExportSettings.JSON_PROPERTY_ITEMS_INCLUDED
})
public class DeploymentTrackerExportSettings {
  public static final String JSON_PROPERTY_TRACKER_ID = "trackerId";
  private Integer trackerId;

  public static final String JSON_PROPERTY_ITEMS_INCLUDED = "itemsIncluded";
  private Boolean itemsIncluded;

  public DeploymentTrackerExportSettings() {
  }

  public DeploymentTrackerExportSettings trackerId(Integer trackerId) {
    
    this.trackerId = trackerId;
    return this;
  }

   /**
   * Project id
   * @return trackerId
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTrackerId() {
    return trackerId;
  }


  @JsonProperty(JSON_PROPERTY_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTrackerId(Integer trackerId) {
    this.trackerId = trackerId;
  }


  public DeploymentTrackerExportSettings itemsIncluded(Boolean itemsIncluded) {
    
    this.itemsIncluded = itemsIncluded;
    return this;
  }

   /**
   * Flag if tracker items are included.
   * @return itemsIncluded
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ITEMS_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getItemsIncluded() {
    return itemsIncluded;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemsIncluded(Boolean itemsIncluded) {
    this.itemsIncluded = itemsIncluded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentTrackerExportSettings deploymentTrackerExportSettings = (DeploymentTrackerExportSettings) o;
    return Objects.equals(this.trackerId, deploymentTrackerExportSettings.trackerId) &&
        Objects.equals(this.itemsIncluded, deploymentTrackerExportSettings.itemsIncluded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackerId, itemsIncluded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentTrackerExportSettings {\n");
    sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
    sb.append("    itemsIncluded: ").append(toIndentedString(itemsIncluded)).append("\n");
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

