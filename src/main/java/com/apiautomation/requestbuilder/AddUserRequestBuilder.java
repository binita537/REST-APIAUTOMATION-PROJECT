package com.apiautomation.requestbuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Setter;



public class AddUserRequestBuilder {

	private String firstName;
	private String lastName;
	private String email;
	private String password;



	public  AddUserRequestBuilder builder()
	{
		return this;
	}

	public AddUserRequestBuilder withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public AddUserRequestBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public AddUserRequestBuilder withEmail(String email) {
		this.email = email;
		return this;
	}

	public AddUserRequestBuilder withPassword(String password) {
		this.password = password;
		return this;
	}

	public AddUserRequest build()
	{
		return  new AddUserRequest(firstName,lastName,email,password);
	}

}