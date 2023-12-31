

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Url field
 */

@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class UrlField extends AbstractField {
  public UrlField() {

  }
  @Override
  public UrlField id(Integer id) {
    this.setId(id);
    return this;
  }

  @Override
  public UrlField name(String name) {
    this.setName(name);
    return this;
  }

  @Override
  public UrlField description(String description) {
    this.setDescription(description);
    return this;
  }

  @Override
  public UrlField type(String type) {
    this.setType(type);
    return this;
  }

  @Override
  public UrlField hidden(Boolean hidden) {
    this.setHidden(hidden);
    return this;
  }

  @Override
  public UrlField valueModel(String valueModel) {
    this.setValueModel(valueModel);
    return this;
  }

  @Override
  public UrlField title(String title) {
    this.setTitle(title);
    return this;
  }

  @Override
  public UrlField legacyRestName(String legacyRestName) {
    this.setLegacyRestName(legacyRestName);
    return this;
  }

  @Override
  public UrlField trackerItemField(String trackerItemField) {
    this.setTrackerItemField(trackerItemField);
    return this;
  }

  @Override
  public UrlField mandatoryInStatuses(List<ChoiceOptionReference> mandatoryInStatuses) {
    this.setMandatoryInStatuses(mandatoryInStatuses);
    return this;
  }

  @Override
  public UrlField formula(String formula) {
    this.setFormula(formula);
    return this;
  }

  @Override
  public UrlField hideIfDependencyFormula(String hideIfDependencyFormula) {
    this.setHideIfDependencyFormula(hideIfDependencyFormula);
    return this;
  }

  @Override
  public UrlField mandatoryIfDependencyFormula(String mandatoryIfDependencyFormula) {
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
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

