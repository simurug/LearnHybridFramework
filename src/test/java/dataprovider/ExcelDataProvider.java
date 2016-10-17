package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	
	public ExcelDataProvider()  
	{
		File src=new File("C:\\Users\\mssiv\\workspace\\HybridFramework\\applicationdataprovider\\AppData.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			
				wb = new  XSSFWorkbook(fis);
			
		} catch (Exception e) {
		
			 System.out.println(e.getMessage());
		} 
		
		
	}
	
	public String getdata(int index,int row,int  column)
	
	{
		String  data=wb.getSheetAt(index).getRow(row).getCell(column).getStringCellValue();
		return data;
		 
	}
	
	public String getdata(String index,int row,int  column)
	
	{
		String  data=wb.getSheet(index).getRow(row).getCell(column).getStringCellValue();
		return data;
		 
	}

}
