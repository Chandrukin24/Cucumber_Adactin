package com.RestAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Request {
	public static void main(String[] args) {

		RestAssured.baseURI = "http://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("/api/users/2");
		String asString = response.asString();
		System.out.println(asString);
	}
}
