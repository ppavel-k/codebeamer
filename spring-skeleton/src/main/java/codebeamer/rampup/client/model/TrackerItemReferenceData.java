

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
 * Properties of a tracker item reference
 */
@JsonPropertyOrder({
  TrackerItemReferenceData.JSON_PROPERTY_SUSPECT_PROPAGATION
})
public class TrackerItemReferenceData {
  /**
   * Type of suspect propagation
   */
  public enum SuspectPropagationEnum {
    DO_NOT_PROPAGATE("DO_NOT_PROPAGATE"),
    
    PROPAGATE("PROPAGATE"),
    
    REVERSE("REVERSE"),
    
    BIDIRECTIONAL("BIDIRECTIONAL");

    private String value;

    SuspectPropagationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SuspectPropagationEnum fromValue(String value) {
      for (SuspectPropagationEnum b : SuspectPropagationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SUSPECT_PROPAGATION = "suspectPropagation";
  private SuspectPropagationEnum suspectPropagation;

  public TrackerItemReferenceData() {
  }

  public TrackerItemReferenceData suspectPropagation(SuspectPropagationEnum suspectPropagation) {
    
    this.suspectPropagation = suspectPropagation;
    return this;
  }

   /**
   * Type of suspect propagation
   * @return suspectPropagation
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SUSPECT_PROPAGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SuspectPropagationEnum getSuspectPropagation() {
    return suspectPropagation;
  }


  @JsonProperty(JSON_PROPERTY_SUSPECT_PROPAGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuspectPropagation(SuspectPropagationEnum suspectPropagation) {
    this.suspectPropagation = suspectPropagation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemReferenceData trackerItemReferenceData = (TrackerItemReferenceData) o;
    return Objects.equals(this.suspectPropagation, trackerItemReferenceData.suspectPropagation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suspectPropagation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemReferenceData {\n");
    sb.append("    suspectPropagation: ").append(toIndentedString(suspectPropagation)).append("\n");
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

