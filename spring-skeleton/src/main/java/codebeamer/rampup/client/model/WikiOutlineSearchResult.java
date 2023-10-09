

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
 * Paginated search result of outline wiki pages
 */
@JsonPropertyOrder({
  WikiOutlineSearchResult.JSON_PROPERTY_PAGE,
  WikiOutlineSearchResult.JSON_PROPERTY_PAGE_SIZE,
  WikiOutlineSearchResult.JSON_PROPERTY_TOTAL,
  WikiOutlineSearchResult.JSON_PROPERTY_OUTLINE_WIKI_PAGES
})
public class WikiOutlineSearchResult {
  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_OUTLINE_WIKI_PAGES = "outlineWikiPages";
  private List<OutlineWiki> outlineWikiPages;

  public WikiOutlineSearchResult() {
  }

  public WikiOutlineSearchResult page(Integer page) {
    
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


  public WikiOutlineSearchResult pageSize(Integer pageSize) {
    
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


  public WikiOutlineSearchResult total(Integer total) {
    
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


  public WikiOutlineSearchResult outlineWikiPages(List<OutlineWiki> outlineWikiPages) {
    
    this.outlineWikiPages = outlineWikiPages;
    return this;
  }

  public WikiOutlineSearchResult addOutlineWikiPagesItem(OutlineWiki outlineWikiPagesItem) {
    if (this.outlineWikiPages == null) {
      this.outlineWikiPages = new ArrayList<>();
    }
    this.outlineWikiPages.add(outlineWikiPagesItem);
    return this;
  }

   /**
   * Found outline wiki pages
   * @return outlineWikiPages
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_OUTLINE_WIKI_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OutlineWiki> getOutlineWikiPages() {
    return outlineWikiPages;
  }


  @JsonProperty(JSON_PROPERTY_OUTLINE_WIKI_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutlineWikiPages(List<OutlineWiki> outlineWikiPages) {
    this.outlineWikiPages = outlineWikiPages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WikiOutlineSearchResult wikiOutlineSearchResult = (WikiOutlineSearchResult) o;
    return Objects.equals(this.page, wikiOutlineSearchResult.page) &&
        Objects.equals(this.pageSize, wikiOutlineSearchResult.pageSize) &&
        Objects.equals(this.total, wikiOutlineSearchResult.total) &&
        Objects.equals(this.outlineWikiPages, wikiOutlineSearchResult.outlineWikiPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, total, outlineWikiPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WikiOutlineSearchResult {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    outlineWikiPages: ").append(toIndentedString(outlineWikiPages)).append("\n");
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

