

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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.Nullable;

/**
 * Option type choice field
 */
@JsonPropertyOrder({
  OptionChoiceField.JSON_PROPERTY_MULTIPLE_VALUES,
  OptionChoiceField.JSON_PROPERTY_OPTIONS,
  OptionChoiceField.JSON_PROPERTY_REFERENCE_TYPE
})
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class OptionChoiceField extends AbstractField {
  public static final String JSON_PROPERTY_MULTIPLE_VALUES = "multipleValues";
  private Boolean multipleValues;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private List<ChoiceOptionReference> options;

  public static final String JSON_PROPERTY_REFERENCE_TYPE = "referenceType";
  private String referenceType;

  public OptionChoiceField() {

  }

  public OptionChoiceField multipleValues(Boolean multipleValues) {
    
    this.multipleValues = multipleValues;
    return this;
  }

   /**
   * Multiple values state of a field
   * @return multipleValues
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MULTIPLE_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMultipleValues() {
    return multipleValues;
  }


  @JsonProperty(JSON_PROPERTY_MULTIPLE_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultipleValues(Boolean multipleValues) {
    this.multipleValues = multipleValues;
  }


  public OptionChoiceField options(List<ChoiceOptionReference> options) {
    
    this.options = options;
    return this;
  }

  public OptionChoiceField addOptionsItem(ChoiceOptionReference optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Available options of a choice field
   * @return options
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ChoiceOptionReference> getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(List<ChoiceOptionReference> options) {
    this.options = options;
  }


  public OptionChoiceField referenceType(String referenceType) {
    
    this.referenceType = referenceType;
    return this;
  }

   /**
   * Type of the contained references
   * @return referenceType
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferenceType() {
    return referenceType;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }

  @Override
  public OptionChoiceField id(Integer id) {
    this.setId(id);
    return this;
  }

  @Override
  public OptionChoiceField name(String name) {
    this.setName(name);
    return this;
  }

  @Override
  public OptionChoiceField description(String description) {
    this.setDescription(description);
    return this;
  }

  @Override
  public OptionChoiceField type(String type) {
    this.setType(type);
    return this;
  }

  @Override
  public OptionChoiceField hidden(Boolean hidden) {
    this.setHidden(hidden);
    return this;
  }

  @Override
  public OptionChoiceField valueModel(String valueModel) {
    this.setValueModel(valueModel);
    return this;
  }

  @Override
  public OptionChoiceField title(String title) {
    this.setTitle(title);
    return this;
  }

  @Override
  public OptionChoiceField legacyRestName(String legacyRestName) {
    this.setLegacyRestName(legacyRestName);
    return this;
  }

  @Override
  public OptionChoiceField trackerItemField(String trackerItemField) {
    this.setTrackerItemField(trackerItemField);
    return this;
  }

  @Override
  public OptionChoiceField mandatoryInStatuses(List<ChoiceOptionReference> mandatoryInStatuses) {
    this.setMandatoryInStatuses(mandatoryInStatuses);
    return this;
  }

  @Override
  public OptionChoiceField formula(String formula) {
    this.setFormula(formula);
    return this;
  }

  @Override
  public OptionChoiceField hideIfDependencyFormula(String hideIfDependencyFormula) {
    this.setHideIfDependencyFormula(hideIfDependencyFormula);
    return this;
  }

  @Override
  public OptionChoiceField mandatoryIfDependencyFormula(String mandatoryIfDependencyFormula) {
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
    OptionChoiceField optionChoiceField = (OptionChoiceField) o;
    return Objects.equals(this.multipleValues, optionChoiceField.multipleValues) &&
        Objects.equals(this.options, optionChoiceField.options) &&
        Objects.equals(this.referenceType, optionChoiceField.referenceType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multipleValues, options, referenceType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionChoiceField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    multipleValues: ").append(toIndentedString(multipleValues)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
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

