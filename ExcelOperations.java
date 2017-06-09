package testpack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fin=new FileInputStream("D:\\SK0C69086\\TECHM\\TestData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		wb.createSheet("Selenium");
		XSSFSheet sh=wb.getSheet("Selenium");
		System.out.println("Selenium sheet created successfully...");
				
		sh.createRow(0).createCell(0).setCellValue("Pune");
		sh.getRow(0).createCell(1).setCellValue("Good");
		sh.createRow(1).createCell(0).setCellValue("Nashik");
		sh.getRow(1).createCell(1).setCellValue("Better");
		sh.createRow(2).createCell(0).setCellValue("Mumbai");
		sh.getRow(2).createCell(1).setCellValue("Best");
		
		System.out.println("Data filled in respective cells...");
		
		int rowCount=sh.getLastRowNum();
		int colCount=sh.getRow(rowCount).getLastCellNum();
		
		System.out.println("Total rows are : "+rowCount+" and total columns are : "+colCount);
		
		FileOutputStream fout=new FileOutputStream("D:\\SK0C69086\\TECHM\\TestData.xlsx");
		wb.write(fout);
		fout.close();
		
		System.out.println("Data written to file successfully... :)");
	}

}
