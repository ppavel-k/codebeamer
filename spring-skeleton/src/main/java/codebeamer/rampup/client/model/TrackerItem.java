

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
 * Basic properties of a codebeamer tracker item
 */
@JsonPropertyOrder({
  TrackerItem.JSON_PROPERTY_ID,
  TrackerItem.JSON_PROPERTY_NAME,
  TrackerItem.JSON_PROPERTY_DESCRIPTION,
  TrackerItem.JSON_PROPERTY_DESCRIPTION_FORMAT,
  TrackerItem.JSON_PROPERTY_CREATED_AT,
  TrackerItem.JSON_PROPERTY_CREATED_BY,
  TrackerItem.JSON_PROPERTY_MODIFIED_AT,
  TrackerItem.JSON_PROPERTY_MODIFIED_BY,
  TrackerItem.JSON_PROPERTY_PARENT,
  TrackerItem.JSON_PROPERTY_OWNERS,
  TrackerItem.JSON_PROPERTY_VERSION,
  TrackerItem.JSON_PROPERTY_ASSIGNED_AT,
  TrackerItem.JSON_PROPERTY_ASSIGNED_TO,
  TrackerItem.JSON_PROPERTY_START_DATE,
  TrackerItem.JSON_PROPERTY_END_DATE,
  TrackerItem.JSON_PROPERTY_CLOSED_AT,
  TrackerItem.JSON_PROPERTY_STORY_POINTS,
  TrackerItem.JSON_PROPERTY_TRACKER,
  TrackerItem.JSON_PROPERTY_CHILDREN,
  TrackerItem.JSON_PROPERTY_CUSTOM_FIELDS,
  TrackerItem.JSON_PROPERTY_PRIORITY,
  TrackerItem.JSON_PROPERTY_ACCRUED_MILLIS,
  TrackerItem.JSON_PROPERTY_ESTIMATED_MILLIS,
  TrackerItem.JSON_PROPERTY_SPENT_MILLIS,
  TrackerItem.JSON_PROPERTY_STATUS,
  TrackerItem.JSON_PROPERTY_PLATFORMS,
  TrackerItem.JSON_PROPERTY_CATEGORIES,
  TrackerItem.JSON_PROPERTY_SUBJECTS,
  TrackerItem.JSON_PROPERTY_RESOLUTIONS,
  TrackerItem.JSON_PROPERTY_SEVERITIES,
  TrackerItem.JSON_PROPERTY_RELEASE_METHOD,
  TrackerItem.JSON_PROPERTY_FORMALITY,
  TrackerItem.JSON_PROPERTY_TEAMS,
  TrackerItem.JSON_PROPERTY_AREAS,
  TrackerItem.JSON_PROPERTY_VERSIONS,
  TrackerItem.JSON_PROPERTY_ORDINAL,
  TrackerItem.JSON_PROPERTY_TYPE_NAME,
  TrackerItem.JSON_PROPERTY_COMMENTS
})
public class TrackerItem {
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

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private UserReference createdBy;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private UserReference modifiedBy;

  public static final String JSON_PROPERTY_PARENT = "parent";
  private TrackerItemReference parent;

  public static final String JSON_PROPERTY_OWNERS = "owners";
  private List<AbstractReference> owners;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_ASSIGNED_AT = "assignedAt";
  private OffsetDateTime assignedAt;

  public static final String JSON_PROPERTY_ASSIGNED_TO = "assignedTo";
  private List<AbstractReference> assignedTo;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_CLOSED_AT = "closedAt";
  private OffsetDateTime closedAt;

  public static final String JSON_PROPERTY_STORY_POINTS = "storyPoints";
  private Integer storyPoints;

  public static final String JSON_PROPERTY_TRACKER = "tracker";
  private TrackerReference tracker;

  public static final String JSON_PROPERTY_CHILDREN = "children";
  private List<TrackerItemReference> children;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  private List<AbstractFieldValue> customFields;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private AbstractReference priority;

  public static final String JSON_PROPERTY_ACCRUED_MILLIS = "accruedMillis";
  private Long accruedMillis;

  public static final String JSON_PROPERTY_ESTIMATED_MILLIS = "estimatedMillis";
  private Long estimatedMillis;

  public static final String JSON_PROPERTY_SPENT_MILLIS = "spentMillis";
  private Long spentMillis;

  public static final String JSON_PROPERTY_STATUS = "status";
  private AbstractReference status;

  public static final String JSON_PROPERTY_PLATFORMS = "platforms";
  private List<AbstractReference> platforms;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private List<AbstractReference> categories;

  public static final String JSON_PROPERTY_SUBJECTS = "subjects";
  private List<AbstractReference> subjects;

  public static final String JSON_PROPERTY_RESOLUTIONS = "resolutions";
  private List<AbstractReference> resolutions;

  public static final String JSON_PROPERTY_SEVERITIES = "severities";
  private List<AbstractReference> severities;

  public static final String JSON_PROPERTY_RELEASE_METHOD = "releaseMethod";
  private AbstractReference releaseMethod;

  public static final String JSON_PROPERTY_FORMALITY = "formality";
  private AbstractReference formality;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private List<AbstractReference> teams;

  public static final String JSON_PROPERTY_AREAS = "areas";
  private List<AbstractReference> areas;

  public static final String JSON_PROPERTY_VERSIONS = "versions";
  private List<AbstractReference> versions;

  public static final String JSON_PROPERTY_ORDINAL = "ordinal";
  private Integer ordinal;

  public static final String JSON_PROPERTY_TYPE_NAME = "typeName";
  private String typeName;

  public static final String JSON_PROPERTY_COMMENTS = "comments";
  private List<CommentReference> comments;

  public TrackerItem() {
  }

  @JsonCreator
  public TrackerItem(
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_ASSIGNED_AT) OffsetDateTime assignedAt, 
    @JsonProperty(JSON_PROPERTY_CHILDREN) List<TrackerItemReference> children, 
    @JsonProperty(JSON_PROPERTY_ACCRUED_MILLIS) Long accruedMillis, 
    @JsonProperty(JSON_PROPERTY_SPENT_MILLIS) Long spentMillis, 
    @JsonProperty(JSON_PROPERTY_COMMENTS) List<CommentReference> comments
  ) {
    this();
    this.version = version;
    this.assignedAt = assignedAt;
    this.children = children;
    this.accruedMillis = accruedMillis;
    this.spentMillis = spentMillis;
    this.comments = comments;
  }

  public TrackerItem id(Integer id) {
    
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


  public TrackerItem name(String name) {
    
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


  public TrackerItem description(String description) {
    
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


  public TrackerItem descriptionFormat(DescriptionFormatEnum descriptionFormat) {
    
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


  public TrackerItem createdAt(OffsetDateTime createdAt) {
    
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


  public TrackerItem createdBy(UserReference createdBy) {
    
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


  public TrackerItem modifiedAt(OffsetDateTime modifiedAt) {
    
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


  public TrackerItem modifiedBy(UserReference modifiedBy) {
    
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


  public TrackerItem parent(TrackerItemReference parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrackerItemReference getParent() {
    return parent;
  }


  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParent(TrackerItemReference parent) {
    this.parent = parent;
  }


  public TrackerItem owners(List<AbstractReference> owners) {
    
    this.owners = owners;
    return this;
  }

  public TrackerItem addOwnersItem(AbstractReference ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<>();
    }
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Owners of a tracker item
   * @return owners
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_OWNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractReference> getOwners() {
    return owners;
  }


  @JsonProperty(JSON_PROPERTY_OWNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwners(List<AbstractReference> owners) {
    this.owners = owners;
  }


   /**
   * Version of a tracker item
   * @return version
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }




   /**
   * Assigne date of a tracker item
   * @return assignedAt
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAssignedAt() {
    return assignedAt;
  }




  public TrackerItem assignedTo(List<AbstractReference> assignedTo) {
    
    this.assignedTo = assignedTo;
    return this;
  }

  public TrackerItem addAssignedToItem(AbstractReference assignedToItem) {
    if (this.assignedTo == null) {
      this.assignedTo = new ArrayList<>();
    }
    this.assignedTo.add(assignedToItem);
    return this;
  }

   /**
   * Assignees of a tracker item
   * @return assignedTo
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNED_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractReference> getAssignedTo() {
    return assignedTo;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNED_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignedTo(List<AbstractReference> assignedTo) {
    this.assignedTo = assignedTo;
  }


  public TrackerItem startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date of a tracker item
   * @return startDate
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public TrackerItem endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of a tracker item
   * @return endDate
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public TrackerItem closedAt(OffsetDateTime closedAt) {
    
    this.closedAt = closedAt;
    return this;
  }

   /**
   * Close date of a tracker item
   * @return closedAt
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CLOSED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getClosedAt() {
    return closedAt;
  }


  @JsonProperty(JSON_PROPERTY_CLOSED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClosedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
  }


  public TrackerItem storyPoints(Integer storyPoints) {
    
    this.storyPoints = storyPoints;
    return this;
  }

   /**
   * Story points of a tracker item
   * @return storyPoints
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_STORY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStoryPoints() {
    return storyPoints;
  }


  @JsonProperty(JSON_PROPERTY_STORY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoryPoints(Integer storyPoints) {
    this.storyPoints = storyPoints;
  }


  public TrackerItem tracker(TrackerReference tracker) {
    
    this.tracker = tracker;
    return this;
  }

   /**
   * Get tracker
   * @return tracker
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TRACKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrackerReference getTracker() {
    return tracker;
  }


  @JsonProperty(JSON_PROPERTY_TRACKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTracker(TrackerReference tracker) {
    this.tracker = tracker;
  }


   /**
   * Children of a tracker item
   * @return children
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemReference> getChildren() {
    return children;
  }




  public TrackerItem customFields(List<AbstractFieldValue> customFields) {
    
    this.customFields = customFields;
    return this;
  }

  public TrackerItem addCustomFieldsItem(AbstractFieldValue customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Custom field of a tracker item
   * @return customFields
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractFieldValue> getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(List<AbstractFieldValue> customFields) {
    this.customFields = customFields;
  }


  public TrackerItem priority(AbstractReference priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AbstractReference getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(AbstractReference priority) {
    this.priority = priority;
  }


   /**
   * Accrued work time of a tracker item in milliseconds
   * @return accruedMillis
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ACCRUED_MILLIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccruedMillis() {
    return accruedMillis;
  }




  public TrackerItem estimatedMillis(Long estimatedMillis) {
    
    this.estimatedMillis = estimatedMillis;
    return this;
  }

   /**
   * Estimated work time of a tracker item in milliseconds
   * @return estimatedMillis
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_MILLIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEstimatedMillis() {
    return estimatedMillis;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATED_MILLIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimatedMillis(Long estimatedMillis) {
    this.estimatedMillis = estimatedMillis;
  }


   /**
   * Spent work time of a tracker item in milliseconds
   * @return spentMillis
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SPENT_MILLIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpentMillis() {
    return spentMillis;
  }




  public TrackerItem status(AbstractReference status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AbstractReference getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(AbstractReference status) {
    this.status = status;
  }


  public TrackerItem platforms(List<AbstractReference> platforms) {
    
    this.platforms = platforms;
    return this;
  }

  public TrackerItem addPlatformsItem(AbstractReference platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

   /**
   * Platforms of a tracker item
   * @return platforms
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractReference> getPlatforms() {
    return platforms;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatforms(List<AbstractReference> platforms) {
    this.platforms = platforms;
  }


  public TrackerItem categories(List<AbstractReference> categories) {
    
    this.categories = categories;
    return this;
  }

  public TrackerItem addCategoriesItem(AbstractReference categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Categories of a tracker item
   * @return categories
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractReference> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(List<AbstractReference> categories) {
    this.categories = categories;
  }


  public TrackerItem subjects(List<AbstractReference> subjects) {
    
    this.subjects = subjects;
    return this;
  }

  public TrackerItem addSubjectsItem(AbstractReference subjectsItem) {
    if (this.subjects == null) {
      this.subjects = new ArrayList<>();
    }
    this.subjects.add(subjectsItem);
    return this;
  }

   /**
   * Subjects of a tracker item
   * @return subjects
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractReference> getSubjects() {
    return subjects;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubjects(List<AbstractReference> subjects) {
    this.subjects = subjects;
  }


  public TrackerItem resolutions(List<AbstractReference> resolutions) {
    
    this.resolutions = resolutions;
    return this;
  }

  public TrackerItem addResolutionsItem(AbstractReference resolutionsItem) {
    if (this.resolutions == null) {
      this.resolutions = new ArrayList<>();
    }
    this.resolutions.add(resolutionsItem);
    return this;
  }

   /**
   * Resolutions of a tracker item
   * @return resolutions
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_RESOLUTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractReference> getResolutions() {
    return resolutions;
  }


  @JsonProperty(JSON_PROPERTY_RESOLUTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolutions(List<AbstractReference> resolutions) {
    this.resolutions = resolutions;
  }


  public TrackerItem severities(List<AbstractReference> severities) {
    
    this.severities = severities;
    return this;
  }

  public TrackerItem addSeveritiesItem(AbstractReference severitiesItem) {
    if (this.severities == null) {
      this.severities = new ArrayList<>();
    }
    this.severities.add(severitiesItem);
    return this;
  }

   /**
   * Severities of a tracker item
   * @return severities
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SEVERITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractReference> getSeverities() {
    return severities;
  }


  @JsonProperty(JSON_PROPERTY_SEVERITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeverities(List<AbstractReference> severities) {
    this.severities = severities;
  }


  public TrackerItem releaseMethod(AbstractReference releaseMethod) {
    
    this.releaseMethod = releaseMethod;
    return this;
  }

   /**
   * Get releaseMethod
   * @return releaseMethod
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AbstractReference getReleaseMethod() {
    return releaseMethod;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseMethod(AbstractReference releaseMethod) {
    this.releaseMethod = releaseMethod;
  }


  public TrackerItem formality(AbstractReference formality) {
    
    this.formality = formality;
    return this;
  }

   /**
   * Get formality
   * @return formality
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_FORMALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AbstractReference getFormality() {
    return formality;
  }


  @JsonProperty(JSON_PROPERTY_FORMALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormality(AbstractReference formality) {
    this.formality = formality;
  }


  public TrackerItem teams(List<AbstractReference> teams) {
    
    this.teams = teams;
    return this;
  }

  public TrackerItem addTeamsItem(AbstractReference teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Teams of a tracker item
   * @return teams
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractReference> getTeams() {
    return teams;
  }


  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeams(List<AbstractReference> teams) {
    this.teams = teams;
  }


  public TrackerItem areas(List<AbstractReference> areas) {
    
    this.areas = areas;
    return this;
  }

  public TrackerItem addAreasItem(AbstractReference areasItem) {
    if (this.areas == null) {
      this.areas = new ArrayList<>();
    }
    this.areas.add(areasItem);
    return this;
  }

   /**
   * Areas of a tracker item
   * @return areas
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_AREAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractReference> getAreas() {
    return areas;
  }


  @JsonProperty(JSON_PROPERTY_AREAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAreas(List<AbstractReference> areas) {
    this.areas = areas;
  }


  public TrackerItem versions(List<AbstractReference> versions) {
    
    this.versions = versions;
    return this;
  }

  public TrackerItem addVersionsItem(AbstractReference versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * Versions of a tracker item
   * @return versions
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractReference> getVersions() {
    return versions;
  }


  @JsonProperty(JSON_PROPERTY_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersions(List<AbstractReference> versions) {
    this.versions = versions;
  }


  public TrackerItem ordinal(Integer ordinal) {
    
    this.ordinal = ordinal;
    return this;
  }

   /**
   * Ordinal of a tracker item
   * @return ordinal
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ORDINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrdinal() {
    return ordinal;
  }


  @JsonProperty(JSON_PROPERTY_ORDINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrdinal(Integer ordinal) {
    this.ordinal = ordinal;
  }


  public TrackerItem typeName(String typeName) {
    
    this.typeName = typeName;
    return this;
  }

   /**
   * Type name of a tracker item
   * @return typeName
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypeName() {
    return typeName;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


   /**
   * Comment in the tracker item
   * @return comments
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CommentReference> getComments() {
    return comments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItem trackerItem = (TrackerItem) o;
    return Objects.equals(this.id, trackerItem.id) &&
        Objects.equals(this.name, trackerItem.name) &&
        Objects.equals(this.description, trackerItem.description) &&
        Objects.equals(this.descriptionFormat, trackerItem.descriptionFormat) &&
        Objects.equals(this.createdAt, trackerItem.createdAt) &&
        Objects.equals(this.createdBy, trackerItem.createdBy) &&
        Objects.equals(this.modifiedAt, trackerItem.modifiedAt) &&
        Objects.equals(this.modifiedBy, trackerItem.modifiedBy) &&
        Objects.equals(this.parent, trackerItem.parent) &&
        Objects.equals(this.owners, trackerItem.owners) &&
        Objects.equals(this.version, trackerItem.version) &&
        Objects.equals(this.assignedAt, trackerItem.assignedAt) &&
        Objects.equals(this.assignedTo, trackerItem.assignedTo) &&
        Objects.equals(this.startDate, trackerItem.startDate) &&
        Objects.equals(this.endDate, trackerItem.endDate) &&
        Objects.equals(this.closedAt, trackerItem.closedAt) &&
        Objects.equals(this.storyPoints, trackerItem.storyPoints) &&
        Objects.equals(this.tracker, trackerItem.tracker) &&
        Objects.equals(this.children, trackerItem.children) &&
        Objects.equals(this.customFields, trackerItem.customFields) &&
        Objects.equals(this.priority, trackerItem.priority) &&
        Objects.equals(this.accruedMillis, trackerItem.accruedMillis) &&
        Objects.equals(this.estimatedMillis, trackerItem.estimatedMillis) &&
        Objects.equals(this.spentMillis, trackerItem.spentMillis) &&
        Objects.equals(this.status, trackerItem.status) &&
        Objects.equals(this.platforms, trackerItem.platforms) &&
        Objects.equals(this.categories, trackerItem.categories) &&
        Objects.equals(this.subjects, trackerItem.subjects) &&
        Objects.equals(this.resolutions, trackerItem.resolutions) &&
        Objects.equals(this.severities, trackerItem.severities) &&
        Objects.equals(this.releaseMethod, trackerItem.releaseMethod) &&
        Objects.equals(this.formality, trackerItem.formality) &&
        Objects.equals(this.teams, trackerItem.teams) &&
        Objects.equals(this.areas, trackerItem.areas) &&
        Objects.equals(this.versions, trackerItem.versions) &&
        Objects.equals(this.ordinal, trackerItem.ordinal) &&
        Objects.equals(this.typeName, trackerItem.typeName) &&
        Objects.equals(this.comments, trackerItem.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, descriptionFormat, createdAt, createdBy, modifiedAt, modifiedBy, parent, owners, version, assignedAt, assignedTo, startDate, endDate, closedAt, storyPoints, tracker, children, customFields, priority, accruedMillis, estimatedMillis, spentMillis, status, platforms, categories, subjects, resolutions, severities, releaseMethod, formality, teams, areas, versions, ordinal, typeName, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionFormat: ").append(toIndentedString(descriptionFormat)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    assignedAt: ").append(toIndentedString(assignedAt)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    storyPoints: ").append(toIndentedString(storyPoints)).append("\n");
    sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    accruedMillis: ").append(toIndentedString(accruedMillis)).append("\n");
    sb.append("    estimatedMillis: ").append(toIndentedString(estimatedMillis)).append("\n");
    sb.append("    spentMillis: ").append(toIndentedString(spentMillis)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
    sb.append("    resolutions: ").append(toIndentedString(resolutions)).append("\n");
    sb.append("    severities: ").append(toIndentedString(severities)).append("\n");
    sb.append("    releaseMethod: ").append(toIndentedString(releaseMethod)).append("\n");
    sb.append("    formality: ").append(toIndentedString(formality)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

