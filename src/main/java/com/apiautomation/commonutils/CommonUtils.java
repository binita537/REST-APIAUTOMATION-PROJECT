package com.apiautomation.commonutils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class CommonUtils {


    private RequestSpecification baseSpecification = given().log().all();
    RequestSpecBuilder specBuilder;

    public void setBaseURI(String baseURI) {
        RestAssured.baseURI = baseURI;
    }


    public RequestSpecification buildRequestSpecificationWithContentType(String contentType) {
        RequestSpecification spec = baseSpecification;
        spec.contentType(contentType);
        return spec;
    }

    public RequestSpecification buildRequestSpecificationWithMultipleHeaders(
            List<Map<String, String>> headers) {
        specBuilder = new RequestSpecBuilder();

        if (headers != null && !headers.isEmpty()) {
            for (Map<String, String> header : headers) {
                specBuilder.addHeaders(header);
            }
        }

        return specBuilder.build();
    }

    public RequestSpecification buildRequestSpecificationWithoutBody(String contentType,
                                                                     Map<String, String> headers,
                                                                     Map<String, String> queryParams,
                                                                     Map<String, String> pathParams) {
        RequestSpecification spec = baseSpecification;

        spec.contentType(contentType).headers(headers).queryParams(queryParams).pathParams(pathParams);


        return spec;
    }

    public RequestSpecification buildRequestSpecificationForWithBody(String contentType,
                                                                     Map<String, String> headers,
                                                                     Map<String, String> queryParams,
                                                                     Map<String, String> pathParams,
                                                                     Object body) {
        RequestSpecification spec = baseSpecification;

        spec.contentType(contentType).headers(headers).queryParams(queryParams).pathParams(pathParams).body(body);


        return spec;
    }

    public Response callRequest(HttpMethod httpMethod, RequestSpecification requestSpecification, String resources) {
        Response response = null;

        switch (httpMethod) {
            case GET:
                response = requestSpecification.get(resources);
                break;
            case POST:
                response = requestSpecification.post(resources);
                break;
            case PUT:
                response = requestSpecification.put(resources);
                break;
            case DELETE:
                response = requestSpecification.delete(resources);
                break;
            // Add more cases for other HTTP methods if needed
        }

        return response;
    }


}
