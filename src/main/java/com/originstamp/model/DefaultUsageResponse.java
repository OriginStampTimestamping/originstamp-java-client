/*
 * OriginStamp Documentation
 * <br/>The following documentation describes the API v3 for OriginStamp. With this documentation you are able to try out the different requests and see the responses. For the authorization, add your API key to the Authorization header of your request.<br/><h2>Invoice</h2><p>The invoice is based on your individual usage. The following table illustrates the request types, that are billed in credits.</p><table><tr><th>Request Type</th><th>Condition</th><th>Credits</th><tr><td style='border-bottom-style:solid; border-color: #c0c0c0;'></td><tr><th>Submission</th><th>create timestamp</th><th>1 Credit</th><tr><th>Submission</th><th>timestamp already exists</th><th>0.3 Credits</th><tr><th>Status</th><th>no timestamp information available</th><th>0.1 Credit</th><tr><th>Status</th><th>timestamp information</th><th>0.3 Credits</th><tr><th>Proof</th><th>no proof available</th><th>0.1 Credits</th><tr><th>Proof</th><th>merkle tree as proof</th><th>3 Credits</th><tr><th>Proof</th><th>seed as proof</th><th>3 Credits</th><tr><th>Proof</th><th>PDF Certificate</th><th>5 Credits</th><tr><th>Notification</th><th>webhook notification</th><th>1.5 Credits</th><tr><th>Notification</th><th>mail notification</th><th>5 Credits</th><tr><th>Notification</th><th>trigger webhook</th><th>5 0.3</th></table><br/><h2>Common Problems</h2><ul><li>Make sure you set the Authorization with your API key</li><li>If a cloudflare error occurs, please set a custom UserAgent header.</li><li>Please have a look at the models below to find out what each field means.</li></ul>
 *
 * OpenAPI spec version: 3.0
 * Contact: mail@originstamp.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.originstamp.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.originstamp.model.UsageResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The default service response object uses error code and message to indicate errors. These errors are handled by the client.
 */
@ApiModel(description = "The default service response object uses error code and message to indicate errors. These errors are handled by the client.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T09:39:46.494+01:00")
public class DefaultUsageResponse {
  @SerializedName("data")
  private UsageResponse data = null;

  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("error_message")
  private String errorMessage = null;

  public DefaultUsageResponse data(UsageResponse data) {
    this.data = data;
    return this;
  }

   /**
   * Generic response object which contains the response data, e.g. timestamp information.
   * @return data
  **/
  @ApiModelProperty(required = true, value = "Generic response object which contains the response data, e.g. timestamp information.")
  public UsageResponse getData() {
    return data;
  }

  public void setData(UsageResponse data) {
    this.data = data;
  }

  public DefaultUsageResponse errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Contains the error of the request. If the error code is 0, everything is fine.
   * @return errorCode
  **/
  @ApiModelProperty(required = true, value = "Contains the error of the request. If the error code is 0, everything is fine.")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public DefaultUsageResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Contains the error message, that possibly occurred. If it is empty, everything is fine.
   * @return errorMessage
  **/
  @ApiModelProperty(required = true, value = "Contains the error message, that possibly occurred. If it is empty, everything is fine.")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultUsageResponse defaultUsageResponse = (DefaultUsageResponse) o;
    return Objects.equals(this.data, defaultUsageResponse.data) &&
        Objects.equals(this.errorCode, defaultUsageResponse.errorCode) &&
        Objects.equals(this.errorMessage, defaultUsageResponse.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errorCode, errorMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultUsageResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

