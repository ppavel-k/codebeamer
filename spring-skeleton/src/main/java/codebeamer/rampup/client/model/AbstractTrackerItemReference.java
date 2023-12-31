

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;

/**
 * Reference to an item
 */
@JsonPropertyOrder({
  AbstractTrackerItemReference.JSON_PROPERTY_ID,
  AbstractTrackerItemReference.JSON_PROPERTY_ITEM_REVISION,
  AbstractTrackerItemReference.JSON_PROPERTY_TYPE
})
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = DownstreamTrackerItemReference.class, name = "DownstreamTrackerItemReference"),
  @JsonSubTypes.Type(value = IncomingTrackerItemAssociation.class, name = "IncomingTrackerItemAssociation"),
  @JsonSubTypes.Type(value = OutgoingTrackerItemAssociation.class, name = "OutgoingTrackerItemAssociation"),
  @JsonSubTypes.Type(value = UpstreamTrackerItemReference.class, name = "UpstreamTrackerItemReference"),
})

public class AbstractTrackerItemReference {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_ITEM_REVISION = "itemRevision";
  private TrackerItemRevision itemRevision;

  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type;

  public AbstractTrackerItemReference() {
  }

  public AbstractTrackerItemReference id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the reference/association
   * @return id
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public AbstractTrackerItemReference itemRevision(TrackerItemRevision itemRevision) {
    
    this.itemRevision = itemRevision;
    return this;
  }

   /**
   * Get itemRevision
   * @return itemRevision
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ITEM_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrackerItemRevision getItemRevision() {
    return itemRevision;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemRevision(TrackerItemRevision itemRevision) {
    this.itemRevision = itemRevision;
  }


  public AbstractTrackerItemReference type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of the relation
   * @return type
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractTrackerItemReference abstractTrackerItemReference = (AbstractTrackerItemReference) o;
    return Objects.equals(this.id, abstractTrackerItemReference.id) &&
        Objects.equals(this.itemRevision, abstractTrackerItemReference.itemRevision) &&
        Objects.equals(this.type, abstractTrackerItemReference.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, itemRevision, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractTrackerItemReference {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemRevision: ").append(toIndentedString(itemRevision)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

