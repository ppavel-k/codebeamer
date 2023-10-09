

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
 * Traceability Item
 */
@JsonPropertyOrder({
  TraceabilityItem.JSON_PROPERTY_ITEM_REVISION,
  TraceabilityItem.JSON_PROPERTY_OUTGOING_REFERENCE,
  TraceabilityItem.JSON_PROPERTY_INCOMING_REFERENCE,
  TraceabilityItem.JSON_PROPERTY_OUTGOING_ASSOCIATION,
  TraceabilityItem.JSON_PROPERTY_INCOMING_ASSOCIATION,
  TraceabilityItem.JSON_PROPERTY_CHILDREN,
  TraceabilityItem.JSON_PROPERTY_OUTGOING_REFERENCES,
  TraceabilityItem.JSON_PROPERTY_OUTGOING_ASSOCIATIONS,
  TraceabilityItem.JSON_PROPERTY_INCOMING_REFERENCES,
  TraceabilityItem.JSON_PROPERTY_INCOMING_ASSOCIATIONS
})
public class TraceabilityItem {
  public static final String JSON_PROPERTY_ITEM_REVISION = "itemRevision";
  private TrackerItemRevision itemRevision;

  public static final String JSON_PROPERTY_OUTGOING_REFERENCE = "outgoing reference";
  private List<TrackerItemRevision> outgoingReference;

  public static final String JSON_PROPERTY_INCOMING_REFERENCE = "incoming reference";
  private List<TrackerItemRevision> incomingReference;

  public static final String JSON_PROPERTY_OUTGOING_ASSOCIATION = "outgoing association";
  private List<TrackerItemRevision> outgoingAssociation;

  public static final String JSON_PROPERTY_INCOMING_ASSOCIATION = "incoming association";
  private List<TrackerItemRevision> incomingAssociation;

  public static final String JSON_PROPERTY_CHILDREN = "children";
  private List<TraceabilityItem> children;

  public static final String JSON_PROPERTY_OUTGOING_REFERENCES = "outgoingReferences";
  private List<TrackerItemRevision> outgoingReferences;

  public static final String JSON_PROPERTY_OUTGOING_ASSOCIATIONS = "outgoingAssociations";
  private List<TrackerItemRevision> outgoingAssociations;

  public static final String JSON_PROPERTY_INCOMING_REFERENCES = "incomingReferences";
  private List<TrackerItemRevision> incomingReferences;

  public static final String JSON_PROPERTY_INCOMING_ASSOCIATIONS = "incomingAssociations";
  private List<TrackerItemRevision> incomingAssociations;

  public TraceabilityItem() {
  }

  public TraceabilityItem itemRevision(TrackerItemRevision itemRevision) {
    
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


  public TraceabilityItem outgoingReference(List<TrackerItemRevision> outgoingReference) {
    
    this.outgoingReference = outgoingReference;
    return this;
  }

  public TraceabilityItem addOutgoingReferenceItem(TrackerItemRevision outgoingReferenceItem) {
    if (this.outgoingReference == null) {
      this.outgoingReference = new ArrayList<>();
    }
    this.outgoingReference.add(outgoingReferenceItem);
    return this;
  }

   /**
   * Get outgoingReference
   * @return outgoingReference
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_OUTGOING_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemRevision> getOutgoingReference() {
    return outgoingReference;
  }


  @JsonProperty(JSON_PROPERTY_OUTGOING_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutgoingReference(List<TrackerItemRevision> outgoingReference) {
    this.outgoingReference = outgoingReference;
  }


  public TraceabilityItem incomingReference(List<TrackerItemRevision> incomingReference) {
    
    this.incomingReference = incomingReference;
    return this;
  }

  public TraceabilityItem addIncomingReferenceItem(TrackerItemRevision incomingReferenceItem) {
    if (this.incomingReference == null) {
      this.incomingReference = new ArrayList<>();
    }
    this.incomingReference.add(incomingReferenceItem);
    return this;
  }

   /**
   * Get incomingReference
   * @return incomingReference
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_INCOMING_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemRevision> getIncomingReference() {
    return incomingReference;
  }


  @JsonProperty(JSON_PROPERTY_INCOMING_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncomingReference(List<TrackerItemRevision> incomingReference) {
    this.incomingReference = incomingReference;
  }


  public TraceabilityItem outgoingAssociation(List<TrackerItemRevision> outgoingAssociation) {
    
    this.outgoingAssociation = outgoingAssociation;
    return this;
  }

  public TraceabilityItem addOutgoingAssociationItem(TrackerItemRevision outgoingAssociationItem) {
    if (this.outgoingAssociation == null) {
      this.outgoingAssociation = new ArrayList<>();
    }
    this.outgoingAssociation.add(outgoingAssociationItem);
    return this;
  }

   /**
   * Get outgoingAssociation
   * @return outgoingAssociation
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_OUTGOING_ASSOCIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemRevision> getOutgoingAssociation() {
    return outgoingAssociation;
  }


  @JsonProperty(JSON_PROPERTY_OUTGOING_ASSOCIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutgoingAssociation(List<TrackerItemRevision> outgoingAssociation) {
    this.outgoingAssociation = outgoingAssociation;
  }


  public TraceabilityItem incomingAssociation(List<TrackerItemRevision> incomingAssociation) {
    
    this.incomingAssociation = incomingAssociation;
    return this;
  }

  public TraceabilityItem addIncomingAssociationItem(TrackerItemRevision incomingAssociationItem) {
    if (this.incomingAssociation == null) {
      this.incomingAssociation = new ArrayList<>();
    }
    this.incomingAssociation.add(incomingAssociationItem);
    return this;
  }

   /**
   * Get incomingAssociation
   * @return incomingAssociation
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_INCOMING_ASSOCIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemRevision> getIncomingAssociation() {
    return incomingAssociation;
  }


  @JsonProperty(JSON_PROPERTY_INCOMING_ASSOCIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncomingAssociation(List<TrackerItemRevision> incomingAssociation) {
    this.incomingAssociation = incomingAssociation;
  }


  public TraceabilityItem children(List<TraceabilityItem> children) {
    
    this.children = children;
    return this;
  }

  public TraceabilityItem addChildrenItem(TraceabilityItem childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * children
   * @return children
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TraceabilityItem> getChildren() {
    return children;
  }


  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChildren(List<TraceabilityItem> children) {
    this.children = children;
  }


  public TraceabilityItem outgoingReferences(List<TrackerItemRevision> outgoingReferences) {
    
    this.outgoingReferences = outgoingReferences;
    return this;
  }

  public TraceabilityItem addOutgoingReferencesItem(TrackerItemRevision outgoingReferencesItem) {
    if (this.outgoingReferences == null) {
      this.outgoingReferences = new ArrayList<>();
    }
    this.outgoingReferences.add(outgoingReferencesItem);
    return this;
  }

   /**
   * outgoing reference
   * @return outgoingReferences
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_OUTGOING_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemRevision> getOutgoingReferences() {
    return outgoingReferences;
  }


  @JsonProperty(JSON_PROPERTY_OUTGOING_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutgoingReferences(List<TrackerItemRevision> outgoingReferences) {
    this.outgoingReferences = outgoingReferences;
  }


  public TraceabilityItem outgoingAssociations(List<TrackerItemRevision> outgoingAssociations) {
    
    this.outgoingAssociations = outgoingAssociations;
    return this;
  }

  public TraceabilityItem addOutgoingAssociationsItem(TrackerItemRevision outgoingAssociationsItem) {
    if (this.outgoingAssociations == null) {
      this.outgoingAssociations = new ArrayList<>();
    }
    this.outgoingAssociations.add(outgoingAssociationsItem);
    return this;
  }

   /**
   * outgoing association
   * @return outgoingAssociations
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_OUTGOING_ASSOCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemRevision> getOutgoingAssociations() {
    return outgoingAssociations;
  }


  @JsonProperty(JSON_PROPERTY_OUTGOING_ASSOCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutgoingAssociations(List<TrackerItemRevision> outgoingAssociations) {
    this.outgoingAssociations = outgoingAssociations;
  }


  public TraceabilityItem incomingReferences(List<TrackerItemRevision> incomingReferences) {
    
    this.incomingReferences = incomingReferences;
    return this;
  }

  public TraceabilityItem addIncomingReferencesItem(TrackerItemRevision incomingReferencesItem) {
    if (this.incomingReferences == null) {
      this.incomingReferences = new ArrayList<>();
    }
    this.incomingReferences.add(incomingReferencesItem);
    return this;
  }

   /**
   * incoming references
   * @return incomingReferences
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_INCOMING_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemRevision> getIncomingReferences() {
    return incomingReferences;
  }


  @JsonProperty(JSON_PROPERTY_INCOMING_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncomingReferences(List<TrackerItemRevision> incomingReferences) {
    this.incomingReferences = incomingReferences;
  }


  public TraceabilityItem incomingAssociations(List<TrackerItemRevision> incomingAssociations) {
    
    this.incomingAssociations = incomingAssociations;
    return this;
  }

  public TraceabilityItem addIncomingAssociationsItem(TrackerItemRevision incomingAssociationsItem) {
    if (this.incomingAssociations == null) {
      this.incomingAssociations = new ArrayList<>();
    }
    this.incomingAssociations.add(incomingAssociationsItem);
    return this;
  }

   /**
   * incoming associations
   * @return incomingAssociations
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_INCOMING_ASSOCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemRevision> getIncomingAssociations() {
    return incomingAssociations;
  }


  @JsonProperty(JSON_PROPERTY_INCOMING_ASSOCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncomingAssociations(List<TrackerItemRevision> incomingAssociations) {
    this.incomingAssociations = incomingAssociations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceabilityItem traceabilityItem = (TraceabilityItem) o;
    return Objects.equals(this.itemRevision, traceabilityItem.itemRevision) &&
        Objects.equals(this.outgoingReference, traceabilityItem.outgoingReference) &&
        Objects.equals(this.incomingReference, traceabilityItem.incomingReference) &&
        Objects.equals(this.outgoingAssociation, traceabilityItem.outgoingAssociation) &&
        Objects.equals(this.incomingAssociation, traceabilityItem.incomingAssociation) &&
        Objects.equals(this.children, traceabilityItem.children) &&
        Objects.equals(this.outgoingReferences, traceabilityItem.outgoingReferences) &&
        Objects.equals(this.outgoingAssociations, traceabilityItem.outgoingAssociations) &&
        Objects.equals(this.incomingReferences, traceabilityItem.incomingReferences) &&
        Objects.equals(this.incomingAssociations, traceabilityItem.incomingAssociations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemRevision, outgoingReference, incomingReference, outgoingAssociation, incomingAssociation, children, outgoingReferences, outgoingAssociations, incomingReferences, incomingAssociations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceabilityItem {\n");
    sb.append("    itemRevision: ").append(toIndentedString(itemRevision)).append("\n");
    sb.append("    outgoingReference: ").append(toIndentedString(outgoingReference)).append("\n");
    sb.append("    incomingReference: ").append(toIndentedString(incomingReference)).append("\n");
    sb.append("    outgoingAssociation: ").append(toIndentedString(outgoingAssociation)).append("\n");
    sb.append("    incomingAssociation: ").append(toIndentedString(incomingAssociation)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    outgoingReferences: ").append(toIndentedString(outgoingReferences)).append("\n");
    sb.append("    outgoingAssociations: ").append(toIndentedString(outgoingAssociations)).append("\n");
    sb.append("    incomingReferences: ").append(toIndentedString(incomingReferences)).append("\n");
    sb.append("    incomingAssociations: ").append(toIndentedString(incomingAssociations)).append("\n");
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

