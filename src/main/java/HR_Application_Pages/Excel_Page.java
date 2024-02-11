package HR_Application_Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Page extends Driver_Page{

	 public static void ExcelHandling() throws IOException 
	 {
			String filePath = "C:\\Users\\HP\\Downloads\\addEmployeeFormat.xlsx";
			FileInputStream fileInputStream = new FileInputStream(new File(filePath));
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet=workbook.getSheet("sheet1");
			int noOfRows=sheet.getPhysicalNumberOfRows();		
			int noOfCols=sheet.getRow(0).getLastCellNum();
						String[][] data = {
								{"BT001", "Rajesh", "rajesh@yopmail.com","7676789054","Hyderabad","Male","500000","","Senior Manager operation-ocean freight","10/13/1995","28","12/27/2023","Self"},
								{"BT001", "Dep01", "","3456782190","Hyderabad","Female","","","","23/05/1999","25","","Spouse"},
								
						};
						int rowIndex = 1;
						for (String[] rowData : data) {
							XSSFRow row = sheet.createRow(rowIndex++);
							int cellIndex = 0;
							for (String cellData : rowData) {
								XSSFCell cell = row.createCell(cellIndex++);
								cell.setCellValue(cellData);
							}
						}
						FileOutputStream outputStream = new FileOutputStream(filePath);
						
						workbook.write(outputStream);
						outputStream.flush();
						
			
		}
		
		

	}