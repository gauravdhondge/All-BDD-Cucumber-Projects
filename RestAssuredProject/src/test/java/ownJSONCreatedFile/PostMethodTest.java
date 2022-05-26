package ownJSONCreatedFile;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
 import static io.restassured.RestAssured.*;

public class PostMethodTest {

	@Test
	
	public void post_test() {
	
		
		JSONObject request = new JSONObject();
		
        request.put("FirstName","Madhuri");
        request.put("LastName","Dhondge");
        request.put("SubjectID",5);
        
//		request.put("id",4);
//		request.put("Name","Cucumber");
		
		
        baseURI = "http://localhost:3000/";
        
        given()
        .header("Content-Type","application/json")
        .contentType(ContentType.JSON)
        .accept(ContentType.JSON)
        .body(request.toJSONString())
        .when()
        .post("http://localhost:3000/users")
        .then()
        .statusCode(201)
        .log().all();
        
        
        
		
	}
		
	}
	
	
	
	
	
	
	
	
	

