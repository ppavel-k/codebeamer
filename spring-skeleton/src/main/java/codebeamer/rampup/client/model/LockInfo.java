

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
 * Information about an artifact lock
 */
@JsonPropertyOrder({
  LockInfo.JSON_PROPERTY_USER,
  LockInfo.JSON_PROPERTY_EXPIRES
})
public class LockInfo {
  public static final String JSON_PROPERTY_USER = "user";
  private UserReference user;

  public static final String JSON_PROPERTY_EXPIRES = "expires";
  private Boolean expires;

  public LockInfo() {
  }

  public LockInfo user(UserReference user) {
    
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


  public LockInfo expires(Boolean expires) {
    
    this.expires = expires;
    return this;
  }

   /**
   * Whether the lock will expire on its own, eg. if it is a soft lock
   * @return expires
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExpires() {
    return expires;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpires(Boolean expires) {
    this.expires = expires;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LockInfo lockInfo = (LockInfo) o;
    return Objects.equals(this.user, lockInfo.user) &&
        Objects.equals(this.expires, lockInfo.expires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, expires);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockInfo {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
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

