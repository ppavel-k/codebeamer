

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.Nullable;

/**
 * TrackerType
 */
@JsonPropertyOrder({
  TrackerType.JSON_PROPERTY_ID,
  TrackerType.JSON_PROPERTY_NAME,
  TrackerType.JSON_PROPERTY_VAR_NAME,
  TrackerType.JSON_PROPERTY_TRACKER_ICON_URL,
  TrackerType.JSON_PROPERTY_ITEM_ICON_URL,
  TrackerType.JSON_PROPERTY_COLOR,
  TrackerType.JSON_PROPERTY_OUTLINE,
  TrackerType.JSON_PROPERTY_BRANCHABLE,
  TrackerType.JSON_PROPERTY_DOC_EDIT_VIEW,
  TrackerType.JSON_PROPERTY_EDITOR_URL,
  TrackerType.JSON_PROPERTY_URL_LINK_FORMAT
})
public class TrackerType {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VAR_NAME = "varName";
  private String varName;

  public static final String JSON_PROPERTY_TRACKER_ICON_URL = "trackerIconUrl";
  private String trackerIconUrl;

  public static final String JSON_PROPERTY_ITEM_ICON_URL = "itemIconUrl";
  private String itemIconUrl;

  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public static final String JSON_PROPERTY_OUTLINE = "outline";
  private Boolean outline;

  public static final String JSON_PROPERTY_BRANCHABLE = "branchable";
  private Boolean branchable;

  public static final String JSON_PROPERTY_DOC_EDIT_VIEW = "docEditView";
  private Boolean docEditView;

  public static final String JSON_PROPERTY_EDITOR_URL = "editorUrl";
  private String editorUrl;

  public static final String JSON_PROPERTY_URL_LINK_FORMAT = "urlLinkFormat";
  private String urlLinkFormat;

  public TrackerType() {
  }

  public TrackerType id(Integer id) {
    
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


  public TrackerType name(String name) {
    
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


  public TrackerType varName(String varName) {
    
    this.varName = varName;
    return this;
  }

   /**
   * Internal/variable name of a tracker type
   * @return varName
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_VAR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVarName() {
    return varName;
  }


  @JsonProperty(JSON_PROPERTY_VAR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVarName(String varName) {
    this.varName = varName;
  }


  public TrackerType trackerIconUrl(String trackerIconUrl) {
    
    this.trackerIconUrl = trackerIconUrl;
    return this;
  }

   /**
   * Tracker icon URL of a tracker type
   * @return trackerIconUrl
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TRACKER_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackerIconUrl() {
    return trackerIconUrl;
  }


  @JsonProperty(JSON_PROPERTY_TRACKER_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackerIconUrl(String trackerIconUrl) {
    this.trackerIconUrl = trackerIconUrl;
  }


  public TrackerType itemIconUrl(String itemIconUrl) {
    
    this.itemIconUrl = itemIconUrl;
    return this;
  }

   /**
   * Item icon URL of a tracker type
   * @return itemIconUrl
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ITEM_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getItemIconUrl() {
    return itemIconUrl;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemIconUrl(String itemIconUrl) {
    this.itemIconUrl = itemIconUrl;
  }


  public TrackerType color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Color of a tracker type
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


  public TrackerType outline(Boolean outline) {
    
    this.outline = outline;
    return this;
  }

   /**
   * True if outline is enabled
   * @return outline
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_OUTLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOutline() {
    return outline;
  }


  @JsonProperty(JSON_PROPERTY_OUTLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutline(Boolean outline) {
    this.outline = outline;
  }


  public TrackerType branchable(Boolean branchable) {
    
    this.branchable = branchable;
    return this;
  }

   /**
   * True if tracker type is branchable
   * @return branchable
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_BRANCHABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBranchable() {
    return branchable;
  }


  @JsonProperty(JSON_PROPERTY_BRANCHABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBranchable(Boolean branchable) {
    this.branchable = branchable;
  }


  public TrackerType docEditView(Boolean docEditView) {
    
    this.docEditView = docEditView;
    return this;
  }

   /**
   * True if tracker type has document view
   * @return docEditView
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_DOC_EDIT_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDocEditView() {
    return docEditView;
  }


  @JsonProperty(JSON_PROPERTY_DOC_EDIT_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocEditView(Boolean docEditView) {
    this.docEditView = docEditView;
  }


  public TrackerType editorUrl(String editorUrl) {
    
    this.editorUrl = editorUrl;
    return this;
  }

   /**
   * Editor URL of a tracker type
   * @return editorUrl
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_EDITOR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEditorUrl() {
    return editorUrl;
  }


  @JsonProperty(JSON_PROPERTY_EDITOR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditorUrl(String editorUrl) {
    this.editorUrl = editorUrl;
  }


  public TrackerType urlLinkFormat(String urlLinkFormat) {
    
    this.urlLinkFormat = urlLinkFormat;
    return this;
  }

   /**
   * URL link format of a tracker type
   * @return urlLinkFormat
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_URL_LINK_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrlLinkFormat() {
    return urlLinkFormat;
  }


  @JsonProperty(JSON_PROPERTY_URL_LINK_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlLinkFormat(String urlLinkFormat) {
    this.urlLinkFormat = urlLinkFormat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerType trackerType = (TrackerType) o;
    return Objects.equals(this.id, trackerType.id) &&
        Objects.equals(this.name, trackerType.name) &&
        Objects.equals(this.varName, trackerType.varName) &&
        Objects.equals(this.trackerIconUrl, trackerType.trackerIconUrl) &&
        Objects.equals(this.itemIconUrl, trackerType.itemIconUrl) &&
        Objects.equals(this.color, trackerType.color) &&
        Objects.equals(this.outline, trackerType.outline) &&
        Objects.equals(this.branchable, trackerType.branchable) &&
        Objects.equals(this.docEditView, trackerType.docEditView) &&
        Objects.equals(this.editorUrl, trackerType.editorUrl) &&
        Objects.equals(this.urlLinkFormat, trackerType.urlLinkFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, varName, trackerIconUrl, itemIconUrl, color, outline, branchable, docEditView, editorUrl, urlLinkFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    varName: ").append(toIndentedString(varName)).append("\n");
    sb.append("    trackerIconUrl: ").append(toIndentedString(trackerIconUrl)).append("\n");
    sb.append("    itemIconUrl: ").append(toIndentedString(itemIconUrl)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    outline: ").append(toIndentedString(outline)).append("\n");
    sb.append("    branchable: ").append(toIndentedString(branchable)).append("\n");
    sb.append("    docEditView: ").append(toIndentedString(docEditView)).append("\n");
    sb.append("    editorUrl: ").append(toIndentedString(editorUrl)).append("\n");
    sb.append("    urlLinkFormat: ").append(toIndentedString(urlLinkFormat)).append("\n");
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

