

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * CreateBaselineRequest
 */
@JsonPropertyOrder({
  CreateBaselineRequest.JSON_PROPERTY_NAME,
  CreateBaselineRequest.JSON_PROPERTY_DESCRIPTION,
  CreateBaselineRequest.JSON_PROPERTY_PROJECT,
  CreateBaselineRequest.JSON_PROPERTY_TRACKER
})
public class CreateBaselineRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_PROJECT = "project";
  private ProjectReference project;

  public static final String JSON_PROPERTY_TRACKER = "tracker";
  private TrackerReference tracker;

  public CreateBaselineRequest() {
  }

  public CreateBaselineRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of baseline
   * @return name
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateBaselineRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of baseline
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


  public CreateBaselineRequest project(ProjectReference project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProjectReference getProject() {
    return project;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProject(ProjectReference project) {
    this.project = project;
  }


  public CreateBaselineRequest tracker(TrackerReference tracker) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBaselineRequest createBaselineRequest = (CreateBaselineRequest) o;
    return Objects.equals(this.name, createBaselineRequest.name) &&
        Objects.equals(this.description, createBaselineRequest.description) &&
        Objects.equals(this.project, createBaselineRequest.project) &&
        Objects.equals(this.tracker, createBaselineRequest.tracker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, project, tracker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBaselineRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
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

