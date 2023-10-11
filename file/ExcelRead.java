package org.file;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[] args) throws IOException {
	XSSFWorkbook book =new XSSFWorkbook("C:\\Users\\X240\\eclipse-workspace\\SeleniumLearning\\FirstFile.xlsx");
	XSSFSheet sheet = book.getSheet("Sheet1");
	
	//row count
	int rowcount = sheet.getLastRowNum();
	
	//column count
	int columncount = sheet.getRow(0).getLastCellNum();
	
	String [][] data=new String[rowcount][columncount];
	//get into row
	for(int i=1;i<=rowcount; i++) {
		XSSFRow row =sheet.getRow(i);
		
   //get into cell
	for(int j=0;j<columncount; j++) {
		XSSFCell cell = row.getCell(j);
		
	//read data from cell		
		System.out.println(cell.getStringCellValue());
		cell.getStringCellValue();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
