

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;

/**
 * Request for migrating attachments
 */
@JsonPropertyOrder({
  AttachmentMigrationRequest.JSON_PROPERTY_TARGET_ITEM,
  AttachmentMigrationRequest.JSON_PROPERTY_CREATED_AT,
  AttachmentMigrationRequest.JSON_PROPERTY_CREATED_BY,
  AttachmentMigrationRequest.JSON_PROPERTY_MODIFIED_AT,
  AttachmentMigrationRequest.JSON_PROPERTY_MODIFIED_BY,
  AttachmentMigrationRequest.JSON_PROPERTY_DESCRIPTION,
  AttachmentMigrationRequest.JSON_PROPERTY_DESCRIPTION_FORMAT,
  AttachmentMigrationRequest.JSON_PROPERTY_MIGRATION_ACTION,
  AttachmentMigrationRequest.JSON_PROPERTY_FILES
})
public class AttachmentMigrationRequest {
  public static final String JSON_PROPERTY_TARGET_ITEM = "targetItem";
  private TrackerItemReference targetItem;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private UserReference createdBy;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private UserReference modifiedBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  /**
   * Description format of the entity
   */
  public enum DescriptionFormatEnum {
    PLAINTEXT("PlainText"),
    
    HTML("Html"),
    
    WIKI("Wiki");

    private String value;

    DescriptionFormatEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DescriptionFormatEnum fromValue(String value) {
      for (DescriptionFormatEnum b : DescriptionFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DESCRIPTION_FORMAT = "descriptionFormat";
  private DescriptionFormatEnum descriptionFormat;

  /**
   * Type of action made on the source files.
   */
  public enum MigrationActionEnum {
    MOVE("MOVE"),
    
    COPY("COPY");

    private String value;

    MigrationActionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MigrationActionEnum fromValue(String value) {
      for (MigrationActionEnum b : MigrationActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MIGRATION_ACTION = "migrationAction";
  private MigrationActionEnum migrationAction;

  public static final String JSON_PROPERTY_FILES = "files";
  private List<RemoteMigrationFile> files;

  public AttachmentMigrationRequest() {
  }

  public AttachmentMigrationRequest targetItem(TrackerItemReference targetItem) {
    
    this.targetItem = targetItem;
    return this;
  }

   /**
   * Get targetItem
   * @return targetItem
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrackerItemReference getTargetItem() {
    return targetItem;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetItem(TrackerItemReference targetItem) {
    this.targetItem = targetItem;
  }


  public AttachmentMigrationRequest createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date when the entity was created
   * @return createdAt
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public AttachmentMigrationRequest createdBy(UserReference createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserReference getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(UserReference createdBy) {
    this.createdBy = createdBy;
  }


  public AttachmentMigrationRequest modifiedAt(OffsetDateTime modifiedAt) {
    
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


  public AttachmentMigrationRequest modifiedBy(UserReference modifiedBy) {
    
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


  public AttachmentMigrationRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the entity
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


  public AttachmentMigrationRequest descriptionFormat(DescriptionFormatEnum descriptionFormat) {
    
    this.descriptionFormat = descriptionFormat;
    return this;
  }

   /**
   * Description format of the entity
   * @return descriptionFormat
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DescriptionFormatEnum getDescriptionFormat() {
    return descriptionFormat;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescriptionFormat(DescriptionFormatEnum descriptionFormat) {
    this.descriptionFormat = descriptionFormat;
  }


  public AttachmentMigrationRequest migrationAction(MigrationActionEnum migrationAction) {
    
    this.migrationAction = migrationAction;
    return this;
  }

   /**
   * Type of action made on the source files.
   * @return migrationAction
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MIGRATION_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MigrationActionEnum getMigrationAction() {
    return migrationAction;
  }


  @JsonProperty(JSON_PROPERTY_MIGRATION_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMigrationAction(MigrationActionEnum migrationAction) {
    this.migrationAction = migrationAction;
  }


  public AttachmentMigrationRequest files(List<RemoteMigrationFile> files) {
    
    this.files = files;
    return this;
  }

  public AttachmentMigrationRequest addFilesItem(RemoteMigrationFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * List of files to migrate
   * @return files
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RemoteMigrationFile> getFiles() {
    return files;
  }


  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiles(List<RemoteMigrationFile> files) {
    this.files = files;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentMigrationRequest attachmentMigrationRequest = (AttachmentMigrationRequest) o;
    return Objects.equals(this.targetItem, attachmentMigrationRequest.targetItem) &&
        Objects.equals(this.createdAt, attachmentMigrationRequest.createdAt) &&
        Objects.equals(this.createdBy, attachmentMigrationRequest.createdBy) &&
        Objects.equals(this.modifiedAt, attachmentMigrationRequest.modifiedAt) &&
        Objects.equals(this.modifiedBy, attachmentMigrationRequest.modifiedBy) &&
        Objects.equals(this.description, attachmentMigrationRequest.description) &&
        Objects.equals(this.descriptionFormat, attachmentMigrationRequest.descriptionFormat) &&
        Objects.equals(this.migrationAction, attachmentMigrationRequest.migrationAction) &&
        Objects.equals(this.files, attachmentMigrationRequest.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetItem, createdAt, createdBy, modifiedAt, modifiedBy, description, descriptionFormat, migrationAction, files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentMigrationRequest {\n");
    sb.append("    targetItem: ").append(toIndentedString(targetItem)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionFormat: ").append(toIndentedString(descriptionFormat)).append("\n");
    sb.append("    migrationAction: ").append(toIndentedString(migrationAction)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

