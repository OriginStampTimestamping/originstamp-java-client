/*
 * OriginStamp Client
 *
 * OpenAPI spec version: 3.0
 * OriginStamp Documentation: https://docs.originstamp.com
 * Contact: mail@originstamp.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
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


import com.originstamp.model.DefaultOfTimestampData;
import com.originstamp.model.DefaultOfTimestampResponse;
import com.originstamp.model.TimestampBulkRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BulkApi {
    private ApiClient apiClient;

    public BulkApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BulkApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createBulkTimestamp
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param timestampBulkRequest DTO for the bulk hash submission. Add all relevant information concerning your hash submissions. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createBulkTimestampCall(String authorization, TimestampBulkRequest timestampBulkRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = timestampBulkRequest;

        // create path and map variables
        String localVarPath = "/v4/timestamp/bulk/create";

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

        String[] localVarAuthNames = new String[] { "API Key Authorization" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createBulkTimestampValidateBeforeCall(String authorization, TimestampBulkRequest timestampBulkRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling createBulkTimestamp(Async)");
        }
        
        // verify the required parameter 'timestampBulkRequest' is set
        if (timestampBulkRequest == null) {
            throw new ApiException("Missing the required parameter 'timestampBulkRequest' when calling createBulkTimestamp(Async)");
        }
        

        com.squareup.okhttp.Call call = createBulkTimestampCall(authorization, timestampBulkRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Bulk Submission
     * With this interface you can submit multiple hashes at once. If your API key is valid, your hashes are added to seeds and scheduled for timestamping. You are also able to submit additional information with every hash, such as a comment or notification target. If the hash already exists, the &#39;created&#39; field in the response is set to &#39;false&#39; and the notification(s) of the corresponding hash will be ignored. To later query the status of any hash for a certain blockchain you can use the &#39;seed_id&#39; field of its inner timestamp structure. This field can be used to query the timestamping status of the selected seed. This is recommended if a large number of hashes were transmitted in a certain time frame. Once a hash is successfully created for a certain crypto currency, we can notify your desired target with the timestamp information (via POST Request). A webhook for a submitted hash is triggered as soon as the tamper-proof timestamp with the selected crypto currency has been created. 
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param timestampBulkRequest DTO for the bulk hash submission. Add all relevant information concerning your hash submissions. (required)
     * @return List&lt;DefaultOfTimestampResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<DefaultOfTimestampResponse> createBulkTimestamp(String authorization, TimestampBulkRequest timestampBulkRequest) throws ApiException {
        ApiResponse<List<DefaultOfTimestampResponse>> resp = createBulkTimestampWithHttpInfo(authorization, timestampBulkRequest);
        return resp.getData();
    }

    /**
     * Bulk Submission
     * With this interface you can submit multiple hashes at once. If your API key is valid, your hashes are added to seeds and scheduled for timestamping. You are also able to submit additional information with every hash, such as a comment or notification target. If the hash already exists, the &#39;created&#39; field in the response is set to &#39;false&#39; and the notification(s) of the corresponding hash will be ignored. To later query the status of any hash for a certain blockchain you can use the &#39;seed_id&#39; field of its inner timestamp structure. This field can be used to query the timestamping status of the selected seed. This is recommended if a large number of hashes were transmitted in a certain time frame. Once a hash is successfully created for a certain crypto currency, we can notify your desired target with the timestamp information (via POST Request). A webhook for a submitted hash is triggered as soon as the tamper-proof timestamp with the selected crypto currency has been created. 
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param timestampBulkRequest DTO for the bulk hash submission. Add all relevant information concerning your hash submissions. (required)
     * @return ApiResponse&lt;List&lt;DefaultOfTimestampResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<DefaultOfTimestampResponse>> createBulkTimestampWithHttpInfo(String authorization, TimestampBulkRequest timestampBulkRequest) throws ApiException {
        com.squareup.okhttp.Call call = createBulkTimestampValidateBeforeCall(authorization, timestampBulkRequest, null, null);
        Type localVarReturnType = new TypeToken<List<DefaultOfTimestampResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Bulk Submission (asynchronously)
     * With this interface you can submit multiple hashes at once. If your API key is valid, your hashes are added to seeds and scheduled for timestamping. You are also able to submit additional information with every hash, such as a comment or notification target. If the hash already exists, the &#39;created&#39; field in the response is set to &#39;false&#39; and the notification(s) of the corresponding hash will be ignored. To later query the status of any hash for a certain blockchain you can use the &#39;seed_id&#39; field of its inner timestamp structure. This field can be used to query the timestamping status of the selected seed. This is recommended if a large number of hashes were transmitted in a certain time frame. Once a hash is successfully created for a certain crypto currency, we can notify your desired target with the timestamp information (via POST Request). A webhook for a submitted hash is triggered as soon as the tamper-proof timestamp with the selected crypto currency has been created. 
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param timestampBulkRequest DTO for the bulk hash submission. Add all relevant information concerning your hash submissions. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createBulkTimestampAsync(String authorization, TimestampBulkRequest timestampBulkRequest, final ApiCallback<List<DefaultOfTimestampResponse>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createBulkTimestampValidateBeforeCall(authorization, timestampBulkRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<DefaultOfTimestampResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSeedStatus
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param seedId ID of the timestamp seed (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSeedStatusCall(String authorization, String seedId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v4/timestamp/status/seed/{seed_id}"
            .replaceAll("\\{" + "seed_id" + "\\}", apiClient.escapeString(seedId.toString()));

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

        String[] localVarAuthNames = new String[] { "API Key Authorization" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSeedStatusValidateBeforeCall(String authorization, String seedId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getSeedStatus(Async)");
        }
        
        // verify the required parameter 'seedId' is set
        if (seedId == null) {
            throw new ApiException("Missing the required parameter 'seedId' when calling getSeedStatus(Async)");
        }
        

        com.squareup.okhttp.Call call = getSeedStatusCall(authorization, seedId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Seed Status
     * With this interface you can request the status for a certain seed. This is used when checking the status of previously submitted hashes and avoids sending individual status requests for each hash.
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param seedId ID of the timestamp seed (required)
     * @return DefaultOfTimestampData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DefaultOfTimestampData getSeedStatus(String authorization, String seedId) throws ApiException {
        ApiResponse<DefaultOfTimestampData> resp = getSeedStatusWithHttpInfo(authorization, seedId);
        return resp.getData();
    }

    /**
     * Seed Status
     * With this interface you can request the status for a certain seed. This is used when checking the status of previously submitted hashes and avoids sending individual status requests for each hash.
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param seedId ID of the timestamp seed (required)
     * @return ApiResponse&lt;DefaultOfTimestampData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DefaultOfTimestampData> getSeedStatusWithHttpInfo(String authorization, String seedId) throws ApiException {
        com.squareup.okhttp.Call call = getSeedStatusValidateBeforeCall(authorization, seedId, null, null);
        Type localVarReturnType = new TypeToken<DefaultOfTimestampData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Seed Status (asynchronously)
     * With this interface you can request the status for a certain seed. This is used when checking the status of previously submitted hashes and avoids sending individual status requests for each hash.
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param seedId ID of the timestamp seed (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSeedStatusAsync(String authorization, String seedId, final ApiCallback<DefaultOfTimestampData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSeedStatusValidateBeforeCall(authorization, seedId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DefaultOfTimestampData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
