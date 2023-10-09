

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
 * Traceability result
 */
@JsonPropertyOrder({
  TraceabilityResult.JSON_PROPERTY_LIMIT_WARNINGS,
  TraceabilityResult.JSON_PROPERTY_TRACEABILITY_ITEMS
})
public class TraceabilityResult {
  public static final String JSON_PROPERTY_LIMIT_WARNINGS = "limitWarnings";
  private String limitWarnings;

  public static final String JSON_PROPERTY_TRACEABILITY_ITEMS = "traceabilityItems";
  private List<TraceabilityItem> traceabilityItems;

  public TraceabilityResult() {
  }

  public TraceabilityResult limitWarnings(String limitWarnings) {
    
    this.limitWarnings = limitWarnings;
    return this;
  }

   /**
   * limit warnings
   * @return limitWarnings
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLimitWarnings() {
    return limitWarnings;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimitWarnings(String limitWarnings) {
    this.limitWarnings = limitWarnings;
  }


  public TraceabilityResult traceabilityItems(List<TraceabilityItem> traceabilityItems) {
    
    this.traceabilityItems = traceabilityItems;
    return this;
  }

  public TraceabilityResult addTraceabilityItemsItem(TraceabilityItem traceabilityItemsItem) {
    if (this.traceabilityItems == null) {
      this.traceabilityItems = new ArrayList<>();
    }
    this.traceabilityItems.add(traceabilityItemsItem);
    return this;
  }

   /**
   * traceability items
   * @return traceabilityItems
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TRACEABILITY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TraceabilityItem> getTraceabilityItems() {
    return traceabilityItems;
  }


  @JsonProperty(JSON_PROPERTY_TRACEABILITY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTraceabilityItems(List<TraceabilityItem> traceabilityItems) {
    this.traceabilityItems = traceabilityItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceabilityResult traceabilityResult = (TraceabilityResult) o;
    return Objects.equals(this.limitWarnings, traceabilityResult.limitWarnings) &&
        Objects.equals(this.traceabilityItems, traceabilityResult.traceabilityItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitWarnings, traceabilityItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceabilityResult {\n");
    sb.append("    limitWarnings: ").append(toIndentedString(limitWarnings)).append("\n");
    sb.append("    traceabilityItems: ").append(toIndentedString(traceabilityItems)).append("\n");
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

