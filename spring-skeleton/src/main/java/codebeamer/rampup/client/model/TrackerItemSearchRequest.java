

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
 * TrackerItemSearchRequest
 */
@JsonPropertyOrder({
  TrackerItemSearchRequest.JSON_PROPERTY_BASELINE_ID,
  TrackerItemSearchRequest.JSON_PROPERTY_PAGE,
  TrackerItemSearchRequest.JSON_PROPERTY_PAGE_SIZE,
  TrackerItemSearchRequest.JSON_PROPERTY_QUERY_STRING
})
public class TrackerItemSearchRequest {
  public static final String JSON_PROPERTY_BASELINE_ID = "baselineId";
  private Integer baselineId;

  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page = 1;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize = 25;

  public static final String JSON_PROPERTY_QUERY_STRING = "queryString";
  private String queryString;

  public TrackerItemSearchRequest() {
  }

  public TrackerItemSearchRequest baselineId(Integer baselineId) {
    
    this.baselineId = baselineId;
    return this;
  }

   /**
   * Baseline on which the query is applied.
   * @return baselineId
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_BASELINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBaselineId() {
    return baselineId;
  }


  @JsonProperty(JSON_PROPERTY_BASELINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaselineId(Integer baselineId) {
    this.baselineId = baselineId;
  }


  public TrackerItemSearchRequest page(Integer page) {
    
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


  public TrackerItemSearchRequest pageSize(Integer pageSize) {
    
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


  public TrackerItemSearchRequest queryString(String queryString) {
    
    this.queryString = queryString;
    return this;
  }

   /**
   * CbQL query for the requested items
   * @return queryString
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQueryString() {
    return queryString;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemSearchRequest trackerItemSearchRequest = (TrackerItemSearchRequest) o;
    return Objects.equals(this.baselineId, trackerItemSearchRequest.baselineId) &&
        Objects.equals(this.page, trackerItemSearchRequest.page) &&
        Objects.equals(this.pageSize, trackerItemSearchRequest.pageSize) &&
        Objects.equals(this.queryString, trackerItemSearchRequest.queryString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baselineId, page, pageSize, queryString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemSearchRequest {\n");
    sb.append("    baselineId: ").append(toIndentedString(baselineId)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
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

