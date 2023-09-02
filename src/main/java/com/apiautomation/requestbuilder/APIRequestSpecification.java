package com.apiautomation.requestbuilder;

import com.apiautomation.commonutils.HttpMethod;

import java.util.Map;

public class APIRequestSpecification {


    private String endpoint;
    private HttpMethod method;
    private String contentType;
    private Map<String, String> headers;
    private Map<String, String> queryParams;
    private Map<String, String> pathParams;
    private String requestBody;

    APIRequestSpecification(String endpoint, HttpMethod method, String contentType, Map<String, String> headers, Map<String, String> queryParams, Map<String, String> pathParams, String requestBody) {
        this.endpoint = endpoint;
        this.method = method;
        this.contentType = contentType;
        this.headers = headers;
        this.queryParams = queryParams;
        this.pathParams = pathParams;
        this.requestBody = requestBody;
    }

    public static APIRequestSpecificationBuilder builder() {
        return new APIRequestSpecificationBuilder();
    }

    public static class APIRequestSpecificationBuilder {
        private String endpoint;
        private HttpMethod method;
        private String contentType;
        private Map<String, String> headers;
        private Map<String, String> queryParams;
        private Map<String, String> pathParams;
        private String requestBody;

        APIRequestSpecificationBuilder() {
        }

        public APIRequestSpecificationBuilder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public APIRequestSpecificationBuilder method(HttpMethod method) {
            this.method = method;
            return this;
        }

        public APIRequestSpecificationBuilder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        public APIRequestSpecificationBuilder headers(Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        public APIRequestSpecificationBuilder queryParams(Map<String, String> queryParams) {
            this.queryParams = queryParams;
            return this;
        }

        public APIRequestSpecificationBuilder pathParams(Map<String, String> pathParams) {
            this.pathParams = pathParams;
            return this;
        }

        public APIRequestSpecificationBuilder requestBody(String requestBody) {
            this.requestBody = requestBody;
            return this;
        }

        public APIRequestSpecification build() {
            return new APIRequestSpecification(endpoint, method, contentType, headers, queryParams, pathParams, requestBody);
        }

        public String toString() {
            return "APIRequestSpecification.APIRequestSpecificationBuilder(endpoint=" + this.endpoint + ", method=" + this.method + ", contentType=" + this.contentType + ", headers=" + this.headers + ", queryParams=" + this.queryParams + ", pathParams=" + this.pathParams + ", requestBody=" + this.requestBody + ")";
        }
    }
}
