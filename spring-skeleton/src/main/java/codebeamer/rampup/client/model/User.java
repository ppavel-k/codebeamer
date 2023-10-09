

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
 * Properties of a codebeamer user
 */
@JsonPropertyOrder({
  User.JSON_PROPERTY_ID,
  User.JSON_PROPERTY_NAME,
  User.JSON_PROPERTY_FIRST_NAME,
  User.JSON_PROPERTY_LAST_NAME,
  User.JSON_PROPERTY_EMAIL,
  User.JSON_PROPERTY_TITLE,
  User.JSON_PROPERTY_COMPANY,
  User.JSON_PROPERTY_ADDRESS,
  User.JSON_PROPERTY_ZIP,
  User.JSON_PROPERTY_CITY,
  User.JSON_PROPERTY_STATE,
  User.JSON_PROPERTY_COUNTRY,
  User.JSON_PROPERTY_DATE_FORMAT,
  User.JSON_PROPERTY_TIME_ZONE,
  User.JSON_PROPERTY_LANGUAGE,
  User.JSON_PROPERTY_PHONE,
  User.JSON_PROPERTY_SKILLS,
  User.JSON_PROPERTY_REGISTRY_DATE,
  User.JSON_PROPERTY_LAST_LOGIN_DATE,
  User.JSON_PROPERTY_STATUS
})
public class User {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_COMPANY = "company";
  private String company;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_ZIP = "zip";
  private String zip;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_DATE_FORMAT = "dateFormat";
  private String dateFormat;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  private String timeZone;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_SKILLS = "skills";
  private String skills;

  public static final String JSON_PROPERTY_REGISTRY_DATE = "registryDate";
  private OffsetDateTime registryDate;

  public static final String JSON_PROPERTY_LAST_LOGIN_DATE = "lastLoginDate";
  private OffsetDateTime lastLoginDate;

  /**
   * Status of a user
   */
  public enum StatusEnum {
    ACTIVATED("ACTIVATED"),
    
    DISABLED("DISABLED"),
    
    INACTIVATION("INACTIVATION");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public User() {
  }

  public User id(Integer id) {
    
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


  public User name(String name) {
    
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


  public User firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of a user
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


  public User lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of a user
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


  public User email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email of a user
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


  public User title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of a user
   * @return title
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public User company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * Company of a user
   * @return company
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompany() {
    return company;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompany(String company) {
    this.company = company;
  }


  public User address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address of a user
   * @return address
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(String address) {
    this.address = address;
  }


  public User zip(String zip) {
    
    this.zip = zip;
    return this;
  }

   /**
   * Zip of a user
   * @return zip
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_ZIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZip() {
    return zip;
  }


  @JsonProperty(JSON_PROPERTY_ZIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZip(String zip) {
    this.zip = zip;
  }


  public User city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City of a user
   * @return city
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public User state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * State / providence of a user
   * @return state
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public User country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country of a user in ISO 3166-1 alpha-2 format
   * @return country
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public User dateFormat(String dateFormat) {
    
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Date format of a user
   * @return dateFormat
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_DATE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateFormat() {
    return dateFormat;
  }


  @JsonProperty(JSON_PROPERTY_DATE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }


  public User timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Time zone of a user
   * @return timeZone
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  public User language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Language of a user in ISO 639-1 format
   * @return language
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public User phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone number of a user
   * @return phone
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(String phone) {
    this.phone = phone;
  }


  public User skills(String skills) {
    
    this.skills = skills;
    return this;
  }

   /**
   * Skills of a user
   * @return skills
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SKILLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSkills() {
    return skills;
  }


  @JsonProperty(JSON_PROPERTY_SKILLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkills(String skills) {
    this.skills = skills;
  }


  public User registryDate(OffsetDateTime registryDate) {
    
    this.registryDate = registryDate;
    return this;
  }

   /**
   * Registration date of a user
   * @return registryDate
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REGISTRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getRegistryDate() {
    return registryDate;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistryDate(OffsetDateTime registryDate) {
    this.registryDate = registryDate;
  }


  public User lastLoginDate(OffsetDateTime lastLoginDate) {
    
    this.lastLoginDate = lastLoginDate;
    return this;
  }

   /**
   * Last login date of a user
   * @return lastLoginDate
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_LAST_LOGIN_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastLoginDate() {
    return lastLoginDate;
  }


  @JsonProperty(JSON_PROPERTY_LAST_LOGIN_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastLoginDate(OffsetDateTime lastLoginDate) {
    this.lastLoginDate = lastLoginDate;
  }


  public User status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of a user
   * @return status
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.title, user.title) &&
        Objects.equals(this.company, user.company) &&
        Objects.equals(this.address, user.address) &&
        Objects.equals(this.zip, user.zip) &&
        Objects.equals(this.city, user.city) &&
        Objects.equals(this.state, user.state) &&
        Objects.equals(this.country, user.country) &&
        Objects.equals(this.dateFormat, user.dateFormat) &&
        Objects.equals(this.timeZone, user.timeZone) &&
        Objects.equals(this.language, user.language) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.skills, user.skills) &&
        Objects.equals(this.registryDate, user.registryDate) &&
        Objects.equals(this.lastLoginDate, user.lastLoginDate) &&
        Objects.equals(this.status, user.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, firstName, lastName, email, title, company, address, zip, city, state, country, dateFormat, timeZone, language, phone, skills, registryDate, lastLoginDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    registryDate: ").append(toIndentedString(registryDate)).append("\n");
    sb.append("    lastLoginDate: ").append(toIndentedString(lastLoginDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

