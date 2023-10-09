

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
 * One page of tracker items.
 */
@JsonPropertyOrder({
  TrackerItemSearchResult.JSON_PROPERTY_PAGE,
  TrackerItemSearchResult.JSON_PROPERTY_PAGE_SIZE,
  TrackerItemSearchResult.JSON_PROPERTY_TOTAL,
  TrackerItemSearchResult.JSON_PROPERTY_ITEMS
})
public class TrackerItemSearchResult {
  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<TrackerItem> items;

  public TrackerItemSearchResult() {
  }

  public TrackerItemSearchResult page(Integer page) {
    
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


  public TrackerItemSearchResult pageSize(Integer pageSize) {
    
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


  public TrackerItemSearchResult total(Integer total) {
    
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


  public TrackerItemSearchResult items(List<TrackerItem> items) {
    
    this.items = items;
    return this;
  }

  public TrackerItemSearchResult addItemsItem(TrackerItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Found tracker items
   * @return items
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItem> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<TrackerItem> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemSearchResult trackerItemSearchResult = (TrackerItemSearchResult) o;
    return Objects.equals(this.page, trackerItemSearchResult.page) &&
        Objects.equals(this.pageSize, trackerItemSearchResult.pageSize) &&
        Objects.equals(this.total, trackerItemSearchResult.total) &&
        Objects.equals(this.items, trackerItemSearchResult.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, total, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemSearchResult {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

