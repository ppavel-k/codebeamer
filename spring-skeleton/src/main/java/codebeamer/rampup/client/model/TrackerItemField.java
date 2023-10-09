

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.Nullable;

/**
 * TrackerItemField
 */
@JsonPropertyOrder({
  TrackerItemField.JSON_PROPERTY_EDITABLE_FIELDS,
  TrackerItemField.JSON_PROPERTY_READ_ONLY_FIELDS,
  TrackerItemField.JSON_PROPERTY_EDITABLE_TABLE_FIELDS,
  TrackerItemField.JSON_PROPERTY_READ_ONLY_TABLE_FIELDS
})
public class TrackerItemField {
  public static final String JSON_PROPERTY_EDITABLE_FIELDS = "editableFields";
  private List<AbstractFieldValue> editableFields;

  public static final String JSON_PROPERTY_READ_ONLY_FIELDS = "readOnlyFields";
  private List<AbstractFieldValue> readOnlyFields;

  public static final String JSON_PROPERTY_EDITABLE_TABLE_FIELDS = "editableTableFields";
  private List<TableFieldValue> editableTableFields;

  public static final String JSON_PROPERTY_READ_ONLY_TABLE_FIELDS = "readOnlyTableFields";
  private List<TableFieldValue> readOnlyTableFields;

  public TrackerItemField() {
  }

  public TrackerItemField editableFields(List<AbstractFieldValue> editableFields) {
    
    this.editableFields = editableFields;
    return this;
  }

  public TrackerItemField addEditableFieldsItem(AbstractFieldValue editableFieldsItem) {
    if (this.editableFields == null) {
      this.editableFields = new ArrayList<>();
    }
    this.editableFields.add(editableFieldsItem);
    return this;
  }

   /**
   * Fields which can be modified
   * @return editableFields
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_EDITABLE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractFieldValue> getEditableFields() {
    return editableFields;
  }


  @JsonProperty(JSON_PROPERTY_EDITABLE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditableFields(List<AbstractFieldValue> editableFields) {
    this.editableFields = editableFields;
  }


  public TrackerItemField readOnlyFields(List<AbstractFieldValue> readOnlyFields) {
    
    this.readOnlyFields = readOnlyFields;
    return this;
  }

  public TrackerItemField addReadOnlyFieldsItem(AbstractFieldValue readOnlyFieldsItem) {
    if (this.readOnlyFields == null) {
      this.readOnlyFields = new ArrayList<>();
    }
    this.readOnlyFields.add(readOnlyFieldsItem);
    return this;
  }

   /**
   * Fields which are not writable in the current state
   * @return readOnlyFields
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_READ_ONLY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractFieldValue> getReadOnlyFields() {
    return readOnlyFields;
  }


  @JsonProperty(JSON_PROPERTY_READ_ONLY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadOnlyFields(List<AbstractFieldValue> readOnlyFields) {
    this.readOnlyFields = readOnlyFields;
  }


  public TrackerItemField editableTableFields(List<TableFieldValue> editableTableFields) {
    
    this.editableTableFields = editableTableFields;
    return this;
  }

  public TrackerItemField addEditableTableFieldsItem(TableFieldValue editableTableFieldsItem) {
    if (this.editableTableFields == null) {
      this.editableTableFields = new ArrayList<>();
    }
    this.editableTableFields.add(editableTableFieldsItem);
    return this;
  }

   /**
   * Table fields which can be modified
   * @return editableTableFields
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_EDITABLE_TABLE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TableFieldValue> getEditableTableFields() {
    return editableTableFields;
  }


  @JsonProperty(JSON_PROPERTY_EDITABLE_TABLE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditableTableFields(List<TableFieldValue> editableTableFields) {
    this.editableTableFields = editableTableFields;
  }


  public TrackerItemField readOnlyTableFields(List<TableFieldValue> readOnlyTableFields) {
    
    this.readOnlyTableFields = readOnlyTableFields;
    return this;
  }

  public TrackerItemField addReadOnlyTableFieldsItem(TableFieldValue readOnlyTableFieldsItem) {
    if (this.readOnlyTableFields == null) {
      this.readOnlyTableFields = new ArrayList<>();
    }
    this.readOnlyTableFields.add(readOnlyTableFieldsItem);
    return this;
  }

   /**
   * Table fields which are not writable in the current state
   * @return readOnlyTableFields
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_READ_ONLY_TABLE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TableFieldValue> getReadOnlyTableFields() {
    return readOnlyTableFields;
  }


  @JsonProperty(JSON_PROPERTY_READ_ONLY_TABLE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadOnlyTableFields(List<TableFieldValue> readOnlyTableFields) {
    this.readOnlyTableFields = readOnlyTableFields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemField trackerItemField = (TrackerItemField) o;
    return Objects.equals(this.editableFields, trackerItemField.editableFields) &&
        Objects.equals(this.readOnlyFields, trackerItemField.readOnlyFields) &&
        Objects.equals(this.editableTableFields, trackerItemField.editableTableFields) &&
        Objects.equals(this.readOnlyTableFields, trackerItemField.readOnlyTableFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editableFields, readOnlyFields, editableTableFields, readOnlyTableFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemField {\n");
    sb.append("    editableFields: ").append(toIndentedString(editableFields)).append("\n");
    sb.append("    readOnlyFields: ").append(toIndentedString(readOnlyFields)).append("\n");
    sb.append("    editableTableFields: ").append(toIndentedString(editableTableFields)).append("\n");
    sb.append("    readOnlyTableFields: ").append(toIndentedString(readOnlyTableFields)).append("\n");
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

