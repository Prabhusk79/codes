package excel_readwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class RW {
    // we need add 3 jars from mvnrepository.com->apache poi-> 1st 3 link
	   // 1.apache poi 2.poi.ooxml 3.poi.ooxml.schemas
	
	
	@Test
	public void m1() throws IOException
	{
		File f=new File("/Users/varun/Desktop/example file.ods");
		FileInputStream fis=new FileInputStream(f);
		@SuppressWarnings("resource")
		XSSFWorkbook x=new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheetAt(0);
		
		// read no of rows
		int row=sheet.getLastRowNum();
		System.out.println("No of rows is:"+row);
		
		int col=sheet.getRow(1).getLastCellNum();
		System.out.println("No of coloumns is:"+col);
	}
}

