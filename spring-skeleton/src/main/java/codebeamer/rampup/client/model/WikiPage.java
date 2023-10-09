

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
 * Properties of a wiki page
 */
@JsonPropertyOrder({
  WikiPage.JSON_PROPERTY_ID,
  WikiPage.JSON_PROPERTY_NAME,
  WikiPage.JSON_PROPERTY_DESCRIPTION,
  WikiPage.JSON_PROPERTY_DESCRIPTION_FORMAT,
  WikiPage.JSON_PROPERTY_PROJECT,
  WikiPage.JSON_PROPERTY_MARKUP,
  WikiPage.JSON_PROPERTY_COMMENTS,
  WikiPage.JSON_PROPERTY_VERSION,
  WikiPage.JSON_PROPERTY_CHANGE_COMMENT,
  WikiPage.JSON_PROPERTY_CHILD_PAGES,
  WikiPage.JSON_PROPERTY_CREATED_AT,
  WikiPage.JSON_PROPERTY_CREATED_BY,
  WikiPage.JSON_PROPERTY_MODIFIED_AT,
  WikiPage.JSON_PROPERTY_MODIFIED_BY,
  WikiPage.JSON_PROPERTY_PARENT
})
public class WikiPage {
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

  public static final String JSON_PROPERTY_PROJECT = "project";
  private ProjectReference project;

  public static final String JSON_PROPERTY_MARKUP = "markup";
  private String markup;

  public static final String JSON_PROPERTY_COMMENTS = "comments";
  private List<AttachmentReference> comments;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_CHANGE_COMMENT = "changeComment";
  private String changeComment;

  public static final String JSON_PROPERTY_CHILD_PAGES = "childPages";
  private List<WikiPageReference> childPages;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private UserReference createdBy;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private UserReference modifiedBy;

  public static final String JSON_PROPERTY_PARENT = "parent";
  private AbstractReference parent;

  public WikiPage() {
  }

  @JsonCreator
  public WikiPage(
    @JsonProperty(JSON_PROPERTY_CHILD_PAGES) List<WikiPageReference> childPages
  ) {
    this();
    this.childPages = childPages;
  }

  public WikiPage id(Integer id) {
    
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


  public WikiPage name(String name) {
    
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


  public WikiPage description(String description) {
    
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


  public WikiPage descriptionFormat(DescriptionFormatEnum descriptionFormat) {
    
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


  public WikiPage project(ProjectReference project) {
    
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


  public WikiPage markup(String markup) {
    
    this.markup = markup;
    return this;
  }

   /**
   * Content markup of the wiki page
   * @return markup
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MARKUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMarkup() {
    return markup;
  }


  @JsonProperty(JSON_PROPERTY_MARKUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkup(String markup) {
    this.markup = markup;
  }


  public WikiPage comments(List<AttachmentReference> comments) {
    
    this.comments = comments;
    return this;
  }

  public WikiPage addCommentsItem(AttachmentReference commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Comments/attachments associated with the wiki page
   * @return comments
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AttachmentReference> getComments() {
    return comments;
  }


  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComments(List<AttachmentReference> comments) {
    this.comments = comments;
  }


  public WikiPage version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version of the wiki page
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


  public WikiPage changeComment(String changeComment) {
    
    this.changeComment = changeComment;
    return this;
  }

   /**
   * Summary of the changes in this wiki page version
   * @return changeComment
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChangeComment() {
    return changeComment;
  }


  @JsonProperty(JSON_PROPERTY_CHANGE_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeComment(String changeComment) {
    this.changeComment = changeComment;
  }


   /**
   * Child pages of the current Wiki page
   * @return childPages
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CHILD_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WikiPageReference> getChildPages() {
    return childPages;
  }




  public WikiPage createdAt(OffsetDateTime createdAt) {
    
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


  public WikiPage createdBy(UserReference createdBy) {
    
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


  public WikiPage modifiedAt(OffsetDateTime modifiedAt) {
    
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


  public WikiPage modifiedBy(UserReference modifiedBy) {
    
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


  public WikiPage parent(AbstractReference parent) {
    
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

  public AbstractReference getParent() {
    return parent;
  }


  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParent(AbstractReference parent) {
    this.parent = parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WikiPage wikiPage = (WikiPage) o;
    return Objects.equals(this.id, wikiPage.id) &&
        Objects.equals(this.name, wikiPage.name) &&
        Objects.equals(this.description, wikiPage.description) &&
        Objects.equals(this.descriptionFormat, wikiPage.descriptionFormat) &&
        Objects.equals(this.project, wikiPage.project) &&
        Objects.equals(this.markup, wikiPage.markup) &&
        Objects.equals(this.comments, wikiPage.comments) &&
        Objects.equals(this.version, wikiPage.version) &&
        Objects.equals(this.changeComment, wikiPage.changeComment) &&
        Objects.equals(this.childPages, wikiPage.childPages) &&
        Objects.equals(this.createdAt, wikiPage.createdAt) &&
        Objects.equals(this.createdBy, wikiPage.createdBy) &&
        Objects.equals(this.modifiedAt, wikiPage.modifiedAt) &&
        Objects.equals(this.modifiedBy, wikiPage.modifiedBy) &&
        Objects.equals(this.parent, wikiPage.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, descriptionFormat, project, markup, comments, version, changeComment, childPages, createdAt, createdBy, modifiedAt, modifiedBy, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WikiPage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionFormat: ").append(toIndentedString(descriptionFormat)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    markup: ").append(toIndentedString(markup)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    changeComment: ").append(toIndentedString(changeComment)).append("\n");
    sb.append("    childPages: ").append(toIndentedString(childPages)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

