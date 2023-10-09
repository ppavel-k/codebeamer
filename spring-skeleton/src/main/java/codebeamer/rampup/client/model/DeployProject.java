

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;

/**
 * DeployProject
 */
@JsonPropertyOrder({
  DeployProject.JSON_PROPERTY_PROJECT,
  DeployProject.JSON_PROPERTY_CONFIGURATION_FILE_ID,
  DeployProject.JSON_PROPERTY_PROJECT_FILE_ID,
  DeployProject.JSON_PROPERTY_PASSWORD
})
public class DeployProject {
  public static final String JSON_PROPERTY_PROJECT = "project";
  private ProjectReference project;

  public static final String JSON_PROPERTY_CONFIGURATION_FILE_ID = "configurationFileId";
  private Integer configurationFileId;

  public static final String JSON_PROPERTY_PROJECT_FILE_ID = "projectFileId";
  private Integer projectFileId;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public DeployProject() {
  }

  public DeployProject project(ProjectReference project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProjectReference getProject() {
    return project;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProject(ProjectReference project) {
    this.project = project;
  }


  public DeployProject configurationFileId(Integer configurationFileId) {
    
    this.configurationFileId = configurationFileId;
    return this;
  }

   /**
   * Id of a codebeamer document
   * @return configurationFileId
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConfigurationFileId() {
    return configurationFileId;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigurationFileId(Integer configurationFileId) {
    this.configurationFileId = configurationFileId;
  }


  public DeployProject projectFileId(Integer projectFileId) {
    
    this.projectFileId = projectFileId;
    return this;
  }

   /**
   * Id of a codebeamer document
   * @return projectFileId
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProjectFileId() {
    return projectFileId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjectFileId(Integer projectFileId) {
    this.projectFileId = projectFileId;
  }


  public DeployProject password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The password to decrypt the uploaded configuration file
   * @return password
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeployProject deployProject = (DeployProject) o;
    return Objects.equals(this.project, deployProject.project) &&
        Objects.equals(this.configurationFileId, deployProject.configurationFileId) &&
        Objects.equals(this.projectFileId, deployProject.projectFileId) &&
        Objects.equals(this.password, deployProject.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, configurationFileId, projectFileId, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployProject {\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    configurationFileId: ").append(toIndentedString(configurationFileId)).append("\n");
    sb.append("    projectFileId: ").append(toIndentedString(projectFileId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

