

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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.Nullable;

/**
 * Reference to an item
 */
@JsonPropertyOrder({
  AbstractReference.JSON_PROPERTY_ID,
  AbstractReference.JSON_PROPERTY_NAME,
  AbstractReference.JSON_PROPERTY_TYPE
})
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AssociationTypeReference.class, name = "AssociationTypeReference"),
  @JsonSubTypes.Type(value = AttachmentReference.class, name = "AttachmentReference"),
  @JsonSubTypes.Type(value = ChoiceOptionReference.class, name = "ChoiceOptionReference"),
  @JsonSubTypes.Type(value = CommentReference.class, name = "CommentReference"),
  @JsonSubTypes.Type(value = FieldReference.class, name = "FieldReference"),
  @JsonSubTypes.Type(value = ProjectBaselineReference.class, name = "ProjectBaselineReference"),
  @JsonSubTypes.Type(value = ProjectReference.class, name = "ProjectReference"),
  @JsonSubTypes.Type(value = ReportReference.class, name = "ReportReference"),
  @JsonSubTypes.Type(value = RepositoryReference.class, name = "RepositoryReference"),
  @JsonSubTypes.Type(value = RoleReference.class, name = "RoleReference"),
  @JsonSubTypes.Type(value = TrackerBaselineReference.class, name = "TrackerBaselineReference"),
  @JsonSubTypes.Type(value = TrackerItemReference.class, name = "TrackerItemReference"),
  @JsonSubTypes.Type(value = TrackerPermissionReference.class, name = "TrackerPermissionReference"),
  @JsonSubTypes.Type(value = TrackerReference.class, name = "TrackerReference"),
  @JsonSubTypes.Type(value = TrackerTypeReference.class, name = "TrackerTypeReference"),
  @JsonSubTypes.Type(value = UserGroupReference.class, name = "UserGroupReference"),
  @JsonSubTypes.Type(value = UserReference.class, name = "UserReference"),
  @JsonSubTypes.Type(value = WikiPageReference.class, name = "WikiPageReference"),
})

public class AbstractReference {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type;

  public AbstractReference() {
  }

  public AbstractReference id(Integer id) {
    
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


  public AbstractReference name(String name) {
    
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


  public AbstractReference type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of a referenced object
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractReference abstractReference = (AbstractReference) o;
    return Objects.equals(this.id, abstractReference.id) &&
        Objects.equals(this.name, abstractReference.name) &&
        Objects.equals(this.type, abstractReference.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractReference {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

