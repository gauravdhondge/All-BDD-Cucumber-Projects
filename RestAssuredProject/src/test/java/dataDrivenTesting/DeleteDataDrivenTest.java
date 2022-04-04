package dataDrivenTesting;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class DeleteDataDrivenTest extends DataForTest {
	
	@Test(dataProvider = "DeleteData")

	 public void delete_test(int id) {
		
		baseURI = "http://localhost:3000/";
		
		when()
		.delete("/Subjects/" + id)
		.then()
		.statusCode(200);
		
		
	}

}
