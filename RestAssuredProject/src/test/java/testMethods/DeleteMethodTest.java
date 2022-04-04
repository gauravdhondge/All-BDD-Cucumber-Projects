package testMethods;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteMethodTest {


	@Test
	public void test1() {
	
		given()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204);
		
	
	
	
	
}
}