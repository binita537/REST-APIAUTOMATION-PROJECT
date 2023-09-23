package com.apiautomation.stepdefinitions;

import com.apiautomation.commonutils.RequestSpecBuilderUtil;
import com.apiautomation.requestbuilder.AddUserRequest;
import com.apiautomation.requestbuilder.AddUserRequestBuilder;
import com.apiautomation.responsebuilder.AddUserResponse;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;


@Slf4j
public class UserStepDefinition {


    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;
    Response response;
    AddUserResponse userResponseAsClass;

    AddUserRequest userRequest;

    @Given("the user has a new book")
    public void the_user_has_a_new_book(DataTable userDataTable) {

        log.info("#Prepraing the adduser payload with data-------");
        // Convert the DataTable into a List of Maps
        List<Map<String, String>> userData = userDataTable.asMaps(String.class, String.class);


        Map<String, String> user = userData.get(0);
        log.info("#Creating payload with this Data-------" + user);
        //log.info("#Request: "+user.toString().replaceAll("\\s+", ""));
        userRequest = new AddUserRequestBuilder().builder().
                withFirstName(user.get("firstname")).
                withLastName(user.get("lastname")).
                withEmail(user.get("email")).
                withPassword(user.get("password")).build();


    }


    @When("the user calls the AddUser request")
    public void the_user_call_add_ap_i_request() {

        log.info("#Building request Specification with base Uri and content type -------");
        RequestSpecification requestSpec = new RequestSpecBuilderUtil()
                .withBaseUri("https://thinking-tester-contact-list.herokuapp.com")
                .withContentType(String.valueOf(ContentType.JSON))
                .build();
        response= given().spec(requestSpec).body(userRequest).when().post("/users");

        log.info("#Response: " + response.asString().replaceAll("\\s+", ""));

    }



    @Then("the user should be added successfully")
    public void the_user_should_be_added_successfully() {

        userResponseAsClass = response.as(AddUserResponse.class);
        Assert.assertEquals(response.getStatusCode(), 201);
        if (response.getStatusCode() == 201) {
            log.info(response.getStatusCode()+": User is added successfully");
        } else {
            log.error(response.getStatusCode()+": User is not added successfully");
        }

        String userId = userResponseAsClass.getUser().get_id();
        String tokenId = userResponseAsClass.getToken();
        log.info("User id is :"+userId +"and \n"+"Token is "+tokenId);

    }

}
