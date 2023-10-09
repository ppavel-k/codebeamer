

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;

/**
 * Request data to retrieve tracker item attachments.
 */
@JsonPropertyOrder({
  TrackerItemAttachmentRequest.JSON_PROPERTY_BASELINE_ID,
  TrackerItemAttachmentRequest.JSON_PROPERTY_EXCLUDE_FILTER,
  TrackerItemAttachmentRequest.JSON_PROPERTY_EXTENSIONS,
  TrackerItemAttachmentRequest.JSON_PROPERTY_MIME_TYPES
})
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class TrackerItemAttachmentRequest extends TrackerItemsRequest {
  public static final String JSON_PROPERTY_BASELINE_ID = "baselineId";
  private Integer baselineId;

  public static final String JSON_PROPERTY_EXCLUDE_FILTER = "excludeFilter";
  private Boolean excludeFilter;

  public static final String JSON_PROPERTY_EXTENSIONS = "extensions";
  private List<String> extensions;

  public static final String JSON_PROPERTY_MIME_TYPES = "mimeTypes";
  private List<String> mimeTypes;

  public TrackerItemAttachmentRequest() {

  }

  public TrackerItemAttachmentRequest baselineId(Integer baselineId) {
    
    this.baselineId = baselineId;
    return this;
  }

   /**
   * Baseline id to specify the versions of the tracker items.
   * @return baselineId
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_BASELINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBaselineId() {
    return baselineId;
  }


  @JsonProperty(JSON_PROPERTY_BASELINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaselineId(Integer baselineId) {
    this.baselineId = baselineId;
  }


  public TrackerItemAttachmentRequest excludeFilter(Boolean excludeFilter) {
    
    this.excludeFilter = excludeFilter;
    return this;
  }

   /**
   * Indicator if the attachments matching the filters need to be excluded or not
   * @return excludeFilter
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDE_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExcludeFilter() {
    return excludeFilter;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludeFilter(Boolean excludeFilter) {
    this.excludeFilter = excludeFilter;
  }


  public TrackerItemAttachmentRequest extensions(List<String> extensions) {
    
    this.extensions = extensions;
    return this;
  }

  public TrackerItemAttachmentRequest addExtensionsItem(String extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * File extension filters.
   * @return extensions
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_EXTENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getExtensions() {
    return extensions;
  }


  @JsonProperty(JSON_PROPERTY_EXTENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtensions(List<String> extensions) {
    this.extensions = extensions;
  }


  public TrackerItemAttachmentRequest mimeTypes(List<String> mimeTypes) {
    
    this.mimeTypes = mimeTypes;
    return this;
  }

  public TrackerItemAttachmentRequest addMimeTypesItem(String mimeTypesItem) {
    if (this.mimeTypes == null) {
      this.mimeTypes = new ArrayList<>();
    }
    this.mimeTypes.add(mimeTypesItem);
    return this;
  }

   /**
   * File mime type filters.
   * @return mimeTypes
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MIME_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMimeTypes() {
    return mimeTypes;
  }


  @JsonProperty(JSON_PROPERTY_MIME_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMimeTypes(List<String> mimeTypes) {
    this.mimeTypes = mimeTypes;
  }

  @Override
  public TrackerItemAttachmentRequest items(List<TrackerItemReference> items) {
    this.setItems(items);
    return this;
  }

  @Override
  public TrackerItemAttachmentRequest type(String type) {
    this.setType(type);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemAttachmentRequest trackerItemAttachmentRequest = (TrackerItemAttachmentRequest) o;
    return Objects.equals(this.baselineId, trackerItemAttachmentRequest.baselineId) &&
        Objects.equals(this.excludeFilter, trackerItemAttachmentRequest.excludeFilter) &&
        Objects.equals(this.extensions, trackerItemAttachmentRequest.extensions) &&
        Objects.equals(this.mimeTypes, trackerItemAttachmentRequest.mimeTypes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baselineId, excludeFilter, extensions, mimeTypes, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemAttachmentRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    baselineId: ").append(toIndentedString(baselineId)).append("\n");
    sb.append("    excludeFilter: ").append(toIndentedString(excludeFilter)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
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
