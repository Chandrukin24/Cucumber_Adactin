package com.RestAPI;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test_RestAPI {
	/*
	 * @Test(enabled = false)
	 * 
	 * public void restAssured() { RestAssured.baseURI = "https://reqres.in/";
	 * RequestSpecification requestSpecification = RestAssured.given(); Response
	 * response = requestSpecification.request(Method.GET, "/api/users?page=2");
	 * System.out.println(response.getStatusLine());
	 * System.out.println(response.prettyPrint());
	 * 
	 * }
	 */

	@Test
	public void createAPI() {
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification requestSpecification = RestAssured.given().header("Content-Type", "application/json")
				.body("{\r\n" + "            \"id\": 11,\r\n"
						+ "            \"email\": \"george.edwards@reqres.in\",\r\n"
						+ "            \"first_name\": \"George\",\r\n" + "            \"last_name\": \"Edwards\",\r\n"
						+ "            \"avatar\": \"https://reqres.in/img/faces/11-image.jpg\"\r\n" + "        },");
		Response response = requestSpecification.request(Method.POST, "/api/users?page=2");
		System.out.println(response.prettyPrint());
		System.out.println(response.getStatusLine());
	}
}
