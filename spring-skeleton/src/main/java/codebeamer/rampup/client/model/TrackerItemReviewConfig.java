

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
 * The configuration from which the review was created
 */
@JsonPropertyOrder({
  TrackerItemReviewConfig.JSON_PROPERTY_REQUIRED_SIGNATURE,
  TrackerItemReviewConfig.JSON_PROPERTY_REQUIRED_APPROVALS,
  TrackerItemReviewConfig.JSON_PROPERTY_REQUIRED_REJECTIONS,
  TrackerItemReviewConfig.JSON_PROPERTY_ROLE_REQUIRED
})
public class TrackerItemReviewConfig {
  /**
   * Whether the user has to provide its credentials to vote
   */
  public enum RequiredSignatureEnum {
    NONE("NONE"),
    
    PASSWORD("PASSWORD"),
    
    USERNAME_AND_PASSWORD("USERNAME_AND_PASSWORD");

    private String value;

    RequiredSignatureEnum(String value) {
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
    public static RequiredSignatureEnum fromValue(String value) {
      for (RequiredSignatureEnum b : RequiredSignatureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REQUIRED_SIGNATURE = "requiredSignature";
  private RequiredSignatureEnum requiredSignature;

  public static final String JSON_PROPERTY_REQUIRED_APPROVALS = "requiredApprovals";
  private Integer requiredApprovals;

  public static final String JSON_PROPERTY_REQUIRED_REJECTIONS = "requiredRejections";
  private Integer requiredRejections;

  public static final String JSON_PROPERTY_ROLE_REQUIRED = "roleRequired";
  private Boolean roleRequired;

  public TrackerItemReviewConfig() {
  }

  public TrackerItemReviewConfig requiredSignature(RequiredSignatureEnum requiredSignature) {
    
    this.requiredSignature = requiredSignature;
    return this;
  }

   /**
   * Whether the user has to provide its credentials to vote
   * @return requiredSignature
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRED_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RequiredSignatureEnum getRequiredSignature() {
    return requiredSignature;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequiredSignature(RequiredSignatureEnum requiredSignature) {
    this.requiredSignature = requiredSignature;
  }


  public TrackerItemReviewConfig requiredApprovals(Integer requiredApprovals) {
    
    this.requiredApprovals = requiredApprovals;
    return this;
  }

   /**
   * Number of approvals after which the review is considered approved
   * @return requiredApprovals
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRED_APPROVALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRequiredApprovals() {
    return requiredApprovals;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED_APPROVALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequiredApprovals(Integer requiredApprovals) {
    this.requiredApprovals = requiredApprovals;
  }


  public TrackerItemReviewConfig requiredRejections(Integer requiredRejections) {
    
    this.requiredRejections = requiredRejections;
    return this;
  }

   /**
   * Number of rejections after which the review is considered rejected
   * @return requiredRejections
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRED_REJECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRequiredRejections() {
    return requiredRejections;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED_REJECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequiredRejections(Integer requiredRejections) {
    this.requiredRejections = requiredRejections;
  }


  public TrackerItemReviewConfig roleRequired(Boolean roleRequired) {
    
    this.roleRequired = roleRequired;
    return this;
  }

   /**
   * Whether the reviewers have to chose in which of their roles do they want to vote
   * @return roleRequired
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ROLE_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRoleRequired() {
    return roleRequired;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleRequired(Boolean roleRequired) {
    this.roleRequired = roleRequired;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemReviewConfig trackerItemReviewConfig = (TrackerItemReviewConfig) o;
    return Objects.equals(this.requiredSignature, trackerItemReviewConfig.requiredSignature) &&
        Objects.equals(this.requiredApprovals, trackerItemReviewConfig.requiredApprovals) &&
        Objects.equals(this.requiredRejections, trackerItemReviewConfig.requiredRejections) &&
        Objects.equals(this.roleRequired, trackerItemReviewConfig.roleRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredSignature, requiredApprovals, requiredRejections, roleRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemReviewConfig {\n");
    sb.append("    requiredSignature: ").append(toIndentedString(requiredSignature)).append("\n");
    sb.append("    requiredApprovals: ").append(toIndentedString(requiredApprovals)).append("\n");
    sb.append("    requiredRejections: ").append(toIndentedString(requiredRejections)).append("\n");
    sb.append("    roleRequired: ").append(toIndentedString(roleRequired)).append("\n");
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

