

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
 * A file to migrate from a remote directory.
 */
@JsonPropertyOrder({
  RemoteMigrationFile.JSON_PROPERTY_SHA512SUM,
  RemoteMigrationFile.JSON_PROPERTY_MD5SUM,
  RemoteMigrationFile.JSON_PROPERTY_FILE_PATH,
  RemoteMigrationFile.JSON_PROPERTY_FILE_NAME
})
public class RemoteMigrationFile {
  public static final String JSON_PROPERTY_SHA512SUM = "sha512sum";
  private String sha512sum;

  public static final String JSON_PROPERTY_MD5SUM = "md5sum";
  private String md5sum;

  public static final String JSON_PROPERTY_FILE_PATH = "filePath";
  private String filePath;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public RemoteMigrationFile() {
  }

  public RemoteMigrationFile sha512sum(String sha512sum) {
    
    this.sha512sum = sha512sum;
    return this;
  }

   /**
   * Precomputed SHA512 checksum of the file.
   * @return sha512sum
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SHA512SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSha512sum() {
    return sha512sum;
  }


  @JsonProperty(JSON_PROPERTY_SHA512SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSha512sum(String sha512sum) {
    this.sha512sum = sha512sum;
  }


  public RemoteMigrationFile md5sum(String md5sum) {
    
    this.md5sum = md5sum;
    return this;
  }

   /**
   * Precomputed MD5 checksum of the file.
   * @return md5sum
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MD5SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMd5sum() {
    return md5sum;
  }


  @JsonProperty(JSON_PROPERTY_MD5SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMd5sum(String md5sum) {
    this.md5sum = md5sum;
  }


  public RemoteMigrationFile filePath(String filePath) {
    
    this.filePath = filePath;
    return this;
  }

   /**
   * The path of the file relative to the configured migration home directory.
   * @return filePath
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_FILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFilePath() {
    return filePath;
  }


  @JsonProperty(JSON_PROPERTY_FILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }


  public RemoteMigrationFile fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * File name of the newly created attachment.
   * @return fileName
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteMigrationFile remoteMigrationFile = (RemoteMigrationFile) o;
    return Objects.equals(this.sha512sum, remoteMigrationFile.sha512sum) &&
        Objects.equals(this.md5sum, remoteMigrationFile.md5sum) &&
        Objects.equals(this.filePath, remoteMigrationFile.filePath) &&
        Objects.equals(this.fileName, remoteMigrationFile.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sha512sum, md5sum, filePath, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteMigrationFile {\n");
    sb.append("    sha512sum: ").append(toIndentedString(sha512sum)).append("\n");
    sb.append("    md5sum: ").append(toIndentedString(md5sum)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

