

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;

/**
 * TrackerFilteringRequest
 */
@JsonPropertyOrder({
  TrackerFilteringRequest.JSON_PROPERTY_TYPES,
  TrackerFilteringRequest.JSON_PROPERTY_HIDDEN,
  TrackerFilteringRequest.JSON_PROPERTY_DELETED,
  TrackerFilteringRequest.JSON_PROPERTY_KEY_NAME
})
public class TrackerFilteringRequest {
  public static final String JSON_PROPERTY_TYPES = "types";
  private List<TrackerTypeReference> types;

  public static final String JSON_PROPERTY_HIDDEN = "hidden";
  private Boolean hidden;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_KEY_NAME = "keyName";
  private String keyName;

  public TrackerFilteringRequest() {
  }

  public TrackerFilteringRequest types(List<TrackerTypeReference> types) {
    
    this.types = types;
    return this;
  }

  public TrackerFilteringRequest addTypesItem(TrackerTypeReference typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * List of tracker type references, to only show trackers of these types.
   * @return types
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerTypeReference> getTypes() {
    return types;
  }


  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypes(List<TrackerTypeReference> types) {
    this.types = types;
  }


  public TrackerFilteringRequest hidden(Boolean hidden) {
    
    this.hidden = hidden;
    return this;
  }

   /**
   * True to also show hidden trackers.
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


  public TrackerFilteringRequest deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * True to also show removed trackers.
   * @return deleted
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleted() {
    return deleted;
  }


  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public TrackerFilteringRequest keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * Filter by project key name
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerFilteringRequest trackerFilteringRequest = (TrackerFilteringRequest) o;
    return Objects.equals(this.types, trackerFilteringRequest.types) &&
        Objects.equals(this.hidden, trackerFilteringRequest.hidden) &&
        Objects.equals(this.deleted, trackerFilteringRequest.deleted) &&
        Objects.equals(this.keyName, trackerFilteringRequest.keyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(types, hidden, deleted, keyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerFilteringRequest {\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
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

