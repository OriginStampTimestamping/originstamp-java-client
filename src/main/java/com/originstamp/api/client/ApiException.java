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


package com.originstamp.api.client;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T09:39:46.494+01:00")
public class ApiException extends Exception {
    private int code = 0;
    private Map<String, List<String>> responseHeaders = null;
    private String responseBody = null;

    public ApiException() {}

    public ApiException(Throwable throwable) {
        super(throwable);
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        super(message, throwable);
        this.code = code;
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    public ApiException(String message, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        this(message, (Throwable) null, code, responseHeaders, responseBody);
    }

    public ApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders) {
        this(message, throwable, code, responseHeaders, null);
    }

    public ApiException(int code, Map<String, List<String>> responseHeaders, String responseBody) {
        this((String) null, (Throwable) null, code, responseHeaders, responseBody);
    }

    public ApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ApiException(int code, String message, Map<String, List<String>> responseHeaders, String responseBody) {
        this(code, message);
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    /**
     * Get the HTTP status code.
     *
     * @return HTTP status code
     */
    public int getCode() {
        return code;
    }

    /**
     * Get the HTTP response headers.
     *
     * @return A map of list of string
     */
    public Map<String, List<String>> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Get the HTTP response body.
     *
     * @return Response body in the form of string
     */
    public String getResponseBody() {
        return responseBody;
    }
}
