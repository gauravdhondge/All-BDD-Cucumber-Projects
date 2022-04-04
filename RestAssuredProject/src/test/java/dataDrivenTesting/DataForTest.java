package dataDrivenTesting;

import org.testng.annotations.DataProvider;

public class DataForTest {

	@DataProvider(name = "DataForPost")

	public Object[][] DataForPost() {

		return new Object[][] {

				{ 7, "Tosca" }, { 8, "Junit" }

		};

	}
	
	

	@DataProvider(name = "DeleteData")

	public Object[] DataForDelete() {

		return new Object[] {

				7, 8

		};
	}

}
