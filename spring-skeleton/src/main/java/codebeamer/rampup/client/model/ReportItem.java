

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.Nullable;

/**
 * An item of the report.
 */
@JsonPropertyOrder({
  ReportItem.JSON_PROPERTY_ITEM,
  ReportItem.JSON_PROPERTY_OUTLINE_LEVEL,
  ReportItem.JSON_PROPERTY_IS_REAL_RESULT
})
public class ReportItem {
  public static final String JSON_PROPERTY_ITEM = "item";
  private TrackerItem item;

  public static final String JSON_PROPERTY_OUTLINE_LEVEL = "outlineLevel";
  private Integer outlineLevel;

  public static final String JSON_PROPERTY_IS_REAL_RESULT = "isRealResult";
  private Boolean isRealResult;

  public ReportItem() {
  }

  public ReportItem item(TrackerItem item) {
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrackerItem getItem() {
    return item;
  }


  @JsonProperty(JSON_PROPERTY_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItem(TrackerItem item) {
    this.item = item;
  }


  public ReportItem outlineLevel(Integer outlineLevel) {
    
    this.outlineLevel = outlineLevel;
    return this;
  }

   /**
   * Item&#39;s level in the tracker outline.
   * @return outlineLevel
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_OUTLINE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOutlineLevel() {
    return outlineLevel;
  }


  @JsonProperty(JSON_PROPERTY_OUTLINE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutlineLevel(Integer outlineLevel) {
    this.outlineLevel = outlineLevel;
  }


  public ReportItem isRealResult(Boolean isRealResult) {
    
    this.isRealResult = isRealResult;
    return this;
  }

   /**
   * Indicator if the item is a real query result (e.g. not an ancestor item).
   * @return isRealResult
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_IS_REAL_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRealResult() {
    return isRealResult;
  }


  @JsonProperty(JSON_PROPERTY_IS_REAL_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRealResult(Boolean isRealResult) {
    this.isRealResult = isRealResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportItem reportItem = (ReportItem) o;
    return Objects.equals(this.item, reportItem.item) &&
        Objects.equals(this.outlineLevel, reportItem.outlineLevel) &&
        Objects.equals(this.isRealResult, reportItem.isRealResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, outlineLevel, isRealResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportItem {\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    outlineLevel: ").append(toIndentedString(outlineLevel)).append("\n");
    sb.append("    isRealResult: ").append(toIndentedString(isRealResult)).append("\n");
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

