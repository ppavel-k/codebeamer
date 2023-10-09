

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
 * References to a tracker item
 */
@JsonPropertyOrder({
  TrackerItemRelationsResult.JSON_PROPERTY_ITEM_ID,
  TrackerItemRelationsResult.JSON_PROPERTY_DOWNSTREAM_REFERENCES,
  TrackerItemRelationsResult.JSON_PROPERTY_UPSTREAM_REFERENCES,
  TrackerItemRelationsResult.JSON_PROPERTY_INCOMING_ASSOCIATIONS,
  TrackerItemRelationsResult.JSON_PROPERTY_OUTGOING_ASSOCIATIONS
})
public class TrackerItemRelationsResult {
  public static final String JSON_PROPERTY_ITEM_ID = "itemId";
  private TrackerItemRevision itemId;

  public static final String JSON_PROPERTY_DOWNSTREAM_REFERENCES = "downstreamReferences";
  private List<DownstreamTrackerItemReference> downstreamReferences;

  public static final String JSON_PROPERTY_UPSTREAM_REFERENCES = "upstreamReferences";
  private List<UpstreamTrackerItemReference> upstreamReferences;

  public static final String JSON_PROPERTY_INCOMING_ASSOCIATIONS = "incomingAssociations";
  private List<IncomingTrackerItemAssociation> incomingAssociations;

  public static final String JSON_PROPERTY_OUTGOING_ASSOCIATIONS = "outgoingAssociations";
  private List<OutgoingTrackerItemAssociation> outgoingAssociations;

  public TrackerItemRelationsResult() {
  }

  public TrackerItemRelationsResult itemId(TrackerItemRevision itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrackerItemRevision getItemId() {
    return itemId;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemId(TrackerItemRevision itemId) {
    this.itemId = itemId;
  }


  public TrackerItemRelationsResult downstreamReferences(List<DownstreamTrackerItemReference> downstreamReferences) {
    
    this.downstreamReferences = downstreamReferences;
    return this;
  }

  public TrackerItemRelationsResult addDownstreamReferencesItem(DownstreamTrackerItemReference downstreamReferencesItem) {
    if (this.downstreamReferences == null) {
      this.downstreamReferences = new ArrayList<>();
    }
    this.downstreamReferences.add(downstreamReferencesItem);
    return this;
  }

   /**
   * References and associations to the item
   * @return downstreamReferences
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_DOWNSTREAM_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DownstreamTrackerItemReference> getDownstreamReferences() {
    return downstreamReferences;
  }


  @JsonProperty(JSON_PROPERTY_DOWNSTREAM_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownstreamReferences(List<DownstreamTrackerItemReference> downstreamReferences) {
    this.downstreamReferences = downstreamReferences;
  }


  public TrackerItemRelationsResult upstreamReferences(List<UpstreamTrackerItemReference> upstreamReferences) {
    
    this.upstreamReferences = upstreamReferences;
    return this;
  }

  public TrackerItemRelationsResult addUpstreamReferencesItem(UpstreamTrackerItemReference upstreamReferencesItem) {
    if (this.upstreamReferences == null) {
      this.upstreamReferences = new ArrayList<>();
    }
    this.upstreamReferences.add(upstreamReferencesItem);
    return this;
  }

   /**
   * References and associations to the item
   * @return upstreamReferences
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_UPSTREAM_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpstreamTrackerItemReference> getUpstreamReferences() {
    return upstreamReferences;
  }


  @JsonProperty(JSON_PROPERTY_UPSTREAM_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpstreamReferences(List<UpstreamTrackerItemReference> upstreamReferences) {
    this.upstreamReferences = upstreamReferences;
  }


  public TrackerItemRelationsResult incomingAssociations(List<IncomingTrackerItemAssociation> incomingAssociations) {
    
    this.incomingAssociations = incomingAssociations;
    return this;
  }

  public TrackerItemRelationsResult addIncomingAssociationsItem(IncomingTrackerItemAssociation incomingAssociationsItem) {
    if (this.incomingAssociations == null) {
      this.incomingAssociations = new ArrayList<>();
    }
    this.incomingAssociations.add(incomingAssociationsItem);
    return this;
  }

   /**
   * References and associations to the item
   * @return incomingAssociations
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_INCOMING_ASSOCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<IncomingTrackerItemAssociation> getIncomingAssociations() {
    return incomingAssociations;
  }


  @JsonProperty(JSON_PROPERTY_INCOMING_ASSOCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncomingAssociations(List<IncomingTrackerItemAssociation> incomingAssociations) {
    this.incomingAssociations = incomingAssociations;
  }


  public TrackerItemRelationsResult outgoingAssociations(List<OutgoingTrackerItemAssociation> outgoingAssociations) {
    
    this.outgoingAssociations = outgoingAssociations;
    return this;
  }

  public TrackerItemRelationsResult addOutgoingAssociationsItem(OutgoingTrackerItemAssociation outgoingAssociationsItem) {
    if (this.outgoingAssociations == null) {
      this.outgoingAssociations = new ArrayList<>();
    }
    this.outgoingAssociations.add(outgoingAssociationsItem);
    return this;
  }

   /**
   * References and associations to the item
   * @return outgoingAssociations
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_OUTGOING_ASSOCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OutgoingTrackerItemAssociation> getOutgoingAssociations() {
    return outgoingAssociations;
  }


  @JsonProperty(JSON_PROPERTY_OUTGOING_ASSOCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutgoingAssociations(List<OutgoingTrackerItemAssociation> outgoingAssociations) {
    this.outgoingAssociations = outgoingAssociations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemRelationsResult trackerItemRelationsResult = (TrackerItemRelationsResult) o;
    return Objects.equals(this.itemId, trackerItemRelationsResult.itemId) &&
        Objects.equals(this.downstreamReferences, trackerItemRelationsResult.downstreamReferences) &&
        Objects.equals(this.upstreamReferences, trackerItemRelationsResult.upstreamReferences) &&
        Objects.equals(this.incomingAssociations, trackerItemRelationsResult.incomingAssociations) &&
        Objects.equals(this.outgoingAssociations, trackerItemRelationsResult.outgoingAssociations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, downstreamReferences, upstreamReferences, incomingAssociations, outgoingAssociations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemRelationsResult {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    downstreamReferences: ").append(toIndentedString(downstreamReferences)).append("\n");
    sb.append("    upstreamReferences: ").append(toIndentedString(upstreamReferences)).append("\n");
    sb.append("    incomingAssociations: ").append(toIndentedString(incomingAssociations)).append("\n");
    sb.append("    outgoingAssociations: ").append(toIndentedString(outgoingAssociations)).append("\n");
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

