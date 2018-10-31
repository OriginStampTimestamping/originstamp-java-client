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


package com.originstamp.api;

import com.originstamp.api.client.ApiCallback;
import com.originstamp.api.client.ApiClient;
import com.originstamp.api.client.ApiException;
import com.originstamp.api.client.ApiResponse;
import com.originstamp.api.client.Configuration;
import com.originstamp.api.client.Pair;
import com.originstamp.api.client.ProgressRequestBody;
import com.originstamp.api.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.originstamp.model.DefaultSchedulerResponse;
import com.originstamp.model.SchedulerRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchedulerApi {
    private ApiClient apiClient;

    public SchedulerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SchedulerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getNextSchedulingTime
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param schedulerRequest Request DTO for next schedules. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNextSchedulingTimeCall(String authorization, SchedulerRequest schedulerRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = schedulerRequest;

        // create path and map variables
        String localVarPath = "/v3/submission/times";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getNextSchedulingTimeValidateBeforeCall(String authorization, SchedulerRequest schedulerRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getNextSchedulingTime(Async)");
        }
        
        // verify the required parameter 'schedulerRequest' is set
        if (schedulerRequest == null) {
            throw new ApiException("Missing the required parameter 'schedulerRequest' when calling getNextSchedulingTime(Async)");
        }
        

        com.squareup.okhttp.Call call = getNextSchedulingTimeCall(authorization, schedulerRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * NextSchedule
     * Get the next scheduling time for hash submissions to the blockchain.
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param schedulerRequest Request DTO for next schedules. (required)
     * @return DefaultSchedulerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DefaultSchedulerResponse getNextSchedulingTime(String authorization, SchedulerRequest schedulerRequest) throws ApiException {
        ApiResponse<DefaultSchedulerResponse> resp = getNextSchedulingTimeWithHttpInfo(authorization, schedulerRequest);
        return resp.getData();
    }

    /**
     * NextSchedule
     * Get the next scheduling time for hash submissions to the blockchain.
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param schedulerRequest Request DTO for next schedules. (required)
     * @return ApiResponse&lt;DefaultSchedulerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DefaultSchedulerResponse> getNextSchedulingTimeWithHttpInfo(String authorization, SchedulerRequest schedulerRequest) throws ApiException {
        com.squareup.okhttp.Call call = getNextSchedulingTimeValidateBeforeCall(authorization, schedulerRequest, null, null);
        Type localVarReturnType = new TypeToken<DefaultSchedulerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * NextSchedule (asynchronously)
     * Get the next scheduling time for hash submissions to the blockchain.
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param schedulerRequest Request DTO for next schedules. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNextSchedulingTimeAsync(String authorization, SchedulerRequest schedulerRequest, final ApiCallback<DefaultSchedulerResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNextSchedulingTimeValidateBeforeCall(authorization, schedulerRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DefaultSchedulerResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
