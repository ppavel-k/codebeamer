

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * Basic properties of a codebeamer association
 */
@JsonPropertyOrder({
  Association.JSON_PROPERTY_ID,
  Association.JSON_PROPERTY_NAME,
  Association.JSON_PROPERTY_DESCRIPTION,
  Association.JSON_PROPERTY_DESCRIPTION_FORMAT,
  Association.JSON_PROPERTY_FROM,
  Association.JSON_PROPERTY_TO,
  Association.JSON_PROPERTY_URL,
  Association.JSON_PROPERTY_TYPE,
  Association.JSON_PROPERTY_PROPAGATING_SUSPECTS,
  Association.JSON_PROPERTY_REVERSE_PROPAGATION,
  Association.JSON_PROPERTY_BI_DIRECTIONAL_PROPAGATION,
  Association.JSON_PROPERTY_PROPAGATING_DEPENDENCIES,
  Association.JSON_PROPERTY_BASELINE_ID,
  Association.JSON_PROPERTY_CREATED_BY,
  Association.JSON_PROPERTY_CREATED_AT
})
public class Association {
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

  public static final String JSON_PROPERTY_FROM = "from";
  private AbstractReference from;

  public static final String JSON_PROPERTY_TO = "to";
  private AbstractReference to;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AssociationTypeReference type;

  public static final String JSON_PROPERTY_PROPAGATING_SUSPECTS = "propagatingSuspects";
  private Boolean propagatingSuspects;

  public static final String JSON_PROPERTY_REVERSE_PROPAGATION = "reversePropagation";
  private Boolean reversePropagation;

  public static final String JSON_PROPERTY_BI_DIRECTIONAL_PROPAGATION = "biDirectionalPropagation";
  private Boolean biDirectionalPropagation;

  public static final String JSON_PROPERTY_PROPAGATING_DEPENDENCIES = "propagatingDependencies";
  private Boolean propagatingDependencies;

  public static final String JSON_PROPERTY_BASELINE_ID = "baselineId";
  private Integer baselineId;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private UserReference createdBy;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public Association() {
  }

  public Association id(Integer id) {
    
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


  public Association name(String name) {
    
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


  public Association description(String description) {
    
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


  public Association descriptionFormat(DescriptionFormatEnum descriptionFormat) {
    
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


  public Association from(AbstractReference from) {
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AbstractReference getFrom() {
    return from;
  }


  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrom(AbstractReference from) {
    this.from = from;
  }


  public Association to(AbstractReference to) {
    
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AbstractReference getTo() {
    return to;
  }


  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTo(AbstractReference to) {
    this.to = to;
  }


  public Association url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Association to url
   * @return url
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public Association type(AssociationTypeReference type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AssociationTypeReference getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(AssociationTypeReference type) {
    this.type = type;
  }


  public Association propagatingSuspects(Boolean propagatingSuspects) {
    
    this.propagatingSuspects = propagatingSuspects;
    return this;
  }

   /**
   * Propagating suspects
   * @return propagatingSuspects
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PROPAGATING_SUSPECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPropagatingSuspects() {
    return propagatingSuspects;
  }


  @JsonProperty(JSON_PROPERTY_PROPAGATING_SUSPECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagatingSuspects(Boolean propagatingSuspects) {
    this.propagatingSuspects = propagatingSuspects;
  }


  public Association reversePropagation(Boolean reversePropagation) {
    
    this.reversePropagation = reversePropagation;
    return this;
  }

   /**
   * Reverse propagation
   * @return reversePropagation
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REVERSE_PROPAGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReversePropagation() {
    return reversePropagation;
  }


  @JsonProperty(JSON_PROPERTY_REVERSE_PROPAGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReversePropagation(Boolean reversePropagation) {
    this.reversePropagation = reversePropagation;
  }


  public Association biDirectionalPropagation(Boolean biDirectionalPropagation) {
    
    this.biDirectionalPropagation = biDirectionalPropagation;
    return this;
  }

   /**
   * Bi-directional reference
   * @return biDirectionalPropagation
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_BI_DIRECTIONAL_PROPAGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBiDirectionalPropagation() {
    return biDirectionalPropagation;
  }


  @JsonProperty(JSON_PROPERTY_BI_DIRECTIONAL_PROPAGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiDirectionalPropagation(Boolean biDirectionalPropagation) {
    this.biDirectionalPropagation = biDirectionalPropagation;
  }


  public Association propagatingDependencies(Boolean propagatingDependencies) {
    
    this.propagatingDependencies = propagatingDependencies;
    return this;
  }

   /**
   * Propagating dependencies
   * @return propagatingDependencies
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PROPAGATING_DEPENDENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPropagatingDependencies() {
    return propagatingDependencies;
  }


  @JsonProperty(JSON_PROPERTY_PROPAGATING_DEPENDENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagatingDependencies(Boolean propagatingDependencies) {
    this.propagatingDependencies = propagatingDependencies;
  }


  public Association baselineId(Integer baselineId) {
    
    this.baselineId = baselineId;
    return this;
  }

   /**
   * Baseline ID
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


  public Association createdBy(UserReference createdBy) {
    
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


  public Association createdAt(OffsetDateTime createdAt) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Association association = (Association) o;
    return Objects.equals(this.id, association.id) &&
        Objects.equals(this.name, association.name) &&
        Objects.equals(this.description, association.description) &&
        Objects.equals(this.descriptionFormat, association.descriptionFormat) &&
        Objects.equals(this.from, association.from) &&
        Objects.equals(this.to, association.to) &&
        Objects.equals(this.url, association.url) &&
        Objects.equals(this.type, association.type) &&
        Objects.equals(this.propagatingSuspects, association.propagatingSuspects) &&
        Objects.equals(this.reversePropagation, association.reversePropagation) &&
        Objects.equals(this.biDirectionalPropagation, association.biDirectionalPropagation) &&
        Objects.equals(this.propagatingDependencies, association.propagatingDependencies) &&
        Objects.equals(this.baselineId, association.baselineId) &&
        Objects.equals(this.createdBy, association.createdBy) &&
        Objects.equals(this.createdAt, association.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, descriptionFormat, from, to, url, type, propagatingSuspects, reversePropagation, biDirectionalPropagation, propagatingDependencies, baselineId, createdBy, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Association {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionFormat: ").append(toIndentedString(descriptionFormat)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    propagatingSuspects: ").append(toIndentedString(propagatingSuspects)).append("\n");
    sb.append("    reversePropagation: ").append(toIndentedString(reversePropagation)).append("\n");
    sb.append("    biDirectionalPropagation: ").append(toIndentedString(biDirectionalPropagation)).append("\n");
    sb.append("    propagatingDependencies: ").append(toIndentedString(propagatingDependencies)).append("\n");
    sb.append("    baselineId: ").append(toIndentedString(baselineId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

