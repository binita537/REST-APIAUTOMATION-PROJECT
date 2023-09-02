package com.apiautomation.responsebuilder;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonPropertyOrder({ "user", "token" })
public class AddUserResponse {

	@JsonProperty("user")
	private User user;



	@JsonProperty("token")
	private String token;


	public AddUserResponse() {
	}

	public AddUserResponse(User user, String token) {
		this.user = user;
		this.token = token;
	}

	// Getters and setters

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "UserResponse{" +
				"user=" + user +
				", token='" + token + '\'' +
				'}';
	}
}
