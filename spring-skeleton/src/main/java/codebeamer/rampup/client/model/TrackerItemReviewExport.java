

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
 * A tracker item review instance including its reviewers and their decisions
 */
@JsonPropertyOrder({
  TrackerItemReviewExport.JSON_PROPERTY_REVIEWERS,
  TrackerItemReviewExport.JSON_PROPERTY_TRACKER_ITEM_VERSION
})
public class TrackerItemReviewExport {
  public static final String JSON_PROPERTY_REVIEWERS = "reviewers";
  private List<TrackerItemReviewVoteExport> reviewers;

  public static final String JSON_PROPERTY_TRACKER_ITEM_VERSION = "trackerItemVersion";
  private Integer trackerItemVersion;

  public TrackerItemReviewExport() {
  }

  public TrackerItemReviewExport reviewers(List<TrackerItemReviewVoteExport> reviewers) {
    
    this.reviewers = reviewers;
    return this;
  }

  public TrackerItemReviewExport addReviewersItem(TrackerItemReviewVoteExport reviewersItem) {
    if (this.reviewers == null) {
      this.reviewers = new ArrayList<>();
    }
    this.reviewers.add(reviewersItem);
    return this;
  }

   /**
   * List of reviewers and their votes
   * @return reviewers
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REVIEWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemReviewVoteExport> getReviewers() {
    return reviewers;
  }


  @JsonProperty(JSON_PROPERTY_REVIEWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewers(List<TrackerItemReviewVoteExport> reviewers) {
    this.reviewers = reviewers;
  }


  public TrackerItemReviewExport trackerItemVersion(Integer trackerItemVersion) {
    
    this.trackerItemVersion = trackerItemVersion;
    return this;
  }

   /**
   * Version of the Tracker Item at the time of the review
   * @return trackerItemVersion
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TRACKER_ITEM_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTrackerItemVersion() {
    return trackerItemVersion;
  }


  @JsonProperty(JSON_PROPERTY_TRACKER_ITEM_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackerItemVersion(Integer trackerItemVersion) {
    this.trackerItemVersion = trackerItemVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemReviewExport trackerItemReviewExport = (TrackerItemReviewExport) o;
    return Objects.equals(this.reviewers, trackerItemReviewExport.reviewers) &&
        Objects.equals(this.trackerItemVersion, trackerItemReviewExport.trackerItemVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewers, trackerItemVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemReviewExport {\n");
    sb.append("    reviewers: ").append(toIndentedString(reviewers)).append("\n");
    sb.append("    trackerItemVersion: ").append(toIndentedString(trackerItemVersion)).append("\n");
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

