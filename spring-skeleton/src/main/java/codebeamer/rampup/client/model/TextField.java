

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
 * Text field
 */
@JsonPropertyOrder({
  TextField.JSON_PROPERTY_MIN,
  TextField.JSON_PROPERTY_MAX
})
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class TextField extends AbstractField {
  public static final String JSON_PROPERTY_MIN = "min";
  private Integer min;

  public static final String JSON_PROPERTY_MAX = "max";
  private Integer max;

  public TextField() {

  }

  public TextField min(Integer min) {
    
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


  public TextField max(Integer max) {
    
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
  public TextField id(Integer id) {
    this.setId(id);
    return this;
  }

  @Override
  public TextField name(String name) {
    this.setName(name);
    return this;
  }

  @Override
  public TextField description(String description) {
    this.setDescription(description);
    return this;
  }

  @Override
  public TextField type(String type) {
    this.setType(type);
    return this;
  }

  @Override
  public TextField hidden(Boolean hidden) {
    this.setHidden(hidden);
    return this;
  }

  @Override
  public TextField valueModel(String valueModel) {
    this.setValueModel(valueModel);
    return this;
  }

  @Override
  public TextField title(String title) {
    this.setTitle(title);
    return this;
  }

  @Override
  public TextField legacyRestName(String legacyRestName) {
    this.setLegacyRestName(legacyRestName);
    return this;
  }

  @Override
  public TextField trackerItemField(String trackerItemField) {
    this.setTrackerItemField(trackerItemField);
    return this;
  }

  @Override
  public TextField mandatoryInStatuses(List<ChoiceOptionReference> mandatoryInStatuses) {
    this.setMandatoryInStatuses(mandatoryInStatuses);
    return this;
  }

  @Override
  public TextField formula(String formula) {
    this.setFormula(formula);
    return this;
  }

  @Override
  public TextField hideIfDependencyFormula(String hideIfDependencyFormula) {
    this.setHideIfDependencyFormula(hideIfDependencyFormula);
    return this;
  }

  @Override
  public TextField mandatoryIfDependencyFormula(String mandatoryIfDependencyFormula) {
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
    TextField textField = (TextField) o;
    return Objects.equals(this.min, textField.min) &&
        Objects.equals(this.max, textField.max) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextField {\n");
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
