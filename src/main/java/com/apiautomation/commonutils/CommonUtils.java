package com.apiautomation.commonutils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class CommonUtils {


    RequestSpecBuilder requestSpecBuilder;

    public RequestSpecBuilder builder()
    {
        return requestSpecBuilder;
    }


    public void setBaseURI(String baseURI) {
        RestAssured.baseURI = baseURI;
    }


    public static RequestSpecification addBaseURIToRequestSpecification(String baseUri) {
        return new RequestSpecBuilder()
                .setBaseUri(baseUri)
                .build();
    }


    public RequestSpecification addContentTypeToRequestSpecification(String contentType) {
        return new RequestSpecBuilder()
                .setContentType(contentType)
                .build();
    }

    public RequestSpecification addMultipleHeaderToRequestSpecification(Map<String, String> headers) {
             requestSpecBuilder = new RequestSpecBuilder();

        // Add headers from the map individually
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            requestSpecBuilder.addHeader(entry.getKey(), entry.getValue());
        }
        return requestSpecBuilder.build();
    }

    public RequestSpecBuilder addSingleHeaderToRequestSpecification(String headerName, String headerValue) {

         new RequestSpecBuilder().addHeader(headerName,headerValue).build();
        return this.requestSpecBuilder;
    }




}
