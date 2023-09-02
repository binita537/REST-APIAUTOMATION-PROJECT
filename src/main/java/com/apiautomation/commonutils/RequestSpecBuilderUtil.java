package com.apiautomation.commonutils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class RequestSpecBuilderUtil {
    private RequestSpecBuilder requestSpecBuilder;

    public RequestSpecBuilderUtil() {
        this.requestSpecBuilder = new RequestSpecBuilder();
    }

    public RequestSpecBuilderUtil withBaseUri(String baseUri) {
        requestSpecBuilder.setBaseUri(baseUri);
        return this;
    }

    public RequestSpecBuilderUtil withContentType(String contentType) {
        requestSpecBuilder.setContentType(contentType);
        return this;
    }

    public RequestSpecBuilderUtil withHeader(String headerName, String headerValue) {
        requestSpecBuilder.addHeader(headerName, headerValue);
        return this;
    }

    public RequestSpecBuilderUtil withHeaders(Map<String, String> headers) {
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            requestSpecBuilder.addHeader(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public RequestSpecification build() {
        return requestSpecBuilder.build();
    }
}