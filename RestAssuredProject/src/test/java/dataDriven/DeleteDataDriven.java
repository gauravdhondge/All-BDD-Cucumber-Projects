package dataDriven;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeleteDataDriven {
	
@DataProvider(name = "DeleteData")
	
	public Object[] DataForDelete(){
		
     return new Object[] {
 
           7,8   	 

		};
		}


  @Test(dataProvider = "DeleteData")

 public void delete_test(int id) {
	
	baseURI = "http://localhost:3000/";
	
	when()
	.delete("/Subjects/" + id)
	.then()
	.statusCode(200);
	
	
}








}
