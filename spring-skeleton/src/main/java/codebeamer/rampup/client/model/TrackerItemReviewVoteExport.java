

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;

/**
 * A reviewer and its vote for a particular Tracker Item Review instance
 */
@JsonPropertyOrder({
  TrackerItemReviewVoteExport.JSON_PROPERTY_USER_NAME,
  TrackerItemReviewVoteExport.JSON_PROPERTY_REVIEWED_AT,
  TrackerItemReviewVoteExport.JSON_PROPERTY_DECISION,
  TrackerItemReviewVoteExport.JSON_PROPERTY_FIRST_NAME,
  TrackerItemReviewVoteExport.JSON_PROPERTY_LAST_NAME,
  TrackerItemReviewVoteExport.JSON_PROPERTY_ROLE_NAME
})
public class TrackerItemReviewVoteExport {
  public static final String JSON_PROPERTY_USER_NAME = "userName";
  private String userName;

  public static final String JSON_PROPERTY_REVIEWED_AT = "reviewedAt";
  private OffsetDateTime reviewedAt;

  public static final String JSON_PROPERTY_DECISION = "decision";
  private String decision;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_ROLE_NAME = "roleName";
  private String roleName;

  public TrackerItemReviewVoteExport() {
  }

  public TrackerItemReviewVoteExport userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * Username of the user who voted
   * @return userName
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserName(String userName) {
    this.userName = userName;
  }


  public TrackerItemReviewVoteExport reviewedAt(OffsetDateTime reviewedAt) {
    
    this.reviewedAt = reviewedAt;
    return this;
  }

   /**
   * Time at when the review was performed
   * @return reviewedAt
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REVIEWED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getReviewedAt() {
    return reviewedAt;
  }


  @JsonProperty(JSON_PROPERTY_REVIEWED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewedAt(OffsetDateTime reviewedAt) {
    this.reviewedAt = reviewedAt;
  }


  public TrackerItemReviewVoteExport decision(String decision) {
    
    this.decision = decision;
    return this;
  }

   /**
   * What the reviewer voted for
   * @return decision
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_DECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDecision() {
    return decision;
  }


  @JsonProperty(JSON_PROPERTY_DECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDecision(String decision) {
    this.decision = decision;
  }


  public TrackerItemReviewVoteExport firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the reviewer
   * @return firstName
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public TrackerItemReviewVoteExport lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the reviewer
   * @return lastName
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public TrackerItemReviewVoteExport roleName(String roleName) {
    
    this.roleName = roleName;
    return this;
  }

   /**
   * Name of the role which the reviewer chose to use to vote
   * @return roleName
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ROLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoleName() {
    return roleName;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemReviewVoteExport trackerItemReviewVoteExport = (TrackerItemReviewVoteExport) o;
    return Objects.equals(this.userName, trackerItemReviewVoteExport.userName) &&
        Objects.equals(this.reviewedAt, trackerItemReviewVoteExport.reviewedAt) &&
        Objects.equals(this.decision, trackerItemReviewVoteExport.decision) &&
        Objects.equals(this.firstName, trackerItemReviewVoteExport.firstName) &&
        Objects.equals(this.lastName, trackerItemReviewVoteExport.lastName) &&
        Objects.equals(this.roleName, trackerItemReviewVoteExport.roleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, reviewedAt, decision, firstName, lastName, roleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemReviewVoteExport {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    reviewedAt: ").append(toIndentedString(reviewedAt)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
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

