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

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * LabelInVariable
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-12T10:19:43.430893315+02:00[Europe/Rome]")
public class LabelInVariable {
    public static final String SERIALIZED_NAME_TYPE = "type";
    public static final String SERIALIZED_NAME_TEST_ID = "testId";
    public static final String SERIALIZED_NAME_TEST_NAME = "testName";
    public static final String SERIALIZED_NAME_VARIABLE_ID = "variableId";
    public static final String SERIALIZED_NAME_VARIABLE_NAME = "variableName";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;
    @SerializedName(SERIALIZED_NAME_TEST_ID)
    private Integer testId;
    @SerializedName(SERIALIZED_NAME_TEST_NAME)
    private String testName;
    @SerializedName(SERIALIZED_NAME_VARIABLE_ID)
    private Integer variableId;
    @SerializedName(SERIALIZED_NAME_VARIABLE_NAME)
    private String variableName;

    public LabelInVariable() {
    }

    public LabelInVariable type(String type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LabelInVariable testId(Integer testId) {

        this.testId = testId;
        return this;
    }

    /**
     * Get testId
     *
     * @return testId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public LabelInVariable testName(String testName) {

        this.testName = testName;
        return this;
    }

    /**
     * Get testName
     *
     * @return testName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public LabelInVariable variableId(Integer variableId) {

        this.variableId = variableId;
        return this;
    }

    /**
     * Get variableId
     *
     * @return variableId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getVariableId() {
        return variableId;
    }

    public void setVariableId(Integer variableId) {
        this.variableId = variableId;
    }

    public LabelInVariable variableName(String variableName) {

        this.variableName = variableName;
        return this;
    }

    /**
     * Get variableName
     *
     * @return variableName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelInVariable labelInVariable = (LabelInVariable) o;
        return Objects.equals(this.type, labelInVariable.type) &&
            Objects.equals(this.testId, labelInVariable.testId) &&
            Objects.equals(this.testName, labelInVariable.testName) &&
            Objects.equals(this.variableId, labelInVariable.variableId) &&
            Objects.equals(this.variableName, labelInVariable.variableName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, testId, testName, variableId, variableName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelInVariable {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
        sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
        sb.append("    variableId: ").append(toIndentedString(variableId)).append("\n");
        sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
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

