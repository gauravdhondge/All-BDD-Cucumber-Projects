package utils;

import java.io.IOException;

public class ExcelUtilTest {
	
	public static void main(String[] args) throws IOException {
		
		
		String ExcelPath = "./data/TestDataForRestAssured.xlsx";
		String SheetName = "TestData";
		
		
		ExcelUtils excel = new ExcelUtils(ExcelPath,SheetName);
		
		excel.GetRowCount();
		excel.GetCellData(1, 0);
		excel.GetCellData(1, 1);

	}

}
