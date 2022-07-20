/*
 * Horreum API
 * Horreum data repository API
 *
 * The version of the OpenAPI document: 0.1-SNAPSHOT
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package software.tnb.horreum.validation.generated.model;

import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * MissingDataRule
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-12T10:19:43.430893315+02:00[Europe/Rome]")
public class MissingDataRule {
    public static final String SERIALIZED_NAME_ID = "id";
    public static final String SERIALIZED_NAME_NAME = "name";
    public static final String SERIALIZED_NAME_LABELS = "labels";
    public static final String SERIALIZED_NAME_CONDITION = "condition";
    public static final String SERIALIZED_NAME_MAX_STALENESS = "maxStaleness";
    public static final String SERIALIZED_NAME_LAST_NOTIFICATION = "lastNotification";
    public static final String SERIALIZED_NAME_TEST_ID = "testId";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    @SerializedName(SERIALIZED_NAME_LABELS)
    private List labels = null;
    @SerializedName(SERIALIZED_NAME_CONDITION)
    private String condition;
    @SerializedName(SERIALIZED_NAME_MAX_STALENESS)
    private Long maxStaleness;
    @SerializedName(SERIALIZED_NAME_LAST_NOTIFICATION)
    private OffsetDateTime lastNotification;
    @SerializedName(SERIALIZED_NAME_TEST_ID)
    private Integer testId;

    public MissingDataRule() {
    }

    public MissingDataRule id(Integer id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MissingDataRule name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MissingDataRule labels(List labels) {

        this.labels = labels;
        return this;
    }

    /**
     * Get labels
     *
     * @return labels
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List getLabels() {
        return labels;
    }

    public void setLabels(List labels) {
        this.labels = labels;
    }

    public MissingDataRule condition(String condition) {

        this.condition = condition;
        return this;
    }

    /**
     * Get condition
     *
     * @return condition
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public MissingDataRule maxStaleness(Long maxStaleness) {

        this.maxStaleness = maxStaleness;
        return this;
    }

    /**
     * Get maxStaleness
     *
     * @return maxStaleness
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Long getMaxStaleness() {
        return maxStaleness;
    }

    public void setMaxStaleness(Long maxStaleness) {
        this.maxStaleness = maxStaleness;
    }

    public MissingDataRule lastNotification(OffsetDateTime lastNotification) {

        this.lastNotification = lastNotification;
        return this;
    }

    /**
     * Get lastNotification
     *
     * @return lastNotification
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public OffsetDateTime getLastNotification() {
        return lastNotification;
    }

    public void setLastNotification(OffsetDateTime lastNotification) {
        this.lastNotification = lastNotification;
    }

    public MissingDataRule testId(Integer testId) {

        this.testId = testId;
        return this;
    }

    /**
     * Get testId
     *
     * @return testId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MissingDataRule missingDataRule = (MissingDataRule) o;
        return Objects.equals(this.id, missingDataRule.id) &&
            Objects.equals(this.name, missingDataRule.name) &&
            Objects.equals(this.labels, missingDataRule.labels) &&
            Objects.equals(this.condition, missingDataRule.condition) &&
            Objects.equals(this.maxStaleness, missingDataRule.maxStaleness) &&
            Objects.equals(this.lastNotification, missingDataRule.lastNotification) &&
            Objects.equals(this.testId, missingDataRule.testId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, labels, condition, maxStaleness, lastNotification, testId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MissingDataRule {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    maxStaleness: ").append(toIndentedString(maxStaleness)).append("\n");
        sb.append("    lastNotification: ").append(toIndentedString(lastNotification)).append("\n");
        sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
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

