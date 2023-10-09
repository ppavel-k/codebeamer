

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
 * Request model to fetch Tracker Item Reviews for multiple Tracker Items.
 */
@JsonPropertyOrder({
  BatchGetTrackerItemReviewsRequest.JSON_PROPERTY_ITEM_IDS,
  BatchGetTrackerItemReviewsRequest.JSON_PROPERTY_BASELINE_ID
})
public class BatchGetTrackerItemReviewsRequest {
  public static final String JSON_PROPERTY_ITEM_IDS = "itemIds";
  private List<Integer> itemIds;

  public static final String JSON_PROPERTY_BASELINE_ID = "baselineId";
  private Integer baselineId;

  public BatchGetTrackerItemReviewsRequest() {
  }

  public BatchGetTrackerItemReviewsRequest itemIds(List<Integer> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public BatchGetTrackerItemReviewsRequest addItemIdsItem(Integer itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * List of Tracker Item IDs
   * @return itemIds
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ITEM_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getItemIds() {
    return itemIds;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemIds(List<Integer> itemIds) {
    this.itemIds = itemIds;
  }


  public BatchGetTrackerItemReviewsRequest baselineId(Integer baselineId) {
    
    this.baselineId = baselineId;
    return this;
  }

   /**
   * Optional Baseline ID
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchGetTrackerItemReviewsRequest batchGetTrackerItemReviewsRequest = (BatchGetTrackerItemReviewsRequest) o;
    return Objects.equals(this.itemIds, batchGetTrackerItemReviewsRequest.itemIds) &&
        Objects.equals(this.baselineId, batchGetTrackerItemReviewsRequest.baselineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIds, baselineId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchGetTrackerItemReviewsRequest {\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    baselineId: ").append(toIndentedString(baselineId)).append("\n");
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

