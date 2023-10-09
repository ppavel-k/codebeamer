

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;

/**
 * Table field
 */
@JsonPropertyOrder({
  TableField.JSON_PROPERTY_COLUMNS
})
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class TableField extends AbstractField {
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<AbstractField> columns;

  public TableField() {

  }

  public TableField columns(List<AbstractField> columns) {
    
    this.columns = columns;
    return this;
  }

  public TableField addColumnsItem(AbstractField columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Columns of a table
   * @return columns
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractField> getColumns() {
    return columns;
  }


  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColumns(List<AbstractField> columns) {
    this.columns = columns;
  }

  @Override
  public TableField id(Integer id) {
    this.setId(id);
    return this;
  }

  @Override
  public TableField name(String name) {
    this.setName(name);
    return this;
  }

  @Override
  public TableField description(String description) {
    this.setDescription(description);
    return this;
  }

  @Override
  public TableField type(String type) {
    this.setType(type);
    return this;
  }

  @Override
  public TableField hidden(Boolean hidden) {
    this.setHidden(hidden);
    return this;
  }

  @Override
  public TableField valueModel(String valueModel) {
    this.setValueModel(valueModel);
    return this;
  }

  @Override
  public TableField title(String title) {
    this.setTitle(title);
    return this;
  }

  @Override
  public TableField legacyRestName(String legacyRestName) {
    this.setLegacyRestName(legacyRestName);
    return this;
  }

  @Override
  public TableField trackerItemField(String trackerItemField) {
    this.setTrackerItemField(trackerItemField);
    return this;
  }

  @Override
  public TableField mandatoryInStatuses(List<ChoiceOptionReference> mandatoryInStatuses) {
    this.setMandatoryInStatuses(mandatoryInStatuses);
    return this;
  }

  @Override
  public TableField formula(String formula) {
    this.setFormula(formula);
    return this;
  }

  @Override
  public TableField hideIfDependencyFormula(String hideIfDependencyFormula) {
    this.setHideIfDependencyFormula(hideIfDependencyFormula);
    return this;
  }

  @Override
  public TableField mandatoryIfDependencyFormula(String mandatoryIfDependencyFormula) {
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
    TableField tableField = (TableField) o;
    return Objects.equals(this.columns, tableField.columns) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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

