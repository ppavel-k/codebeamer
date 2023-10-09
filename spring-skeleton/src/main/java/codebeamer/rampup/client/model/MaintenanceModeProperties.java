

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.NonNull;

/**
 * Extra properties for maintenance mode
 */
@JsonPropertyOrder({
  MaintenanceModeProperties.JSON_PROPERTY_LOGIN_TEXT,
  MaintenanceModeProperties.JSON_PROPERTY_WELCOME_TEXT,
  MaintenanceModeProperties.JSON_PROPERTY_SLOGAN,
  MaintenanceModeProperties.JSON_PROPERTY_LOGIN_ERROR_TEXT,
  MaintenanceModeProperties.JSON_PROPERTY_NOTIFICATION_TEXT
})
public class MaintenanceModeProperties {
  public static final String JSON_PROPERTY_LOGIN_TEXT = "loginText";
  private String loginText;

  public static final String JSON_PROPERTY_WELCOME_TEXT = "welcomeText";
  private String welcomeText;

  public static final String JSON_PROPERTY_SLOGAN = "slogan";
  private String slogan;

  public static final String JSON_PROPERTY_LOGIN_ERROR_TEXT = "loginErrorText";
  private String loginErrorText;

  public static final String JSON_PROPERTY_NOTIFICATION_TEXT = "notificationText";
  private String notificationText;

  public MaintenanceModeProperties() {
  }

  public MaintenanceModeProperties loginText(String loginText) {
    
    this.loginText = loginText;
    return this;
  }

   /**
   * Text shown on login screen
   * @return loginText
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_LOGIN_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLoginText() {
    return loginText;
  }


  @JsonProperty(JSON_PROPERTY_LOGIN_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLoginText(String loginText) {
    this.loginText = loginText;
  }


  public MaintenanceModeProperties welcomeText(String welcomeText) {
    
    this.welcomeText = welcomeText;
    return this;
  }

   /**
   * Welcome text
   * @return welcomeText
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_WELCOME_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWelcomeText() {
    return welcomeText;
  }


  @JsonProperty(JSON_PROPERTY_WELCOME_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWelcomeText(String welcomeText) {
    this.welcomeText = welcomeText;
  }


  public MaintenanceModeProperties slogan(String slogan) {
    
    this.slogan = slogan;
    return this;
  }

   /**
   * Slogan text
   * @return slogan
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_SLOGAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSlogan() {
    return slogan;
  }


  @JsonProperty(JSON_PROPERTY_SLOGAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlogan(String slogan) {
    this.slogan = slogan;
  }


  public MaintenanceModeProperties loginErrorText(String loginErrorText) {
    
    this.loginErrorText = loginErrorText;
    return this;
  }

   /**
   * Error text shown during login
   * @return loginErrorText
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_LOGIN_ERROR_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLoginErrorText() {
    return loginErrorText;
  }


  @JsonProperty(JSON_PROPERTY_LOGIN_ERROR_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLoginErrorText(String loginErrorText) {
    this.loginErrorText = loginErrorText;
  }


  public MaintenanceModeProperties notificationText(String notificationText) {
    
    this.notificationText = notificationText;
    return this;
  }

   /**
   * Notification text
   * @return notificationText
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNotificationText() {
    return notificationText;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNotificationText(String notificationText) {
    this.notificationText = notificationText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceModeProperties maintenanceModeProperties = (MaintenanceModeProperties) o;
    return Objects.equals(this.loginText, maintenanceModeProperties.loginText) &&
        Objects.equals(this.welcomeText, maintenanceModeProperties.welcomeText) &&
        Objects.equals(this.slogan, maintenanceModeProperties.slogan) &&
        Objects.equals(this.loginErrorText, maintenanceModeProperties.loginErrorText) &&
        Objects.equals(this.notificationText, maintenanceModeProperties.notificationText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginText, welcomeText, slogan, loginErrorText, notificationText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceModeProperties {\n");
    sb.append("    loginText: ").append(toIndentedString(loginText)).append("\n");
    sb.append("    welcomeText: ").append(toIndentedString(welcomeText)).append("\n");
    sb.append("    slogan: ").append(toIndentedString(slogan)).append("\n");
    sb.append("    loginErrorText: ").append(toIndentedString(loginErrorText)).append("\n");
    sb.append("    notificationText: ").append(toIndentedString(notificationText)).append("\n");
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

