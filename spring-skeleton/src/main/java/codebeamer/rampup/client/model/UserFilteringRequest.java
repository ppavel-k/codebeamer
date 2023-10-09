

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
 * UserFilteringRequest
 */
@JsonPropertyOrder({
  UserFilteringRequest.JSON_PROPERTY_NAME,
  UserFilteringRequest.JSON_PROPERTY_LAST_NAME,
  UserFilteringRequest.JSON_PROPERTY_FIRST_NAME,
  UserFilteringRequest.JSON_PROPERTY_EMAIL,
  UserFilteringRequest.JSON_PROPERTY_PROJECT_ID,
  UserFilteringRequest.JSON_PROPERTY_USER_STATUS
})
public class UserFilteringRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private Integer projectId;

  /**
   * Status of the user
   */
  public enum UserStatusEnum {
    ACTIVATED("ACTIVATED"),
    
    DISABLED("DISABLED"),
    
    INACTIVATION("INACTIVATION");

    private String value;

    UserStatusEnum(String value) {
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
    public static UserStatusEnum fromValue(String value) {
      for (UserStatusEnum b : UserStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  private UserStatusEnum userStatus;

  public UserFilteringRequest() {
  }

  public UserFilteringRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the user
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


  public UserFilteringRequest lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the user
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


  public UserFilteringRequest firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the user
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


  public UserFilteringRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email of the user
   * @return email
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public UserFilteringRequest projectId(Integer projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Id of the project where the user is a member
   * @return projectId
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }


  public UserFilteringRequest userStatus(UserStatusEnum userStatus) {
    
    this.userStatus = userStatus;
    return this;
  }

   /**
   * Status of the user
   * @return userStatus
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserStatusEnum getUserStatus() {
    return userStatus;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatus(UserStatusEnum userStatus) {
    this.userStatus = userStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFilteringRequest userFilteringRequest = (UserFilteringRequest) o;
    return Objects.equals(this.name, userFilteringRequest.name) &&
        Objects.equals(this.lastName, userFilteringRequest.lastName) &&
        Objects.equals(this.firstName, userFilteringRequest.firstName) &&
        Objects.equals(this.email, userFilteringRequest.email) &&
        Objects.equals(this.projectId, userFilteringRequest.projectId) &&
        Objects.equals(this.userStatus, userFilteringRequest.userStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lastName, firstName, email, projectId, userStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFilteringRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
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

