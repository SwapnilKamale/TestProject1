package testpack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;

public class Excel1 {
	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("D:\\SK0C69086\\TECHM\\TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fin);
		wb.createSheet("Selenium1");
		
		Sheet sh=wb.getSheet("Selenium1");
		
		sh.createRow(0).createCell(0).setCellValue("Pune");
		sh.getRow(0).createCell(1).setCellValue("Nashik");

		int rowCount=sh.getLastRowNum();
		System.out.println("Row count : "+(rowCount+1));
		
		int cellCount=sh.getRow(rowCount).getLastCellNum();
		System.out.println("Last column : "+cellCount);
		
		FileOutputStream fout=new FileOutputStream("D:\\SK0C69086\\TECHM\\TestData.xlsx");
		wb.write(fout);
		fout.close();
		
		System.out.println("Data written successfully... :)");
		
	}

}
