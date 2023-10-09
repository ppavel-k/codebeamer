

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
 * Update fields of a tracker item and provide the itemId as well
 */
@JsonPropertyOrder({
  UpdateTrackerItemFieldWithItemId.JSON_PROPERTY_FIELD_VALUES,
  UpdateTrackerItemFieldWithItemId.JSON_PROPERTY_TABLE_VALUES,
  UpdateTrackerItemFieldWithItemId.JSON_PROPERTY_ITEM_ID
})
public class UpdateTrackerItemFieldWithItemId {
  public static final String JSON_PROPERTY_FIELD_VALUES = "fieldValues";
  private List<AbstractFieldValue> fieldValues;

  public static final String JSON_PROPERTY_TABLE_VALUES = "tableValues";
  private List<TableFieldValue> tableValues;

  public static final String JSON_PROPERTY_ITEM_ID = "itemId";
  private Integer itemId;

  public UpdateTrackerItemFieldWithItemId() {
  }

  public UpdateTrackerItemFieldWithItemId fieldValues(List<AbstractFieldValue> fieldValues) {
    
    this.fieldValues = fieldValues;
    return this;
  }

  public UpdateTrackerItemFieldWithItemId addFieldValuesItem(AbstractFieldValue fieldValuesItem) {
    if (this.fieldValues == null) {
      this.fieldValues = new ArrayList<>();
    }
    this.fieldValues.add(fieldValuesItem);
    return this;
  }

   /**
   * Fields of a tracker item
   * @return fieldValues
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractFieldValue> getFieldValues() {
    return fieldValues;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldValues(List<AbstractFieldValue> fieldValues) {
    this.fieldValues = fieldValues;
  }


  public UpdateTrackerItemFieldWithItemId tableValues(List<TableFieldValue> tableValues) {
    
    this.tableValues = tableValues;
    return this;
  }

  public UpdateTrackerItemFieldWithItemId addTableValuesItem(TableFieldValue tableValuesItem) {
    if (this.tableValues == null) {
      this.tableValues = new ArrayList<>();
    }
    this.tableValues.add(tableValuesItem);
    return this;
  }

   /**
   * Fields of a tracker item
   * @return tableValues
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TABLE_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TableFieldValue> getTableValues() {
    return tableValues;
  }


  @JsonProperty(JSON_PROPERTY_TABLE_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTableValues(List<TableFieldValue> tableValues) {
    this.tableValues = tableValues;
  }


  public UpdateTrackerItemFieldWithItemId itemId(Integer itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Id of a tracker item
   * @return itemId
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getItemId() {
    return itemId;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTrackerItemFieldWithItemId updateTrackerItemFieldWithItemId = (UpdateTrackerItemFieldWithItemId) o;
    return Objects.equals(this.fieldValues, updateTrackerItemFieldWithItemId.fieldValues) &&
        Objects.equals(this.tableValues, updateTrackerItemFieldWithItemId.tableValues) &&
        Objects.equals(this.itemId, updateTrackerItemFieldWithItemId.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldValues, tableValues, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTrackerItemFieldWithItemId {\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("    tableValues: ").append(toIndentedString(tableValues)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

