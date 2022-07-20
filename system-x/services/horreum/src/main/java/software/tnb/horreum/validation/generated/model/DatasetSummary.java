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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * DatasetSummary
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-12T10:19:43.430893315+02:00[Europe/Rome]")
public class DatasetSummary {
    public static final String SERIALIZED_NAME_ID = "id";
    public static final String SERIALIZED_NAME_RUN_ID = "runId";
    public static final String SERIALIZED_NAME_ORDINAL = "ordinal";
    public static final String SERIALIZED_NAME_TEST_ID = "testId";
    public static final String SERIALIZED_NAME_TESTNAME = "testname";
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    public static final String SERIALIZED_NAME_START = "start";
    public static final String SERIALIZED_NAME_STOP = "stop";
    public static final String SERIALIZED_NAME_OWNER = "owner";
    public static final String SERIALIZED_NAME_ACCESS = "access";
    public static final String SERIALIZED_NAME_VIEW = "view";
    public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;
    @SerializedName(SERIALIZED_NAME_RUN_ID)
    private Integer runId;
    @SerializedName(SERIALIZED_NAME_ORDINAL)
    private Integer ordinal;
    @SerializedName(SERIALIZED_NAME_TEST_ID)
    private Integer testId;
    @SerializedName(SERIALIZED_NAME_TESTNAME)
    private String testname;
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    @SerializedName(SERIALIZED_NAME_START)
    private Long start;
    @SerializedName(SERIALIZED_NAME_STOP)
    private Long stop;
    @SerializedName(SERIALIZED_NAME_OWNER)
    private String owner;
    @SerializedName(SERIALIZED_NAME_ACCESS)
    private Access access;
    @SerializedName(SERIALIZED_NAME_VIEW)
    private List view = null;
    @SerializedName(SERIALIZED_NAME_SCHEMAS)
    private List<String> schemas = new ArrayList<String>();

    public DatasetSummary() {
    }

    public DatasetSummary id(Integer id) {

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

    public DatasetSummary runId(Integer runId) {

        this.runId = runId;
        return this;
    }

    /**
     * Get runId
     *
     * @return runId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Integer getRunId() {
        return runId;
    }

    public void setRunId(Integer runId) {
        this.runId = runId;
    }

    public DatasetSummary ordinal(Integer ordinal) {

        this.ordinal = ordinal;
        return this;
    }

    /**
     * Get ordinal
     *
     * @return ordinal
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public DatasetSummary testId(Integer testId) {

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

    public DatasetSummary testname(String testname) {

        this.testname = testname;
        return this;
    }

    /**
     * Get testname
     *
     * @return testname
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname;
    }

    public DatasetSummary description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DatasetSummary start(Long start) {

        this.start = start;
        return this;
    }

    /**
     * Get start
     *
     * @return start
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public DatasetSummary stop(Long stop) {

        this.stop = stop;
        return this;
    }

    /**
     * Get stop
     *
     * @return stop
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Long getStop() {
        return stop;
    }

    public void setStop(Long stop) {
        this.stop = stop;
    }

    public DatasetSummary owner(String owner) {

        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     *
     * @return owner
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public DatasetSummary access(Access access) {

        this.access = access;
        return this;
    }

    /**
     * Get access
     *
     * @return access
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public DatasetSummary view(List view) {

        this.view = view;
        return this;
    }

    /**
     * Get view
     *
     * @return view
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List getView() {
        return view;
    }

    public void setView(List view) {
        this.view = view;
    }

    public DatasetSummary schemas(List<String> schemas) {

        this.schemas = schemas;
        return this;
    }

    public DatasetSummary addSchemasItem(String schemasItem) {
        this.schemas.add(schemasItem);
        return this;
    }

    /**
     * Get schemas
     *
     * @return schemas
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public List<String> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<String> schemas) {
        this.schemas = schemas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatasetSummary datasetSummary = (DatasetSummary) o;
        return Objects.equals(this.id, datasetSummary.id) &&
            Objects.equals(this.runId, datasetSummary.runId) &&
            Objects.equals(this.ordinal, datasetSummary.ordinal) &&
            Objects.equals(this.testId, datasetSummary.testId) &&
            Objects.equals(this.testname, datasetSummary.testname) &&
            Objects.equals(this.description, datasetSummary.description) &&
            Objects.equals(this.start, datasetSummary.start) &&
            Objects.equals(this.stop, datasetSummary.stop) &&
            Objects.equals(this.owner, datasetSummary.owner) &&
            Objects.equals(this.access, datasetSummary.access) &&
            Objects.equals(this.view, datasetSummary.view) &&
            Objects.equals(this.schemas, datasetSummary.schemas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, runId, ordinal, testId, testname, description, start, stop, owner, access, view, schemas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatasetSummary {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
        sb.append("    testname: ").append(toIndentedString(testname)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    access: ").append(toIndentedString(access)).append("\n");
        sb.append("    view: ").append(toIndentedString(view)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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

