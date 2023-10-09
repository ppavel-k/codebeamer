

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
 * Tracker item type choice field
 */
@JsonPropertyOrder({
  TrackerItemChoiceField.JSON_PROPERTY_MULTIPLE_VALUES,
  TrackerItemChoiceField.JSON_PROPERTY_REFERENCE_TYPE
})
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class TrackerItemChoiceField extends AbstractField {
  public static final String JSON_PROPERTY_MULTIPLE_VALUES = "multipleValues";
  private Boolean multipleValues;

  public static final String JSON_PROPERTY_REFERENCE_TYPE = "referenceType";
  private String referenceType;

  public TrackerItemChoiceField() {

  }

  public TrackerItemChoiceField multipleValues(Boolean multipleValues) {
    
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


  public TrackerItemChoiceField referenceType(String referenceType) {
    
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
  public TrackerItemChoiceField id(Integer id) {
    this.setId(id);
    return this;
  }

  @Override
  public TrackerItemChoiceField name(String name) {
    this.setName(name);
    return this;
  }

  @Override
  public TrackerItemChoiceField description(String description) {
    this.setDescription(description);
    return this;
  }

  @Override
  public TrackerItemChoiceField type(String type) {
    this.setType(type);
    return this;
  }

  @Override
  public TrackerItemChoiceField hidden(Boolean hidden) {
    this.setHidden(hidden);
    return this;
  }

  @Override
  public TrackerItemChoiceField valueModel(String valueModel) {
    this.setValueModel(valueModel);
    return this;
  }

  @Override
  public TrackerItemChoiceField title(String title) {
    this.setTitle(title);
    return this;
  }

  @Override
  public TrackerItemChoiceField legacyRestName(String legacyRestName) {
    this.setLegacyRestName(legacyRestName);
    return this;
  }

  @Override
  public TrackerItemChoiceField trackerItemField(String trackerItemField) {
    this.setTrackerItemField(trackerItemField);
    return this;
  }

  @Override
  public TrackerItemChoiceField mandatoryInStatuses(List<ChoiceOptionReference> mandatoryInStatuses) {
    this.setMandatoryInStatuses(mandatoryInStatuses);
    return this;
  }

  @Override
  public TrackerItemChoiceField formula(String formula) {
    this.setFormula(formula);
    return this;
  }

  @Override
  public TrackerItemChoiceField hideIfDependencyFormula(String hideIfDependencyFormula) {
    this.setHideIfDependencyFormula(hideIfDependencyFormula);
    return this;
  }

  @Override
  public TrackerItemChoiceField mandatoryIfDependencyFormula(String mandatoryIfDependencyFormula) {
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
    TrackerItemChoiceField trackerItemChoiceField = (TrackerItemChoiceField) o;
    return Objects.equals(this.multipleValues, trackerItemChoiceField.multipleValues) &&
        Objects.equals(this.referenceType, trackerItemChoiceField.referenceType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multipleValues, referenceType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemChoiceField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    multipleValues: ").append(toIndentedString(multipleValues)).append("\n");
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
