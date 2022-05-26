package ownJSONCreatedFile;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PatchMethodTest {

	
    @Test
	public void patch_test() {
	
		
		JSONObject request = new JSONObject();
		
		request.put("Name","BDD");
		
		
		baseURI = "http://localhost:3000/";
		
		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.header("ContentType","Application/JSON")
		.body(request.toJSONString())
		.when()
		.patch("/Subjects/6")
		.then()
		.statusCode(200)
		.log().all();
		
		
	}
	
}
