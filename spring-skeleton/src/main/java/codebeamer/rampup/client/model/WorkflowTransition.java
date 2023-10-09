

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
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * A transition in the workflow
 */
@JsonPropertyOrder({
  WorkflowTransition.JSON_PROPERTY_ID,
  WorkflowTransition.JSON_PROPERTY_NAME,
  WorkflowTransition.JSON_PROPERTY_DESCRIPTION,
  WorkflowTransition.JSON_PROPERTY_DESCRIPTION_FORMAT,
  WorkflowTransition.JSON_PROPERTY_FROM_STATUS,
  WorkflowTransition.JSON_PROPERTY_TO_STATUS,
  WorkflowTransition.JSON_PROPERTY_HIDDEN,
  WorkflowTransition.JSON_PROPERTY_PERMISSIONS
})
public class WorkflowTransition {
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

  public static final String JSON_PROPERTY_FROM_STATUS = "fromStatus";
  private ChoiceOptionReference fromStatus;

  public static final String JSON_PROPERTY_TO_STATUS = "toStatus";
  private ChoiceOptionReference toStatus;

  public static final String JSON_PROPERTY_HIDDEN = "hidden";
  private Boolean hidden;

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private List<AccessPermission> permissions;

  public WorkflowTransition() {
  }

  public WorkflowTransition id(Integer id) {
    
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


  public WorkflowTransition name(String name) {
    
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


  public WorkflowTransition description(String description) {
    
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


  public WorkflowTransition descriptionFormat(DescriptionFormatEnum descriptionFormat) {
    
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


  public WorkflowTransition fromStatus(ChoiceOptionReference fromStatus) {
    
    this.fromStatus = fromStatus;
    return this;
  }

   /**
   * Get fromStatus
   * @return fromStatus
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_FROM_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChoiceOptionReference getFromStatus() {
    return fromStatus;
  }


  @JsonProperty(JSON_PROPERTY_FROM_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromStatus(ChoiceOptionReference fromStatus) {
    this.fromStatus = fromStatus;
  }


  public WorkflowTransition toStatus(ChoiceOptionReference toStatus) {
    
    this.toStatus = toStatus;
    return this;
  }

   /**
   * Get toStatus
   * @return toStatus
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_TO_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ChoiceOptionReference getToStatus() {
    return toStatus;
  }


  @JsonProperty(JSON_PROPERTY_TO_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToStatus(ChoiceOptionReference toStatus) {
    this.toStatus = toStatus;
  }


  public WorkflowTransition hidden(Boolean hidden) {
    
    this.hidden = hidden;
    return this;
  }

   /**
   * Indicator if the transition is hidden
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


  public WorkflowTransition permissions(List<AccessPermission> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public WorkflowTransition addPermissionsItem(AccessPermission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Access permissions of the transition
   * @return permissions
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccessPermission> getPermissions() {
    return permissions;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermissions(List<AccessPermission> permissions) {
    this.permissions = permissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTransition workflowTransition = (WorkflowTransition) o;
    return Objects.equals(this.id, workflowTransition.id) &&
        Objects.equals(this.name, workflowTransition.name) &&
        Objects.equals(this.description, workflowTransition.description) &&
        Objects.equals(this.descriptionFormat, workflowTransition.descriptionFormat) &&
        Objects.equals(this.fromStatus, workflowTransition.fromStatus) &&
        Objects.equals(this.toStatus, workflowTransition.toStatus) &&
        Objects.equals(this.hidden, workflowTransition.hidden) &&
        Objects.equals(this.permissions, workflowTransition.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, descriptionFormat, fromStatus, toStatus, hidden, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTransition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionFormat: ").append(toIndentedString(descriptionFormat)).append("\n");
    sb.append("    fromStatus: ").append(toIndentedString(fromStatus)).append("\n");
    sb.append("    toStatus: ").append(toIndentedString(toStatus)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

