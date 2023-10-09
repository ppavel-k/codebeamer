

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
 * Aggregated values for a column of a group.
 */
@JsonPropertyOrder({
  ReportAggregate.JSON_PROPERTY_COLUMN_REF,
  ReportAggregate.JSON_PROPERTY_AVERAGE,
  ReportAggregate.JSON_PROPERTY_MINIMUM,
  ReportAggregate.JSON_PROPERTY_MAXIMUM,
  ReportAggregate.JSON_PROPERTY_SUM
})
public class ReportAggregate {
  public static final String JSON_PROPERTY_COLUMN_REF = "columnRef";
  private String columnRef;

  public static final String JSON_PROPERTY_AVERAGE = "average";
  private Double average;

  public static final String JSON_PROPERTY_MINIMUM = "minimum";
  private Double minimum;

  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  private Double maximum;

  public static final String JSON_PROPERTY_SUM = "sum";
  private Double sum;

  public ReportAggregate() {
  }

  public ReportAggregate columnRef(String columnRef) {
    
    this.columnRef = columnRef;
    return this;
  }

   /**
   * Column reference
   * @return columnRef
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColumnRef() {
    return columnRef;
  }


  @JsonProperty(JSON_PROPERTY_COLUMN_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColumnRef(String columnRef) {
    this.columnRef = columnRef;
  }


  public ReportAggregate average(Double average) {
    
    this.average = average;
    return this;
  }

   /**
   * Average of the column values
   * @return average
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAverage() {
    return average;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverage(Double average) {
    this.average = average;
  }


  public ReportAggregate minimum(Double minimum) {
    
    this.minimum = minimum;
    return this;
  }

   /**
   * Minimum of the column values
   * @return minimum
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMinimum() {
    return minimum;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimum(Double minimum) {
    this.minimum = minimum;
  }


  public ReportAggregate maximum(Double maximum) {
    
    this.maximum = maximum;
    return this;
  }

   /**
   * Average of the column values
   * @return maximum
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMaximum() {
    return maximum;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximum(Double maximum) {
    this.maximum = maximum;
  }


  public ReportAggregate sum(Double sum) {
    
    this.sum = sum;
    return this;
  }

   /**
   * Sum of the column values
   * @return sum
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSum() {
    return sum;
  }


  @JsonProperty(JSON_PROPERTY_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSum(Double sum) {
    this.sum = sum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportAggregate reportAggregate = (ReportAggregate) o;
    return Objects.equals(this.columnRef, reportAggregate.columnRef) &&
        Objects.equals(this.average, reportAggregate.average) &&
        Objects.equals(this.minimum, reportAggregate.minimum) &&
        Objects.equals(this.maximum, reportAggregate.maximum) &&
        Objects.equals(this.sum, reportAggregate.sum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnRef, average, minimum, maximum, sum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAggregate {\n");
    sb.append("    columnRef: ").append(toIndentedString(columnRef)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
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

