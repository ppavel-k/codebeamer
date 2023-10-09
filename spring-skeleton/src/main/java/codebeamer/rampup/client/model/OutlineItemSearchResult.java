

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
 * Paginated search result of outline items
 */
@JsonPropertyOrder({
  OutlineItemSearchResult.JSON_PROPERTY_PAGE,
  OutlineItemSearchResult.JSON_PROPERTY_PAGE_SIZE,
  OutlineItemSearchResult.JSON_PROPERTY_TOTAL,
  OutlineItemSearchResult.JSON_PROPERTY_OUTLINE_ITEMS
})
public class OutlineItemSearchResult {
  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_OUTLINE_ITEMS = "outlineItems";
  private List<OutlineItem> outlineItems;

  public OutlineItemSearchResult() {
  }

  public OutlineItemSearchResult page(Integer page) {
    
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


  public OutlineItemSearchResult pageSize(Integer pageSize) {
    
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


  public OutlineItemSearchResult total(Integer total) {
    
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


  public OutlineItemSearchResult outlineItems(List<OutlineItem> outlineItems) {
    
    this.outlineItems = outlineItems;
    return this;
  }

  public OutlineItemSearchResult addOutlineItemsItem(OutlineItem outlineItemsItem) {
    if (this.outlineItems == null) {
      this.outlineItems = new ArrayList<>();
    }
    this.outlineItems.add(outlineItemsItem);
    return this;
  }

   /**
   * Found outline items
   * @return outlineItems
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_OUTLINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OutlineItem> getOutlineItems() {
    return outlineItems;
  }


  @JsonProperty(JSON_PROPERTY_OUTLINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutlineItems(List<OutlineItem> outlineItems) {
    this.outlineItems = outlineItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutlineItemSearchResult outlineItemSearchResult = (OutlineItemSearchResult) o;
    return Objects.equals(this.page, outlineItemSearchResult.page) &&
        Objects.equals(this.pageSize, outlineItemSearchResult.pageSize) &&
        Objects.equals(this.total, outlineItemSearchResult.total) &&
        Objects.equals(this.outlineItems, outlineItemSearchResult.outlineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, total, outlineItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlineItemSearchResult {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    outlineItems: ").append(toIndentedString(outlineItems)).append("\n");
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

