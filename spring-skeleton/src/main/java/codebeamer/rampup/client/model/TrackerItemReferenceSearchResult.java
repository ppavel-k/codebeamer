

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
 * One page of tracker item references.
 */
@JsonPropertyOrder({
  TrackerItemReferenceSearchResult.JSON_PROPERTY_PAGE,
  TrackerItemReferenceSearchResult.JSON_PROPERTY_PAGE_SIZE,
  TrackerItemReferenceSearchResult.JSON_PROPERTY_TOTAL,
  TrackerItemReferenceSearchResult.JSON_PROPERTY_ITEM_REFS
})
public class TrackerItemReferenceSearchResult {
  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_ITEM_REFS = "itemRefs";
  private List<TrackerItemReference> itemRefs;

  public TrackerItemReferenceSearchResult() {
  }

  public TrackerItemReferenceSearchResult page(Integer page) {
    
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


  public TrackerItemReferenceSearchResult pageSize(Integer pageSize) {
    
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


  public TrackerItemReferenceSearchResult total(Integer total) {
    
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


  public TrackerItemReferenceSearchResult itemRefs(List<TrackerItemReference> itemRefs) {
    
    this.itemRefs = itemRefs;
    return this;
  }

  public TrackerItemReferenceSearchResult addItemRefsItem(TrackerItemReference itemRefsItem) {
    if (this.itemRefs == null) {
      this.itemRefs = new ArrayList<>();
    }
    this.itemRefs.add(itemRefsItem);
    return this;
  }

   /**
   * Found tracker item references
   * @return itemRefs
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ITEM_REFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemReference> getItemRefs() {
    return itemRefs;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_REFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemRefs(List<TrackerItemReference> itemRefs) {
    this.itemRefs = itemRefs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemReferenceSearchResult trackerItemReferenceSearchResult = (TrackerItemReferenceSearchResult) o;
    return Objects.equals(this.page, trackerItemReferenceSearchResult.page) &&
        Objects.equals(this.pageSize, trackerItemReferenceSearchResult.pageSize) &&
        Objects.equals(this.total, trackerItemReferenceSearchResult.total) &&
        Objects.equals(this.itemRefs, trackerItemReferenceSearchResult.itemRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, total, itemRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemReferenceSearchResult {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    itemRefs: ").append(toIndentedString(itemRefs)).append("\n");
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

