package testMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetMethodTest {

//	@Test
//	public void test1() {
//
//		Response response = get("https://reqres.in/api/users?page=2");
//
//		System.out.println(response.asString());
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getStatusLine());
//		System.out.println(response.getBody().asString());
//		System.out.println(response.getTime());
//		System.out.println(response.getHeader("content-type"));
//		
//		int statuscode = response.getStatusCode();
//		Assert.assertEquals(statuscode,200);
//
//	}

//	@Test
//	public void test2() {
//	
//		
//		given()
//		.get("https://reqres.in/api/users?page=2")
//		.then()
//		.statusCode(200) 
//		.body("data.id[0]", equalTo(7));
//	
//	}

	@Test

	public void test3() {

		given().get("https://reqres.in/api/users?page=2").then().statusCode(200)
//	.log().all();...........to get all the data 
				.body("data.first_name", hasItems("Michael", "Tobias", "Lindsay"));

	}

}
