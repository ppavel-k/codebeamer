

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
 * Tracker item child update request
 */
@JsonPropertyOrder({
  UpdateTrackerItemChildrenRequest.JSON_PROPERTY_CHILDREN
})
public class UpdateTrackerItemChildrenRequest {
  public static final String JSON_PROPERTY_CHILDREN = "children";
  private List<TrackerItemReference> children;

  public UpdateTrackerItemChildrenRequest() {
  }

  public UpdateTrackerItemChildrenRequest children(List<TrackerItemReference> children) {
    
    this.children = children;
    return this;
  }

  public UpdateTrackerItemChildrenRequest addChildrenItem(TrackerItemReference childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Child items to update
   * @return children
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerItemReference> getChildren() {
    return children;
  }


  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChildren(List<TrackerItemReference> children) {
    this.children = children;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest = (UpdateTrackerItemChildrenRequest) o;
    return Objects.equals(this.children, updateTrackerItemChildrenRequest.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTrackerItemChildrenRequest {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

