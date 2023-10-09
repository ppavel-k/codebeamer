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
 * Abstract field
 */
@JsonPropertyOrder({
  AbstractField.JSON_PROPERTY_ID,
  AbstractField.JSON_PROPERTY_NAME,
  AbstractField.JSON_PROPERTY_DESCRIPTION,
  AbstractField.JSON_PROPERTY_TYPE,
  AbstractField.JSON_PROPERTY_HIDDEN,
  AbstractField.JSON_PROPERTY_VALUE_MODEL,
  AbstractField.JSON_PROPERTY_TITLE,
  AbstractField.JSON_PROPERTY_LEGACY_REST_NAME,
  AbstractField.JSON_PROPERTY_TRACKER_ITEM_FIELD,
  AbstractField.JSON_PROPERTY_MANDATORY_IN_STATUSES,
  AbstractField.JSON_PROPERTY_FORMULA,
  AbstractField.JSON_PROPERTY_HIDE_IF_DEPENDENCY_FORMULA,
  AbstractField.JSON_PROPERTY_MANDATORY_IF_DEPENDENCY_FORMULA
})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = ArtifactReferenceField.class, name = "ArtifactReferenceField"),
  @JsonSubTypes.Type(value = BoolField.class, name = "BoolField"),
  @JsonSubTypes.Type(value = ColorField.class, name = "ColorField"),
  @JsonSubTypes.Type(value = CountryField.class, name = "CountryField"),
  @JsonSubTypes.Type(value = DateField.class, name = "DateField"),
  @JsonSubTypes.Type(value = DecimalField.class, name = "DecimalField"),
  @JsonSubTypes.Type(value = DurationField.class, name = "DurationField"),
  @JsonSubTypes.Type(value = IntegerField.class, name = "IntegerField"),
  @JsonSubTypes.Type(value = LanguageField.class, name = "LanguageField"),
  @JsonSubTypes.Type(value = MemberField.class, name = "MemberField"),
  @JsonSubTypes.Type(value = OptionChoiceField.class, name = "OptionChoiceField"),
  @JsonSubTypes.Type(value = ProjectChoiceField.class, name = "ProjectChoiceField"),
  @JsonSubTypes.Type(value = ReferenceField.class, name = "ReferenceField"),
  @JsonSubTypes.Type(value = RepositoryChoiceField.class, name = "RepositoryChoiceField"),
  @JsonSubTypes.Type(value = ReviewMemberReferenceField.class, name = "ReviewMemberReferenceField"),
  @JsonSubTypes.Type(value = TableField.class, name = "TableField"),
  @JsonSubTypes.Type(value = TextField.class, name = "TextField"),
  @JsonSubTypes.Type(value = TrackerChoiceField.class, name = "TrackerChoiceField"),
  @JsonSubTypes.Type(value = TrackerItemChoiceField.class, name = "TrackerItemChoiceField"),
  @JsonSubTypes.Type(value = UrlField.class, name = "UrlField"),
  @JsonSubTypes.Type(value = UserChoiceField.class, name = "UserChoiceField"),
  @JsonSubTypes.Type(value = WikiTextField.class, name = "WikiTextField"),
})

public class AbstractField {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type;

  public static final String JSON_PROPERTY_HIDDEN = "hidden";
  private Boolean hidden;

  public static final String JSON_PROPERTY_VALUE_MODEL = "valueModel";
  private String valueModel;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_LEGACY_REST_NAME = "legacyRestName";
  private String legacyRestName;

  public static final String JSON_PROPERTY_TRACKER_ITEM_FIELD = "trackerItemField";
  private String trackerItemField;

  public static final String JSON_PROPERTY_MANDATORY_IN_STATUSES = "mandatoryInStatuses";
  private List<ChoiceOptionReference> mandatoryInStatuses;

  public static final String JSON_PROPERTY_FORMULA = "formula";
  private String formula;

  public static final String JSON_PROPERTY_HIDE_IF_DEPENDENCY_FORMULA = "hideIfDependencyFormula";
  private String hideIfDependencyFormula;

  public static final String JSON_PROPERTY_MANDATORY_IF_DEPENDENCY_FORMULA = "mandatoryIfDependencyFormula";
  private String mandatoryIfDependencyFormula;

  public AbstractField() {
  }

  public AbstractField id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of a field
   * @return id
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public AbstractField name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of a field
   * @return name
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public AbstractField description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of a field
   * @return description
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public AbstractField type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of a field
   * @return type
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public AbstractField hidden(Boolean hidden) {
    
    this.hidden = hidden;
    return this;
  }

   /**
   * Visibility status of a field
   * @return hidden
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHidden() {
    return hidden;
  }


  @JsonProperty(JSON_PROPERTY_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  public AbstractField valueModel(String valueModel) {
    
    this.valueModel = valueModel;
    return this;
  }

   /**
   * Name of the updater/getter value model
   * @return valueModel
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_VALUE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueModel() {
    return valueModel;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueModel(String valueModel) {
    this.valueModel = valueModel;
  }


  public AbstractField title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of a field
   * @return title
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public AbstractField legacyRestName(String legacyRestName) {
    
    this.legacyRestName = legacyRestName;
    return this;
  }

   /**
   * Identifier matching the legacy REST API naming
   * @return legacyRestName
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_LEGACY_REST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLegacyRestName() {
    return legacyRestName;
  }


  @JsonProperty(JSON_PROPERTY_LEGACY_REST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegacyRestName(String legacyRestName) {
    this.legacyRestName = legacyRestName;
  }


  public AbstractField trackerItemField(String trackerItemField) {
    
    this.trackerItemField = trackerItemField;
    return this;
  }

   /**
   * Tracker item&#39;s field name for this field
   * @return trackerItemField
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TRACKER_ITEM_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackerItemField() {
    return trackerItemField;
  }


  @JsonProperty(JSON_PROPERTY_TRACKER_ITEM_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackerItemField(String trackerItemField) {
    this.trackerItemField = trackerItemField;
  }


  public AbstractField mandatoryInStatuses(List<ChoiceOptionReference> mandatoryInStatuses) {
    
    this.mandatoryInStatuses = mandatoryInStatuses;
    return this;
  }

  public AbstractField addMandatoryInStatusesItem(ChoiceOptionReference mandatoryInStatusesItem) {
    if (this.mandatoryInStatuses == null) {
      this.mandatoryInStatuses = new ArrayList<>();
    }
    this.mandatoryInStatuses.add(mandatoryInStatusesItem);
    return this;
  }

   /**
   * List of statuses where the field is mandatory.
   * @return mandatoryInStatuses
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MANDATORY_IN_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ChoiceOptionReference> getMandatoryInStatuses() {
    return mandatoryInStatuses;
  }


  @JsonProperty(JSON_PROPERTY_MANDATORY_IN_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMandatoryInStatuses(List<ChoiceOptionReference> mandatoryInStatuses) {
    this.mandatoryInStatuses = mandatoryInStatuses;
  }


  public AbstractField formula(String formula) {
    
    this.formula = formula;
    return this;
  }

   /**
   * Formula value of a field
   * @return formula
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_FORMULA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormula() {
    return formula;
  }


  @JsonProperty(JSON_PROPERTY_FORMULA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormula(String formula) {
    this.formula = formula;
  }


  public AbstractField hideIfDependencyFormula(String hideIfDependencyFormula) {
    
    this.hideIfDependencyFormula = hideIfDependencyFormula;
    return this;
  }

   /**
   * Hide If dependency formula value of a field
   * @return hideIfDependencyFormula
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_IF_DEPENDENCY_FORMULA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHideIfDependencyFormula() {
    return hideIfDependencyFormula;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_IF_DEPENDENCY_FORMULA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideIfDependencyFormula(String hideIfDependencyFormula) {
    this.hideIfDependencyFormula = hideIfDependencyFormula;
  }


  public AbstractField mandatoryIfDependencyFormula(String mandatoryIfDependencyFormula) {
    
    this.mandatoryIfDependencyFormula = mandatoryIfDependencyFormula;
    return this;
  }

   /**
   * Mandatory If dependency formula value of a field
   * @return mandatoryIfDependencyFormula
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MANDATORY_IF_DEPENDENCY_FORMULA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMandatoryIfDependencyFormula() {
    return mandatoryIfDependencyFormula;
  }


  @JsonProperty(JSON_PROPERTY_MANDATORY_IF_DEPENDENCY_FORMULA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMandatoryIfDependencyFormula(String mandatoryIfDependencyFormula) {
    this.mandatoryIfDependencyFormula = mandatoryIfDependencyFormula;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractField abstractField = (AbstractField) o;
    return Objects.equals(this.id, abstractField.id) &&
        Objects.equals(this.name, abstractField.name) &&
        Objects.equals(this.description, abstractField.description) &&
        Objects.equals(this.type, abstractField.type) &&
        Objects.equals(this.hidden, abstractField.hidden) &&
        Objects.equals(this.valueModel, abstractField.valueModel) &&
        Objects.equals(this.title, abstractField.title) &&
        Objects.equals(this.legacyRestName, abstractField.legacyRestName) &&
        Objects.equals(this.trackerItemField, abstractField.trackerItemField) &&
        Objects.equals(this.mandatoryInStatuses, abstractField.mandatoryInStatuses) &&
        Objects.equals(this.formula, abstractField.formula) &&
        Objects.equals(this.hideIfDependencyFormula, abstractField.hideIfDependencyFormula) &&
        Objects.equals(this.mandatoryIfDependencyFormula, abstractField.mandatoryIfDependencyFormula);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, type, hidden, valueModel, title, legacyRestName, trackerItemField, mandatoryInStatuses, formula, hideIfDependencyFormula, mandatoryIfDependencyFormula);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractField {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    valueModel: ").append(toIndentedString(valueModel)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    legacyRestName: ").append(toIndentedString(legacyRestName)).append("\n");
    sb.append("    trackerItemField: ").append(toIndentedString(trackerItemField)).append("\n");
    sb.append("    mandatoryInStatuses: ").append(toIndentedString(mandatoryInStatuses)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    hideIfDependencyFormula: ").append(toIndentedString(hideIfDependencyFormula)).append("\n");
    sb.append("    mandatoryIfDependencyFormula: ").append(toIndentedString(mandatoryIfDependencyFormula)).append("\n");
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

