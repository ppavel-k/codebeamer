

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;

/**
 * Reference data of an underlying item of a row.
 */
@JsonPropertyOrder({
  ReportItemReference.JSON_PROPERTY_ITEM_ID,
  ReportItemReference.JSON_PROPERTY_TRACKER_ID
})
public class ReportItemReference {
  public static final String JSON_PROPERTY_ITEM_ID = "itemId";
  private Integer itemId;

  public static final String JSON_PROPERTY_TRACKER_ID = "trackerId";
  private Integer trackerId;

  public ReportItemReference() {
  }

  public ReportItemReference itemId(Integer itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Identifier of the underlying item.
   * @return itemId
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getItemId() {
    return itemId;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }


  public ReportItemReference trackerId(Integer trackerId) {
    
    this.trackerId = trackerId;
    return this;
  }

   /**
   * Identifier of the tracker of the underlying item.
   * @return trackerId
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTrackerId() {
    return trackerId;
  }


  @JsonProperty(JSON_PROPERTY_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackerId(Integer trackerId) {
    this.trackerId = trackerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportItemReference reportItemReference = (ReportItemReference) o;
    return Objects.equals(this.itemId, reportItemReference.itemId) &&
        Objects.equals(this.trackerId, reportItemReference.trackerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, trackerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportItemReference {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
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

