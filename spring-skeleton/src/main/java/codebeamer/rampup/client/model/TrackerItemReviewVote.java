

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.Nullable;

/**
 * A tracker item review instance including its reviewers and their decisions
 */
@JsonPropertyOrder({
  TrackerItemReviewVote.JSON_PROPERTY_USER,
  TrackerItemReviewVote.JSON_PROPERTY_AS_ROLE,
  TrackerItemReviewVote.JSON_PROPERTY_DECISION,
  TrackerItemReviewVote.JSON_PROPERTY_REVIEWED_AT
})
public class TrackerItemReviewVote {
  public static final String JSON_PROPERTY_USER = "user";
  private UserReference user;

  public static final String JSON_PROPERTY_AS_ROLE = "asRole";
  private RoleReference asRole;

  /**
   * The result of this particular vote
   */
  public enum DecisionEnum {
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED"),
    
    UNDECIDED("UNDECIDED");

    private String value;

    DecisionEnum(String value) {
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
    public static DecisionEnum fromValue(String value) {
      for (DecisionEnum b : DecisionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DECISION = "decision";
  private DecisionEnum decision;

  public static final String JSON_PROPERTY_REVIEWED_AT = "reviewedAt";
  private OffsetDateTime reviewedAt;

  public TrackerItemReviewVote() {
  }

  public TrackerItemReviewVote user(UserReference user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserReference getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(UserReference user) {
    this.user = user;
  }


  public TrackerItemReviewVote asRole(RoleReference asRole) {
    
    this.asRole = asRole;
    return this;
  }

   /**
   * Get asRole
   * @return asRole
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_AS_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoleReference getAsRole() {
    return asRole;
  }


  @JsonProperty(JSON_PROPERTY_AS_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsRole(RoleReference asRole) {
    this.asRole = asRole;
  }


  public TrackerItemReviewVote decision(DecisionEnum decision) {
    
    this.decision = decision;
    return this;
  }

   /**
   * The result of this particular vote
   * @return decision
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_DECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DecisionEnum getDecision() {
    return decision;
  }


  @JsonProperty(JSON_PROPERTY_DECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDecision(DecisionEnum decision) {
    this.decision = decision;
  }


  public TrackerItemReviewVote reviewedAt(OffsetDateTime reviewedAt) {
    
    this.reviewedAt = reviewedAt;
    return this;
  }

   /**
   * Date and time of the vote
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemReviewVote trackerItemReviewVote = (TrackerItemReviewVote) o;
    return Objects.equals(this.user, trackerItemReviewVote.user) &&
        Objects.equals(this.asRole, trackerItemReviewVote.asRole) &&
        Objects.equals(this.decision, trackerItemReviewVote.decision) &&
        Objects.equals(this.reviewedAt, trackerItemReviewVote.reviewedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, asRole, decision, reviewedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemReviewVote {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    asRole: ").append(toIndentedString(asRole)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    reviewedAt: ").append(toIndentedString(reviewedAt)).append("\n");
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

