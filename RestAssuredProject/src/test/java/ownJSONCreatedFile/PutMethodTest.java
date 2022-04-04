package ownJSONCreatedFile;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutMethodTest {

	
	 @Test
		
		public void put_test() {
		
			
			JSONObject request = new JSONObject();
			
			request.put("Name","Devops");
			request.put("id","7");
			
			baseURI = "http://localhost:3000/";
			
			given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.header("ContentType","Application/JSON")
			.body(request.toJSONString())
			.when()
			.put("/Subjects/5")
			.then()
			.statusCode(200)
			.log().all();
			
			
		}
	
	
	
}
