package testMethods;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutMethodTest {
	
	@Test
	public void test1() {
	
	JSONObject request = new JSONObject();
	
	request.put("name","jayesh");
	request.put("job","Analyst");
	
	System.out.println(request);
	System.out.println(request.toJSONString());
	
	given()
	.body(request.toJSONString())
	.when()
	.put("https://reqres.in/api/users/2")
	.then()
	.statusCode(200)
	.log().all();
	
	}

}
