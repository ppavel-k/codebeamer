

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
 * One page of artifact revisions.
 */
@JsonPropertyOrder({
  ArtifactRevisionSearchResult.JSON_PROPERTY_PAGE,
  ArtifactRevisionSearchResult.JSON_PROPERTY_PAGE_SIZE,
  ArtifactRevisionSearchResult.JSON_PROPERTY_TOTAL,
  ArtifactRevisionSearchResult.JSON_PROPERTY_REVISIONS
})
public class ArtifactRevisionSearchResult {
  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_REVISIONS = "revisions";
  private List<ArtifactRevision> revisions;

  public ArtifactRevisionSearchResult() {
  }

  public ArtifactRevisionSearchResult page(Integer page) {
    
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


  public ArtifactRevisionSearchResult pageSize(Integer pageSize) {
    
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


  public ArtifactRevisionSearchResult total(Integer total) {
    
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


  public ArtifactRevisionSearchResult revisions(List<ArtifactRevision> revisions) {
    
    this.revisions = revisions;
    return this;
  }

  public ArtifactRevisionSearchResult addRevisionsItem(ArtifactRevision revisionsItem) {
    if (this.revisions == null) {
      this.revisions = new ArrayList<>();
    }
    this.revisions.add(revisionsItem);
    return this;
  }

   /**
   * Found artifact revision
   * @return revisions
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REVISIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ArtifactRevision> getRevisions() {
    return revisions;
  }


  @JsonProperty(JSON_PROPERTY_REVISIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevisions(List<ArtifactRevision> revisions) {
    this.revisions = revisions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactRevisionSearchResult artifactRevisionSearchResult = (ArtifactRevisionSearchResult) o;
    return Objects.equals(this.page, artifactRevisionSearchResult.page) &&
        Objects.equals(this.pageSize, artifactRevisionSearchResult.pageSize) &&
        Objects.equals(this.total, artifactRevisionSearchResult.total) &&
        Objects.equals(this.revisions, artifactRevisionSearchResult.revisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, total, revisions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactRevisionSearchResult {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    revisions: ").append(toIndentedString(revisions)).append("\n");
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

