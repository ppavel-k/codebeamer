

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.Nullable;

/**
 * Revision history entry.
 */
@JsonPropertyOrder({
  TrackerItemHistoryRevision.JSON_PROPERTY_ITEM_REVISION,
  TrackerItemHistoryRevision.JSON_PROPERTY_CHANGES,
  TrackerItemHistoryRevision.JSON_PROPERTY_MODIFIED_BY,
  TrackerItemHistoryRevision.JSON_PROPERTY_MODIFIED_AT
})
public class TrackerItemHistoryRevision {
  public static final String JSON_PROPERTY_ITEM_REVISION = "itemRevision";
  private TrackerItemRevision itemRevision;

  public static final String JSON_PROPERTY_CHANGES = "changes";
  private List<TrackerItemChange> changes;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private UserReference modifiedBy;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
  private OffsetDateTime modifiedAt;

  public TrackerItemHistoryRevision() {
  }

  public TrackerItemHistoryRevision itemRevision(TrackerItemRevision itemRevision) {
    
    this.itemRevision = itemRevision;
    return this;
  }

   /**
   * Get itemRevision
   * @return itemRevision
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ITEM_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrackerItemRevision getItemRevision() {
    return itemRevision;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemRevision(TrackerItemRevision itemRevision) {
    this.itemRevision = itemRevision;
  }


  public TrackerItemHistoryRevision changes(List<TrackerItemChange> changes) {
    
    this.changes = changes;
    return this;
  }

  public TrackerItemHistoryRevision addChangesItem(TrackerItemChange changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<>();
    }
    this.changes.add(changesItem);
    return this;
  }

   /**
   * Changes happened between the previous and current revision.
   * @return changes
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemChange> getChanges() {
    return changes;
  }


  @JsonProperty(JSON_PROPERTY_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChanges(List<TrackerItemChange> changes) {
    this.changes = changes;
  }


  public TrackerItemHistoryRevision modifiedBy(UserReference modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserReference getModifiedBy() {
    return modifiedBy;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public TrackerItemHistoryRevision modifiedAt(OffsetDateTime modifiedAt) {
    
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * The date when the entity was modified
   * @return modifiedAt
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemHistoryRevision trackerItemHistoryRevision = (TrackerItemHistoryRevision) o;
    return Objects.equals(this.itemRevision, trackerItemHistoryRevision.itemRevision) &&
        Objects.equals(this.changes, trackerItemHistoryRevision.changes) &&
        Objects.equals(this.modifiedBy, trackerItemHistoryRevision.modifiedBy) &&
        Objects.equals(this.modifiedAt, trackerItemHistoryRevision.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemRevision, changes, modifiedBy, modifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemHistoryRevision {\n");
    sb.append("    itemRevision: ").append(toIndentedString(itemRevision)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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

