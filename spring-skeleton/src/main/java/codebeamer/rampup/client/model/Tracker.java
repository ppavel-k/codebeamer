package codebeamer.rampup.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Basic properties of a codebeamer tracker
 */
@JsonPropertyOrder({
  Tracker.JSON_PROPERTY_ID,
  Tracker.JSON_PROPERTY_NAME,
  Tracker.JSON_PROPERTY_DESCRIPTION,
  Tracker.JSON_PROPERTY_DESCRIPTION_FORMAT,
  Tracker.JSON_PROPERTY_KEY_NAME,
  Tracker.JSON_PROPERTY_VERSION,
  Tracker.JSON_PROPERTY_CREATED_AT,
  Tracker.JSON_PROPERTY_CREATED_BY,
  Tracker.JSON_PROPERTY_MODIFIED_AT,
  Tracker.JSON_PROPERTY_MODIFIED_BY,
  Tracker.JSON_PROPERTY_TYPE,
  Tracker.JSON_PROPERTY_DELETED,
  Tracker.JSON_PROPERTY_HIDDEN,
  Tracker.JSON_PROPERTY_COLOR,
  Tracker.JSON_PROPERTY_USING_WORKFLOW,
  Tracker.JSON_PROPERTY_ONLY_WORKFLOW_CAN_CREATE_NEW_REFERRING_ITEM,
  Tracker.JSON_PROPERTY_USING_QUICK_TRANSITIONS,
  Tracker.JSON_PROPERTY_DEFAULT_SHOW_ANCESTOR_ITEMS,
  Tracker.JSON_PROPERTY_DEFAULT_SHOW_DESCENDANT_ITEMS,
  Tracker.JSON_PROPERTY_PROJECT,
  Tracker.JSON_PROPERTY_TEMPLATE_TRACKER,
  Tracker.JSON_PROPERTY_AVAILABLE_AS_TEMPLATE,
  Tracker.JSON_PROPERTY_SHARED_IN_WORKING_SET
})
public class Tracker {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

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

  public static final String JSON_PROPERTY_KEY_NAME = "keyName";
  private String keyName;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private UserReference createdBy;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private UserReference modifiedBy;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TrackerTypeReference type;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_HIDDEN = "hidden";
  private Boolean hidden;

  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public static final String JSON_PROPERTY_USING_WORKFLOW = "usingWorkflow";
  private Boolean usingWorkflow;

  public static final String JSON_PROPERTY_ONLY_WORKFLOW_CAN_CREATE_NEW_REFERRING_ITEM = "onlyWorkflowCanCreateNewReferringItem";
  private Boolean onlyWorkflowCanCreateNewReferringItem;

  public static final String JSON_PROPERTY_USING_QUICK_TRANSITIONS = "usingQuickTransitions";
  private Boolean usingQuickTransitions;

  public static final String JSON_PROPERTY_DEFAULT_SHOW_ANCESTOR_ITEMS = "defaultShowAncestorItems";
  private Boolean defaultShowAncestorItems;

  public static final String JSON_PROPERTY_DEFAULT_SHOW_DESCENDANT_ITEMS = "defaultShowDescendantItems";
  private Boolean defaultShowDescendantItems;

  public static final String JSON_PROPERTY_PROJECT = "project";
  private ProjectReference project;

  public static final String JSON_PROPERTY_TEMPLATE_TRACKER = "templateTracker";
  private TrackerReference templateTracker;

  public static final String JSON_PROPERTY_AVAILABLE_AS_TEMPLATE = "availableAsTemplate";
  private Boolean availableAsTemplate;

  public static final String JSON_PROPERTY_SHARED_IN_WORKING_SET = "sharedInWorkingSet";
  private Boolean sharedInWorkingSet;

  public Tracker() {
  }

  public Tracker id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the entity
   * minimum: 0
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


  public Tracker name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the entity
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


  public Tracker description(String description) {
    
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


  public Tracker descriptionFormat(DescriptionFormatEnum descriptionFormat) {
    
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


  public Tracker keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * Keyname of a tracker
   * @return keyName
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_KEY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeyName() {
    return keyName;
  }


  @JsonProperty(JSON_PROPERTY_KEY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  public Tracker version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version of a tracker
   * @return version
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(Integer version) {
    this.version = version;
  }


  public Tracker createdAt(OffsetDateTime createdAt) {
    
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


  public Tracker createdBy(UserReference createdBy) {
    
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


  public Tracker modifiedAt(OffsetDateTime modifiedAt) {
    
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


  public Tracker modifiedBy(UserReference modifiedBy) {
    
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


  public Tracker type(TrackerTypeReference type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrackerTypeReference getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TrackerTypeReference type) {
    this.type = type;
  }


  public Tracker deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Indicator if the tracker is deleted
   * @return deleted
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDeleted() {
    return deleted;
  }


  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public Tracker hidden(Boolean hidden) {
    
    this.hidden = hidden;
    return this;
  }

   /**
   * Indicator if the tracker is hidden
   * @return hidden
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHidden() {
    return hidden;
  }


  @JsonProperty(JSON_PROPERTY_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  public Tracker color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Color of the tracker
   * @return color
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColor() {
    return color;
  }


  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(String color) {
    this.color = color;
  }


  public Tracker usingWorkflow(Boolean usingWorkflow) {
    
    this.usingWorkflow = usingWorkflow;
    return this;
  }

   /**
   * Should transitions and workflow actions be available in the tracker or not
   * @return usingWorkflow
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_USING_WORKFLOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getUsingWorkflow() {
    return usingWorkflow;
  }


  @JsonProperty(JSON_PROPERTY_USING_WORKFLOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsingWorkflow(Boolean usingWorkflow) {
    this.usingWorkflow = usingWorkflow;
  }


  public Tracker onlyWorkflowCanCreateNewReferringItem(Boolean onlyWorkflowCanCreateNewReferringItem) {
    
    this.onlyWorkflowCanCreateNewReferringItem = onlyWorkflowCanCreateNewReferringItem;
    return this;
  }

   /**
   * If true, then the only way to create new referring items is through workflow actions
   * @return onlyWorkflowCanCreateNewReferringItem
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_ONLY_WORKFLOW_CAN_CREATE_NEW_REFERRING_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getOnlyWorkflowCanCreateNewReferringItem() {
    return onlyWorkflowCanCreateNewReferringItem;
  }


  @JsonProperty(JSON_PROPERTY_ONLY_WORKFLOW_CAN_CREATE_NEW_REFERRING_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOnlyWorkflowCanCreateNewReferringItem(Boolean onlyWorkflowCanCreateNewReferringItem) {
    this.onlyWorkflowCanCreateNewReferringItem = onlyWorkflowCanCreateNewReferringItem;
  }


  public Tracker usingQuickTransitions(Boolean usingQuickTransitions) {
    
    this.usingQuickTransitions = usingQuickTransitions;
    return this;
  }

   /**
   * If true, then every transition will be executed immediately (if possible) without opening an editor for the item
   * @return usingQuickTransitions
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_USING_QUICK_TRANSITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getUsingQuickTransitions() {
    return usingQuickTransitions;
  }


  @JsonProperty(JSON_PROPERTY_USING_QUICK_TRANSITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsingQuickTransitions(Boolean usingQuickTransitions) {
    this.usingQuickTransitions = usingQuickTransitions;
  }


  public Tracker defaultShowAncestorItems(Boolean defaultShowAncestorItems) {
    
    this.defaultShowAncestorItems = defaultShowAncestorItems;
    return this;
  }

   /**
   * Default Outline should show Ancestor Items or not
   * @return defaultShowAncestorItems
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_DEFAULT_SHOW_ANCESTOR_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDefaultShowAncestorItems() {
    return defaultShowAncestorItems;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_SHOW_ANCESTOR_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDefaultShowAncestorItems(Boolean defaultShowAncestorItems) {
    this.defaultShowAncestorItems = defaultShowAncestorItems;
  }


  public Tracker defaultShowDescendantItems(Boolean defaultShowDescendantItems) {
    
    this.defaultShowDescendantItems = defaultShowDescendantItems;
    return this;
  }

   /**
   * Default Outline should show Descendant Items or not
   * @return defaultShowDescendantItems
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_DEFAULT_SHOW_DESCENDANT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDefaultShowDescendantItems() {
    return defaultShowDescendantItems;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_SHOW_DESCENDANT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDefaultShowDescendantItems(Boolean defaultShowDescendantItems) {
    this.defaultShowDescendantItems = defaultShowDescendantItems;
  }


  public Tracker project(ProjectReference project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProjectReference getProject() {
    return project;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProject(ProjectReference project) {
    this.project = project;
  }


  public Tracker templateTracker(TrackerReference templateTracker) {
    
    this.templateTracker = templateTracker;
    return this;
  }

   /**
   * Get templateTracker
   * @return templateTracker
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_TRACKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrackerReference getTemplateTracker() {
    return templateTracker;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_TRACKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateTracker(TrackerReference templateTracker) {
    this.templateTracker = templateTracker;
  }


  public Tracker availableAsTemplate(Boolean availableAsTemplate) {
    
    this.availableAsTemplate = availableAsTemplate;
    return this;
  }

   /**
   * Indicator if the tracker can be used as a template
   * @return availableAsTemplate
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE_AS_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAvailableAsTemplate() {
    return availableAsTemplate;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_AS_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableAsTemplate(Boolean availableAsTemplate) {
    this.availableAsTemplate = availableAsTemplate;
  }


  public Tracker sharedInWorkingSet(Boolean sharedInWorkingSet) {
    
    this.sharedInWorkingSet = sharedInWorkingSet;
    return this;
  }

   /**
   * If the tracker is shared in a WorkingSet
   * @return sharedInWorkingSet
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_IN_WORKING_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSharedInWorkingSet() {
    return sharedInWorkingSet;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_IN_WORKING_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedInWorkingSet(Boolean sharedInWorkingSet) {
    this.sharedInWorkingSet = sharedInWorkingSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tracker tracker = (Tracker) o;
    return Objects.equals(this.id, tracker.id) &&
        Objects.equals(this.name, tracker.name) &&
        Objects.equals(this.description, tracker.description) &&
        Objects.equals(this.descriptionFormat, tracker.descriptionFormat) &&
        Objects.equals(this.keyName, tracker.keyName) &&
        Objects.equals(this.version, tracker.version) &&
        Objects.equals(this.createdAt, tracker.createdAt) &&
        Objects.equals(this.createdBy, tracker.createdBy) &&
        Objects.equals(this.modifiedAt, tracker.modifiedAt) &&
        Objects.equals(this.modifiedBy, tracker.modifiedBy) &&
        Objects.equals(this.type, tracker.type) &&
        Objects.equals(this.deleted, tracker.deleted) &&
        Objects.equals(this.hidden, tracker.hidden) &&
        Objects.equals(this.color, tracker.color) &&
        Objects.equals(this.usingWorkflow, tracker.usingWorkflow) &&
        Objects.equals(this.onlyWorkflowCanCreateNewReferringItem, tracker.onlyWorkflowCanCreateNewReferringItem) &&
        Objects.equals(this.usingQuickTransitions, tracker.usingQuickTransitions) &&
        Objects.equals(this.defaultShowAncestorItems, tracker.defaultShowAncestorItems) &&
        Objects.equals(this.defaultShowDescendantItems, tracker.defaultShowDescendantItems) &&
        Objects.equals(this.project, tracker.project) &&
        Objects.equals(this.templateTracker, tracker.templateTracker) &&
        Objects.equals(this.availableAsTemplate, tracker.availableAsTemplate) &&
        Objects.equals(this.sharedInWorkingSet, tracker.sharedInWorkingSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, descriptionFormat, keyName, version, createdAt, createdBy, modifiedAt, modifiedBy, type, deleted, hidden, color, usingWorkflow, onlyWorkflowCanCreateNewReferringItem, usingQuickTransitions, defaultShowAncestorItems, defaultShowDescendantItems, project, templateTracker, availableAsTemplate, sharedInWorkingSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tracker {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionFormat: ").append(toIndentedString(descriptionFormat)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    usingWorkflow: ").append(toIndentedString(usingWorkflow)).append("\n");
    sb.append("    onlyWorkflowCanCreateNewReferringItem: ").append(toIndentedString(onlyWorkflowCanCreateNewReferringItem)).append("\n");
    sb.append("    usingQuickTransitions: ").append(toIndentedString(usingQuickTransitions)).append("\n");
    sb.append("    defaultShowAncestorItems: ").append(toIndentedString(defaultShowAncestorItems)).append("\n");
    sb.append("    defaultShowDescendantItems: ").append(toIndentedString(defaultShowDescendantItems)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    templateTracker: ").append(toIndentedString(templateTracker)).append("\n");
    sb.append("    availableAsTemplate: ").append(toIndentedString(availableAsTemplate)).append("\n");
    sb.append("    sharedInWorkingSet: ").append(toIndentedString(sharedInWorkingSet)).append("\n");
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

