

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.NonNull;

/**
 * Reference to a child item in the tracker outline.
 */
@JsonPropertyOrder({
  TrackerItemChildReference.JSON_PROPERTY_ITEM_REFERENCE,
  TrackerItemChildReference.JSON_PROPERTY_INDEX
})
public class TrackerItemChildReference {
  public static final String JSON_PROPERTY_ITEM_REFERENCE = "itemReference";
  private TrackerItemReference itemReference;

  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index;

  public TrackerItemChildReference() {
  }

  public TrackerItemChildReference itemReference(TrackerItemReference itemReference) {
    
    this.itemReference = itemReference;
    return this;
  }

   /**
   * Get itemReference
   * @return itemReference
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_ITEM_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TrackerItemReference getItemReference() {
    return itemReference;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItemReference(TrackerItemReference itemReference) {
    this.itemReference = itemReference;
  }


  public TrackerItemChildReference index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Ordinal in the tracker outline.
   * minimum: 0
   * @return index
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIndex(Integer index) {
    this.index = index;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemChildReference trackerItemChildReference = (TrackerItemChildReference) o;
    return Objects.equals(this.itemReference, trackerItemChildReference.itemReference) &&
        Objects.equals(this.index, trackerItemChildReference.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemReference, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemChildReference {\n");
    sb.append("    itemReference: ").append(toIndentedString(itemReference)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

