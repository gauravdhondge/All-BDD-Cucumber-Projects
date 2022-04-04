package ownJSONCreatedFile;

import static io.restassured.RestAssured.baseURI;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class DeleteMethodTest {
	
	
	@Test
	
	public void delete_test() {
		
		baseURI = "http://localhost:3000/";
		
		when()
		.delete("/Subjects/5")
		.then()
		.statusCode(200);
		
		
	}
  }
