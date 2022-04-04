package testMethods;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class PostMethodTest {

	
	
//............to create data on server or resource.............	
	
//	@Test
//	
//	public void test1() {
//		
////......with using map.............................		
//		
//	Map<String,Object> map = new HashMap<String,Object>();
//	
//	map.put("name","jayesh");
//	map.put("job" ,"Analyst");	
//		
//		System.out.println(map);
//		
//		JSONObject request = new JSONObject(map);
//		System.out.println(request);
//		
//	}
//	
	
	
//............without using map................................	
		
	@Test
	public void test2() {
	
	JSONObject request = new JSONObject();
	
	request.put("name","jayesh");
	request.put("job","Analyst");
	
	System.out.println(request);
	System.out.println(request.toJSONString());
	
	given()
	.body(request.toJSONString())
	.when()
	.post("https://reqres.in/api/users")
	.then()
	.statusCode(201);
	
	}

	
	
}
