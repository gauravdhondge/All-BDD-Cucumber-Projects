package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
 static	XSSFWorkbook workbook;
 static XSSFSheet sheet;
	
	
 public  ExcelUtils(String ExcelPath,String SheetName) throws IOException {
	 
	 
	   workbook = new XSSFWorkbook(ExcelPath);
	   sheet = workbook.getSheet(SheetName);
	 
 }
		
	
	
	public static void GetCellData(int RowNumber,int ColumnNumber) throws IOException {
		
	   DataFormatter formatter = new DataFormatter();
	   Object value = formatter.formatCellValue(sheet.getRow(RowNumber).getCell(ColumnNumber));
	   System.out.println(value);
		
		}
	
	
	public static void GetRowCount() throws IOException {
		
		
	int RowCount = sheet.getPhysicalNumberOfRows();
	System.out.println("No.of Rows:"+ RowCount);
		
    }
	
	}
