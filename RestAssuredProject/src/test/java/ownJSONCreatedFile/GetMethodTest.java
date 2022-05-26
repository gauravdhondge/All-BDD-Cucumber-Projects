package ownJSONCreatedFile;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetMethodTest {


//...... to get all information from resource or server................
	
	@Test
	public void get_test1() {

		baseURI = "http://localhost:3000/";

		given()
		.get("/Subjects")
		.then()
		.statusCode(200)
		.log().all();
	
	}
	
	
	
//...... to get specific information from resource or server..................	
//	
//	@Test
//	public void get_test() {
//
//		baseURI = "http://localhost:3000/";
//
//		given()
//		.param("Name", "Automation")
//		.get("/users")
//		.then()
//		.statusCode(200)
//		.log().all();

//	}

	
	
}
