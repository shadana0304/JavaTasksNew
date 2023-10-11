package org.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
           public static void main(String[] args) throws FileNotFoundException, IOException {
        	   
        	   //Excel workbook creation
			XSSFWorkbook book = new XSSFWorkbook();
			
			//Sheet creation 
			XSSFSheet sheet = book.createSheet("Sheet1");
			
			//write the data to the sheet
			Object [][] data= {
					{"Name","Age","Email"},
					{"John Doe",30,"john@test.com"},
					{"Jane Doe",28,"john@test.com"},
					{"Bom Smith",32,"jacky@example.com"},
					{"Swapnil",37,"joe@example.com"}
			};
			int rowcount=0;
			for(Object[] row1 : data) {
				XSSFRow row =sheet.createRow(rowcount++);
				int columncount=0;
				for(Object column:row1) {
					XSSFCell cell =row.createCell(columncount++);
					if(column instanceof String ) {
						cell.setCellValue((String)column);
					}else if(column instanceof Integer) {
						cell.setCellValue((Integer)column);
					}
				}
			}
			try(FileOutputStream output=new FileOutputStream("FirstFile.xlsx")){
				book.write(output);
			}
			
		}
}
