

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
  TrackerItemReview.JSON_PROPERTY_REVIEWERS,
  TrackerItemReview.JSON_PROPERTY_RESULT,
  TrackerItemReview.JSON_PROPERTY_TRACKER_ITEM,
  TrackerItemReview.JSON_PROPERTY_CONFIG
})
public class TrackerItemReview {
  public static final String JSON_PROPERTY_REVIEWERS = "reviewers";
  private List<TrackerItemReviewVote> reviewers;

  /**
   * Whether the review is approved or rejected
   */
  public enum ResultEnum {
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED"),
    
    UNDECIDED("UNDECIDED");

    private String value;

    ResultEnum(String value) {
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
    public static ResultEnum fromValue(String value) {
      for (ResultEnum b : ResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RESULT = "result";
  private ResultEnum result;

  public static final String JSON_PROPERTY_TRACKER_ITEM = "trackerItem";
  private TrackerItemRevision trackerItem;

  public static final String JSON_PROPERTY_CONFIG = "config";
  private TrackerItemReviewConfig config;

  public TrackerItemReview() {
  }

  public TrackerItemReview reviewers(List<TrackerItemReviewVote> reviewers) {
    
    this.reviewers = reviewers;
    return this;
  }

  public TrackerItemReview addReviewersItem(TrackerItemReviewVote reviewersItem) {
    if (this.reviewers == null) {
      this.reviewers = new ArrayList<>();
    }
    this.reviewers.add(reviewersItem);
    return this;
  }

   /**
   * List of reviewers, and their votes
   * @return reviewers
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REVIEWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemReviewVote> getReviewers() {
    return reviewers;
  }


  @JsonProperty(JSON_PROPERTY_REVIEWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewers(List<TrackerItemReviewVote> reviewers) {
    this.reviewers = reviewers;
  }


  public TrackerItemReview result(ResultEnum result) {
    
    this.result = result;
    return this;
  }

   /**
   * Whether the review is approved or rejected
   * @return result
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResultEnum getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public TrackerItemReview trackerItem(TrackerItemRevision trackerItem) {
    
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

  public TrackerItemRevision getTrackerItem() {
    return trackerItem;
  }


  @JsonProperty(JSON_PROPERTY_TRACKER_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackerItem(TrackerItemRevision trackerItem) {
    this.trackerItem = trackerItem;
  }


  public TrackerItemReview config(TrackerItemReviewConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrackerItemReviewConfig getConfig() {
    return config;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfig(TrackerItemReviewConfig config) {
    this.config = config;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemReview trackerItemReview = (TrackerItemReview) o;
    return Objects.equals(this.reviewers, trackerItemReview.reviewers) &&
        Objects.equals(this.result, trackerItemReview.result) &&
        Objects.equals(this.trackerItem, trackerItemReview.trackerItem) &&
        Objects.equals(this.config, trackerItemReview.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewers, result, trackerItem, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemReview {\n");
    sb.append("    reviewers: ").append(toIndentedString(reviewers)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    trackerItem: ").append(toIndentedString(trackerItem)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

