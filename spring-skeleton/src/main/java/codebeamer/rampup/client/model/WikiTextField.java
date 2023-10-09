

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.Nullable;

/**
 * Wiki text field
 */
@JsonPropertyOrder({
  WikiTextField.JSON_PROPERTY_MIN,
  WikiTextField.JSON_PROPERTY_MAX
})
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class WikiTextField extends AbstractField {
  public static final String JSON_PROPERTY_MIN = "min";
  private Integer min;

  public static final String JSON_PROPERTY_MAX = "max";
  private Integer max;

  public WikiTextField() {

  }

  public WikiTextField min(Integer min) {
    
    this.min = min;
    return this;
  }

   /**
   * Minimum length of value of a field
   * @return min
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMin() {
    return min;
  }


  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMin(Integer min) {
    this.min = min;
  }


  public WikiTextField max(Integer max) {
    
    this.max = max;
    return this;
  }

   /**
   * Max length of value of a field
   * @return max
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMax() {
    return max;
  }


  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMax(Integer max) {
    this.max = max;
  }

  @Override
  public WikiTextField id(Integer id) {
    this.setId(id);
    return this;
  }

  @Override
  public WikiTextField name(String name) {
    this.setName(name);
    return this;
  }

  @Override
  public WikiTextField description(String description) {
    this.setDescription(description);
    return this;
  }

  @Override
  public WikiTextField type(String type) {
    this.setType(type);
    return this;
  }

  @Override
  public WikiTextField hidden(Boolean hidden) {
    this.setHidden(hidden);
    return this;
  }

  @Override
  public WikiTextField valueModel(String valueModel) {
    this.setValueModel(valueModel);
    return this;
  }

  @Override
  public WikiTextField title(String title) {
    this.setTitle(title);
    return this;
  }

  @Override
  public WikiTextField legacyRestName(String legacyRestName) {
    this.setLegacyRestName(legacyRestName);
    return this;
  }

  @Override
  public WikiTextField trackerItemField(String trackerItemField) {
    this.setTrackerItemField(trackerItemField);
    return this;
  }

  @Override
  public WikiTextField mandatoryInStatuses(List<ChoiceOptionReference> mandatoryInStatuses) {
    this.setMandatoryInStatuses(mandatoryInStatuses);
    return this;
  }

  @Override
  public WikiTextField formula(String formula) {
    this.setFormula(formula);
    return this;
  }

  @Override
  public WikiTextField hideIfDependencyFormula(String hideIfDependencyFormula) {
    this.setHideIfDependencyFormula(hideIfDependencyFormula);
    return this;
  }

  @Override
  public WikiTextField mandatoryIfDependencyFormula(String mandatoryIfDependencyFormula) {
    this.setMandatoryIfDependencyFormula(mandatoryIfDependencyFormula);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WikiTextField wikiTextField = (WikiTextField) o;
    return Objects.equals(this.min, wikiTextField.min) &&
        Objects.equals(this.max, wikiTextField.max) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WikiTextField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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
