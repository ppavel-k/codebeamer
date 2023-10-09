

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
 * A Tracker Item with all of its corresponding Tracker Item Reviews
 */
@JsonPropertyOrder({
  TrackerItemWithTrackerItemReviewsExport.JSON_PROPERTY_TRACKER_ITEM,
  TrackerItemWithTrackerItemReviewsExport.JSON_PROPERTY_TRACKER_ITEM_REVIEWS
})
public class TrackerItemWithTrackerItemReviewsExport {
  public static final String JSON_PROPERTY_TRACKER_ITEM = "trackerItem";
  private TrackerItem trackerItem;

  public static final String JSON_PROPERTY_TRACKER_ITEM_REVIEWS = "trackerItemReviews";
  private List<TrackerItemReviewExport> trackerItemReviews;

  public TrackerItemWithTrackerItemReviewsExport() {
  }

  public TrackerItemWithTrackerItemReviewsExport trackerItem(TrackerItem trackerItem) {
    
    this.trackerItem = trackerItem;
    return this;
  }

   /**
   * Get trackerItem
   * @return trackerItem
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TRACKER_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrackerItem getTrackerItem() {
    return trackerItem;
  }


  @JsonProperty(JSON_PROPERTY_TRACKER_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackerItem(TrackerItem trackerItem) {
    this.trackerItem = trackerItem;
  }


  public TrackerItemWithTrackerItemReviewsExport trackerItemReviews(List<TrackerItemReviewExport> trackerItemReviews) {
    
    this.trackerItemReviews = trackerItemReviews;
    return this;
  }

  public TrackerItemWithTrackerItemReviewsExport addTrackerItemReviewsItem(TrackerItemReviewExport trackerItemReviewsItem) {
    if (this.trackerItemReviews == null) {
      this.trackerItemReviews = new ArrayList<>();
    }
    this.trackerItemReviews.add(trackerItemReviewsItem);
    return this;
  }

   /**
   * List of Tracker Item Reviews
   * @return trackerItemReviews
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TRACKER_ITEM_REVIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemReviewExport> getTrackerItemReviews() {
    return trackerItemReviews;
  }


  @JsonProperty(JSON_PROPERTY_TRACKER_ITEM_REVIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackerItemReviews(List<TrackerItemReviewExport> trackerItemReviews) {
    this.trackerItemReviews = trackerItemReviews;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemWithTrackerItemReviewsExport trackerItemWithTrackerItemReviewsExport = (TrackerItemWithTrackerItemReviewsExport) o;
    return Objects.equals(this.trackerItem, trackerItemWithTrackerItemReviewsExport.trackerItem) &&
        Objects.equals(this.trackerItemReviews, trackerItemWithTrackerItemReviewsExport.trackerItemReviews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackerItem, trackerItemReviews);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemWithTrackerItemReviewsExport {\n");
    sb.append("    trackerItem: ").append(toIndentedString(trackerItem)).append("\n");
    sb.append("    trackerItemReviews: ").append(toIndentedString(trackerItemReviews)).append("\n");
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

