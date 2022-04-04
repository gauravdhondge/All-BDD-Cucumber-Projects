package ownJSONCreatedFile;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetMethodTest {

	@Test
	public void get_test() {

		baseURI = "http://localhost:3000/";

		given()
		.param("Name", "Automation")
		.get("/users")
		.then()
		.statusCode(200)
		.log().all();

	}

}
