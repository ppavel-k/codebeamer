

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * Settings to filter items
 */
@JsonPropertyOrder({
  TraceabilityInitialLevelFilter.JSON_PROPERTY_SHOW_ANCESTOR_ITEMS,
  TraceabilityInitialLevelFilter.JSON_PROPERTY_SHOW_DESCENDANT_ITEMS,
  TraceabilityInitialLevelFilter.JSON_PROPERTY_HISTORY_DATE,
  TraceabilityInitialLevelFilter.JSON_PROPERTY_HISTORY_BASELINE_ID,
  TraceabilityInitialLevelFilter.JSON_PROPERTY_CB_Q_L
})
public class TraceabilityInitialLevelFilter {
  public static final String JSON_PROPERTY_SHOW_ANCESTOR_ITEMS = "showAncestorItems";
  private Boolean showAncestorItems = false;

  public static final String JSON_PROPERTY_SHOW_DESCENDANT_ITEMS = "showDescendantItems";
  private Boolean showDescendantItems = false;

  public static final String JSON_PROPERTY_HISTORY_DATE = "historyDate";
  private OffsetDateTime historyDate;

  public static final String JSON_PROPERTY_HISTORY_BASELINE_ID = "historyBaselineId";
  private Integer historyBaselineId;

  public static final String JSON_PROPERTY_CB_Q_L = "cbQL";
  private String cbQL;

  public TraceabilityInitialLevelFilter() {
  }

  public TraceabilityInitialLevelFilter showAncestorItems(Boolean showAncestorItems) {
    
    this.showAncestorItems = showAncestorItems;
    return this;
  }

   /**
   * Show ancestor items
   * @return showAncestorItems
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_ANCESTOR_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowAncestorItems() {
    return showAncestorItems;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_ANCESTOR_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowAncestorItems(Boolean showAncestorItems) {
    this.showAncestorItems = showAncestorItems;
  }


  public TraceabilityInitialLevelFilter showDescendantItems(Boolean showDescendantItems) {
    
    this.showDescendantItems = showDescendantItems;
    return this;
  }

   /**
   * Show descendant items
   * @return showDescendantItems
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_DESCENDANT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowDescendantItems() {
    return showDescendantItems;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_DESCENDANT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowDescendantItems(Boolean showDescendantItems) {
    this.showDescendantItems = showDescendantItems;
  }


  public TraceabilityInitialLevelFilter historyDate(OffsetDateTime historyDate) {
    
    this.historyDate = historyDate;
    return this;
  }

   /**
   * Snapshot view of given date
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


  public TraceabilityInitialLevelFilter historyBaselineId(Integer historyBaselineId) {
    
    this.historyBaselineId = historyBaselineId;
    return this;
  }

   /**
   * Snapshot view of given baseline
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


  public TraceabilityInitialLevelFilter cbQL(String cbQL) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceabilityInitialLevelFilter traceabilityInitialLevelFilter = (TraceabilityInitialLevelFilter) o;
    return Objects.equals(this.showAncestorItems, traceabilityInitialLevelFilter.showAncestorItems) &&
        Objects.equals(this.showDescendantItems, traceabilityInitialLevelFilter.showDescendantItems) &&
        Objects.equals(this.historyDate, traceabilityInitialLevelFilter.historyDate) &&
        Objects.equals(this.historyBaselineId, traceabilityInitialLevelFilter.historyBaselineId) &&
        Objects.equals(this.cbQL, traceabilityInitialLevelFilter.cbQL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showAncestorItems, showDescendantItems, historyDate, historyBaselineId, cbQL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceabilityInitialLevelFilter {\n");
    sb.append("    showAncestorItems: ").append(toIndentedString(showAncestorItems)).append("\n");
    sb.append("    showDescendantItems: ").append(toIndentedString(showDescendantItems)).append("\n");
    sb.append("    historyDate: ").append(toIndentedString(historyDate)).append("\n");
    sb.append("    historyBaselineId: ").append(toIndentedString(historyBaselineId)).append("\n");
    sb.append("    cbQL: ").append(toIndentedString(cbQL)).append("\n");
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

