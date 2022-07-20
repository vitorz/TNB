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
 * UserData
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-12T10:19:43.430893315+02:00[Europe/Rome]")
public class UserData {
    public static final String SERIALIZED_NAME_ID = "id";
    public static final String SERIALIZED_NAME_USERNAME = "username";
    public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
    public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
    public static final String SERIALIZED_NAME_EMAIL = "email";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;
    @SerializedName(SERIALIZED_NAME_USERNAME)
    private String username;
    @SerializedName(SERIALIZED_NAME_FIRST_NAME)
    private String firstName;
    @SerializedName(SERIALIZED_NAME_LAST_NAME)
    private String lastName;
    @SerializedName(SERIALIZED_NAME_EMAIL)
    private String email;

    public UserData() {
    }

    public UserData id(String id) {

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserData username(String username) {

        this.username = username;
        return this;
    }

    /**
     * Get username
     *
     * @return username
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserData firstName(String firstName) {

        this.firstName = firstName;
        return this;
    }

    /**
     * Get firstName
     *
     * @return firstName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UserData lastName(String lastName) {

        this.lastName = lastName;
        return this;
    }

    /**
     * Get lastName
     *
     * @return lastName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserData email(String email) {

        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserData userData = (UserData) o;
        return Objects.equals(this.id, userData.id) &&
            Objects.equals(this.username, userData.username) &&
            Objects.equals(this.firstName, userData.firstName) &&
            Objects.equals(this.lastName, userData.lastName) &&
            Objects.equals(this.email, userData.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, firstName, lastName, email);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

