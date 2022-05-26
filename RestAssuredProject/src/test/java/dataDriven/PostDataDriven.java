package dataDriven;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostDataDriven {
	
//why object- it can take any data type	
	
	
	@DataProvider(name = "DataForPost")
	
	public Object[] [] DataForPost(){
		

		
		return new Object[][] {
		
//			{ 7,"Tosca"},
//			{ 8,"Junit"}
			
			{"Mangesh","Dhondge",5},
			{"Madhuri","Dhondge",6}
					
		};
		
	}
	
	 
	
	@Test(dataProvider = "DataForPost")
	public void post_test(String FirstName,String LastName,int SubjectID) {
	
		JSONObject request = new JSONObject();
		        
//		request.put("id",id);
//		request.put("Name",Name);
		
		request.put("FirstName",FirstName);	
		request.put("LastName",LastName);
		request.put("SubjectID",SubjectID);
		
		
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
