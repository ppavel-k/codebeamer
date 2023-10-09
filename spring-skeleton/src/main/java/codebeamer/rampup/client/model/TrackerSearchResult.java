

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
 * One page of trackers.
 */
@JsonPropertyOrder({
  TrackerSearchResult.JSON_PROPERTY_PAGE,
  TrackerSearchResult.JSON_PROPERTY_PAGE_SIZE,
  TrackerSearchResult.JSON_PROPERTY_TOTAL,
  TrackerSearchResult.JSON_PROPERTY_TRACKERS
})
public class TrackerSearchResult {
  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_TRACKERS = "trackers";
  private List<Tracker> trackers;

  public TrackerSearchResult() {
  }

  public TrackerSearchResult page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Index of the page
   * @return page
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPage() {
    return page;
  }


  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPage(Integer page) {
    this.page = page;
  }


  public TrackerSearchResult pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Size of the found page
   * @return pageSize
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageSize() {
    return pageSize;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public TrackerSearchResult total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Number of matched tracker items by the search criteria
   * @return total
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(Integer total) {
    this.total = total;
  }


  public TrackerSearchResult trackers(List<Tracker> trackers) {
    
    this.trackers = trackers;
    return this;
  }

  public TrackerSearchResult addTrackersItem(Tracker trackersItem) {
    if (this.trackers == null) {
      this.trackers = new ArrayList<>();
    }
    this.trackers.add(trackersItem);
    return this;
  }

   /**
   * Found tracker items
   * @return trackers
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TRACKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Tracker> getTrackers() {
    return trackers;
  }


  @JsonProperty(JSON_PROPERTY_TRACKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackers(List<Tracker> trackers) {
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
    TrackerSearchResult trackerSearchResult = (TrackerSearchResult) o;
    return Objects.equals(this.page, trackerSearchResult.page) &&
        Objects.equals(this.pageSize, trackerSearchResult.pageSize) &&
        Objects.equals(this.total, trackerSearchResult.total) &&
        Objects.equals(this.trackers, trackerSearchResult.trackers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, total, trackers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerSearchResult {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

