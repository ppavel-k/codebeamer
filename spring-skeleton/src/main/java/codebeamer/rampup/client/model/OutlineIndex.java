

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
 * Represents the index of an item on a specific outline level.
 */
@JsonPropertyOrder({
  OutlineIndex.JSON_PROPERTY_LEVEL,
  OutlineIndex.JSON_PROPERTY_INDEX
})
public class OutlineIndex {
  public static final String JSON_PROPERTY_LEVEL = "level";
  private Integer level;

  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index;

  public OutlineIndex() {
  }

  public OutlineIndex level(Integer level) {
    
    this.level = level;
    return this;
  }

   /**
   * Outline level
   * @return level
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel(Integer level) {
    this.level = level;
  }


  public OutlineIndex index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Outline index
   * @return index
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    OutlineIndex outlineIndex = (OutlineIndex) o;
    return Objects.equals(this.level, outlineIndex.level) &&
        Objects.equals(this.index, outlineIndex.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlineIndex {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

