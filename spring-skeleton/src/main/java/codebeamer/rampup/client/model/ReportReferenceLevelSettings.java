

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
 * Reference level settings for Intelligent Table View.
 */
@JsonPropertyOrder({
  ReportReferenceLevelSettings.JSON_PROPERTY_REFERENCE_TRACKERS,
  ReportReferenceLevelSettings.JSON_PROPERTY_REFERENCE_TRACKER_TYPES,
  ReportReferenceLevelSettings.JSON_PROPERTY_COLUMNS,
  ReportReferenceLevelSettings.JSON_PROPERTY_UPSTREAM_REFERENCE,
  ReportReferenceLevelSettings.JSON_PROPERTY_DOWNSTREAM_REFERENCE,
  ReportReferenceLevelSettings.JSON_PROPERTY_LEVEL
})
public class ReportReferenceLevelSettings {
  public static final String JSON_PROPERTY_REFERENCE_TRACKERS = "referenceTrackers";
  private List<TrackerReference> referenceTrackers;

  public static final String JSON_PROPERTY_REFERENCE_TRACKER_TYPES = "referenceTrackerTypes";
  private List<TrackerTypeReference> referenceTrackerTypes;

  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<ReportColumnSettings> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_UPSTREAM_REFERENCE = "upstreamReference";
  private Boolean upstreamReference;

  public static final String JSON_PROPERTY_DOWNSTREAM_REFERENCE = "downstreamReference";
  private Boolean downstreamReference;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private Integer level;

  public ReportReferenceLevelSettings() {
  }

  public ReportReferenceLevelSettings referenceTrackers(List<TrackerReference> referenceTrackers) {
    
    this.referenceTrackers = referenceTrackers;
    return this;
  }

  public ReportReferenceLevelSettings addReferenceTrackersItem(TrackerReference referenceTrackersItem) {
    if (this.referenceTrackers == null) {
      this.referenceTrackers = new ArrayList<>();
    }
    this.referenceTrackers.add(referenceTrackersItem);
    return this;
  }

   /**
   * Trackers to include on this level.
   * @return referenceTrackers
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_TRACKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerReference> getReferenceTrackers() {
    return referenceTrackers;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_TRACKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceTrackers(List<TrackerReference> referenceTrackers) {
    this.referenceTrackers = referenceTrackers;
  }


  public ReportReferenceLevelSettings referenceTrackerTypes(List<TrackerTypeReference> referenceTrackerTypes) {
    
    this.referenceTrackerTypes = referenceTrackerTypes;
    return this;
  }

  public ReportReferenceLevelSettings addReferenceTrackerTypesItem(TrackerTypeReference referenceTrackerTypesItem) {
    if (this.referenceTrackerTypes == null) {
      this.referenceTrackerTypes = new ArrayList<>();
    }
    this.referenceTrackerTypes.add(referenceTrackerTypesItem);
    return this;
  }

   /**
   * Tracker types to include on this level.
   * @return referenceTrackerTypes
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_TRACKER_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TrackerTypeReference> getReferenceTrackerTypes() {
    return referenceTrackerTypes;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_TRACKER_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceTrackerTypes(List<TrackerTypeReference> referenceTrackerTypes) {
    this.referenceTrackerTypes = referenceTrackerTypes;
  }


  public ReportReferenceLevelSettings columns(List<ReportColumnSettings> columns) {
    
    this.columns = columns;
    return this;
  }

  public ReportReferenceLevelSettings addColumnsItem(ReportColumnSettings columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Columns to show on this reference level.
   * @return columns
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ReportColumnSettings> getColumns() {
    return columns;
  }


  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setColumns(List<ReportColumnSettings> columns) {
    this.columns = columns;
  }


  public ReportReferenceLevelSettings upstreamReference(Boolean upstreamReference) {
    
    this.upstreamReference = upstreamReference;
    return this;
  }

   /**
   * Include upstream references indicator.
   * @return upstreamReference
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_UPSTREAM_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getUpstreamReference() {
    return upstreamReference;
  }


  @JsonProperty(JSON_PROPERTY_UPSTREAM_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpstreamReference(Boolean upstreamReference) {
    this.upstreamReference = upstreamReference;
  }


  public ReportReferenceLevelSettings downstreamReference(Boolean downstreamReference) {
    
    this.downstreamReference = downstreamReference;
    return this;
  }

   /**
   * Include downstream references indicator.
   * @return downstreamReference
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_DOWNSTREAM_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDownstreamReference() {
    return downstreamReference;
  }


  @JsonProperty(JSON_PROPERTY_DOWNSTREAM_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDownstreamReference(Boolean downstreamReference) {
    this.downstreamReference = downstreamReference;
  }


  public ReportReferenceLevelSettings level(Integer level) {
    
    this.level = level;
    return this;
  }

   /**
   * Level of the reference layer
   * minimum: 1
   * @return level
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLevel(Integer level) {
    this.level = level;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportReferenceLevelSettings reportReferenceLevelSettings = (ReportReferenceLevelSettings) o;
    return Objects.equals(this.referenceTrackers, reportReferenceLevelSettings.referenceTrackers) &&
        Objects.equals(this.referenceTrackerTypes, reportReferenceLevelSettings.referenceTrackerTypes) &&
        Objects.equals(this.columns, reportReferenceLevelSettings.columns) &&
        Objects.equals(this.upstreamReference, reportReferenceLevelSettings.upstreamReference) &&
        Objects.equals(this.downstreamReference, reportReferenceLevelSettings.downstreamReference) &&
        Objects.equals(this.level, reportReferenceLevelSettings.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceTrackers, referenceTrackerTypes, columns, upstreamReference, downstreamReference, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportReferenceLevelSettings {\n");
    sb.append("    referenceTrackers: ").append(toIndentedString(referenceTrackers)).append("\n");
    sb.append("    referenceTrackerTypes: ").append(toIndentedString(referenceTrackerTypes)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    upstreamReference: ").append(toIndentedString(upstreamReference)).append("\n");
    sb.append("    downstreamReference: ").append(toIndentedString(downstreamReference)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

