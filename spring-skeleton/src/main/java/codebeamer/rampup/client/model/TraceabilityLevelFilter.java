

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * Traceability level filter
 */
@JsonPropertyOrder({
  TraceabilityLevelFilter.JSON_PROPERTY_PREVIOUS_LEVEL_ITEMS,
  TraceabilityLevelFilter.JSON_PROPERTY_OUTGOING_REFERENCE,
  TraceabilityLevelFilter.JSON_PROPERTY_INCOMING_REFERENCE,
  TraceabilityLevelFilter.JSON_PROPERTY_OUTGOING_ASSOCIATION,
  TraceabilityLevelFilter.JSON_PROPERTY_INCOMING_ASSOCIATION,
  TraceabilityLevelFilter.JSON_PROPERTY_FOLDERS_AND_INFORMATION,
  TraceabilityLevelFilter.JSON_PROPERTY_CB_Q_L,
  TraceabilityLevelFilter.JSON_PROPERTY_HISTORY_DATE,
  TraceabilityLevelFilter.JSON_PROPERTY_HISTORY_BASELINE_ID
})
public class TraceabilityLevelFilter {
  public static final String JSON_PROPERTY_PREVIOUS_LEVEL_ITEMS = "previousLevelItems";
  private List<TrackerItemRevision> previousLevelItems;

  public static final String JSON_PROPERTY_OUTGOING_REFERENCE = "outgoingReference";
  private Boolean outgoingReference = true;

  public static final String JSON_PROPERTY_INCOMING_REFERENCE = "incomingReference";
  private Boolean incomingReference = true;

  public static final String JSON_PROPERTY_OUTGOING_ASSOCIATION = "outgoingAssociation";
  private Boolean outgoingAssociation = true;

  public static final String JSON_PROPERTY_INCOMING_ASSOCIATION = "incomingAssociation";
  private Boolean incomingAssociation = true;

  public static final String JSON_PROPERTY_FOLDERS_AND_INFORMATION = "foldersAndInformation";
  private Boolean foldersAndInformation = false;

  public static final String JSON_PROPERTY_CB_Q_L = "cbQL";
  private String cbQL;

  public static final String JSON_PROPERTY_HISTORY_DATE = "historyDate";
  private OffsetDateTime historyDate;

  public static final String JSON_PROPERTY_HISTORY_BASELINE_ID = "historyBaselineId";
  private Integer historyBaselineId;

  public TraceabilityLevelFilter() {
  }

  public TraceabilityLevelFilter previousLevelItems(List<TrackerItemRevision> previousLevelItems) {
    
    this.previousLevelItems = previousLevelItems;
    return this;
  }

  public TraceabilityLevelFilter addPreviousLevelItemsItem(TrackerItemRevision previousLevelItemsItem) {
    if (this.previousLevelItems == null) {
      this.previousLevelItems = new ArrayList<>();
    }
    this.previousLevelItems.add(previousLevelItemsItem);
    return this;
  }

   /**
   * Previous Level Items
   * @return previousLevelItems
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PREVIOUS_LEVEL_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemRevision> getPreviousLevelItems() {
    return previousLevelItems;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS_LEVEL_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviousLevelItems(List<TrackerItemRevision> previousLevelItems) {
    this.previousLevelItems = previousLevelItems;
  }


  public TraceabilityLevelFilter outgoingReference(Boolean outgoingReference) {
    
    this.outgoingReference = outgoingReference;
    return this;
  }

   /**
   * Show outgoing references
   * @return outgoingReference
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_OUTGOING_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOutgoingReference() {
    return outgoingReference;
  }


  @JsonProperty(JSON_PROPERTY_OUTGOING_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutgoingReference(Boolean outgoingReference) {
    this.outgoingReference = outgoingReference;
  }


  public TraceabilityLevelFilter incomingReference(Boolean incomingReference) {
    
    this.incomingReference = incomingReference;
    return this;
  }

   /**
   * Show incoming references
   * @return incomingReference
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_INCOMING_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncomingReference() {
    return incomingReference;
  }


  @JsonProperty(JSON_PROPERTY_INCOMING_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncomingReference(Boolean incomingReference) {
    this.incomingReference = incomingReference;
  }


  public TraceabilityLevelFilter outgoingAssociation(Boolean outgoingAssociation) {
    
    this.outgoingAssociation = outgoingAssociation;
    return this;
  }

   /**
   * Show outgoing association
   * @return outgoingAssociation
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_OUTGOING_ASSOCIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOutgoingAssociation() {
    return outgoingAssociation;
  }


  @JsonProperty(JSON_PROPERTY_OUTGOING_ASSOCIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutgoingAssociation(Boolean outgoingAssociation) {
    this.outgoingAssociation = outgoingAssociation;
  }


  public TraceabilityLevelFilter incomingAssociation(Boolean incomingAssociation) {
    
    this.incomingAssociation = incomingAssociation;
    return this;
  }

   /**
   * Show incoming association
   * @return incomingAssociation
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_INCOMING_ASSOCIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncomingAssociation() {
    return incomingAssociation;
  }


  @JsonProperty(JSON_PROPERTY_INCOMING_ASSOCIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncomingAssociation(Boolean incomingAssociation) {
    this.incomingAssociation = incomingAssociation;
  }


  public TraceabilityLevelFilter foldersAndInformation(Boolean foldersAndInformation) {
    
    this.foldersAndInformation = foldersAndInformation;
    return this;
  }

   /**
   * Show folders and information
   * @return foldersAndInformation
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_FOLDERS_AND_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFoldersAndInformation() {
    return foldersAndInformation;
  }


  @JsonProperty(JSON_PROPERTY_FOLDERS_AND_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFoldersAndInformation(Boolean foldersAndInformation) {
    this.foldersAndInformation = foldersAndInformation;
  }


  public TraceabilityLevelFilter cbQL(String cbQL) {
    
    this.cbQL = cbQL;
    return this;
  }

   /**
   * cbQL
   * @return cbQL
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_CB_Q_L)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCbQL() {
    return cbQL;
  }


  @JsonProperty(JSON_PROPERTY_CB_Q_L)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCbQL(String cbQL) {
    this.cbQL = cbQL;
  }


  public TraceabilityLevelFilter historyDate(OffsetDateTime historyDate) {
    
    this.historyDate = historyDate;
    return this;
  }

   /**
   * History Date - Snapshot view of the given date
   * @return historyDate
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_HISTORY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getHistoryDate() {
    return historyDate;
  }


  @JsonProperty(JSON_PROPERTY_HISTORY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHistoryDate(OffsetDateTime historyDate) {
    this.historyDate = historyDate;
  }


  public TraceabilityLevelFilter historyBaselineId(Integer historyBaselineId) {
    
    this.historyBaselineId = historyBaselineId;
    return this;
  }

   /**
   * History Baseline Id - Snapshot view of the given baseline
   * @return historyBaselineId
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_HISTORY_BASELINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHistoryBaselineId() {
    return historyBaselineId;
  }


  @JsonProperty(JSON_PROPERTY_HISTORY_BASELINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHistoryBaselineId(Integer historyBaselineId) {
    this.historyBaselineId = historyBaselineId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceabilityLevelFilter traceabilityLevelFilter = (TraceabilityLevelFilter) o;
    return Objects.equals(this.previousLevelItems, traceabilityLevelFilter.previousLevelItems) &&
        Objects.equals(this.outgoingReference, traceabilityLevelFilter.outgoingReference) &&
        Objects.equals(this.incomingReference, traceabilityLevelFilter.incomingReference) &&
        Objects.equals(this.outgoingAssociation, traceabilityLevelFilter.outgoingAssociation) &&
        Objects.equals(this.incomingAssociation, traceabilityLevelFilter.incomingAssociation) &&
        Objects.equals(this.foldersAndInformation, traceabilityLevelFilter.foldersAndInformation) &&
        Objects.equals(this.cbQL, traceabilityLevelFilter.cbQL) &&
        Objects.equals(this.historyDate, traceabilityLevelFilter.historyDate) &&
        Objects.equals(this.historyBaselineId, traceabilityLevelFilter.historyBaselineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousLevelItems, outgoingReference, incomingReference, outgoingAssociation, incomingAssociation, foldersAndInformation, cbQL, historyDate, historyBaselineId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceabilityLevelFilter {\n");
    sb.append("    previousLevelItems: ").append(toIndentedString(previousLevelItems)).append("\n");
    sb.append("    outgoingReference: ").append(toIndentedString(outgoingReference)).append("\n");
    sb.append("    incomingReference: ").append(toIndentedString(incomingReference)).append("\n");
    sb.append("    outgoingAssociation: ").append(toIndentedString(outgoingAssociation)).append("\n");
    sb.append("    incomingAssociation: ").append(toIndentedString(incomingAssociation)).append("\n");
    sb.append("    foldersAndInformation: ").append(toIndentedString(foldersAndInformation)).append("\n");
    sb.append("    cbQL: ").append(toIndentedString(cbQL)).append("\n");
    sb.append("    historyDate: ").append(toIndentedString(historyDate)).append("\n");
    sb.append("    historyBaselineId: ").append(toIndentedString(historyBaselineId)).append("\n");
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

