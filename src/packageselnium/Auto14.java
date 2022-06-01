package packageselnium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Auto14 
{
public static void main(String[] args) throws IOException
{
	String path="C:\\Users\\USER\\Desktop\\ANAGHA\\selenium.xlsx";
	FileInputStream file=new FileInputStream(path);
	XSSFWorkbook workbook= new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("ana");
	XSSFRow row=sheet.getRow(0);
	XSSFCell Cell=row.getCell(0);
//    String value=Cell.getStringCellValue();
//	System.out.println(value);
	String value;
	int rowcount=sheet.getLastRowNum();
	System.out.println(rowcount);
	int colcount =sheet.getRow(0).getLastCellNum();
	System.out.println(colcount);
	for(int r=0;r<=rowcount;r++)
	{
		for(int c=0;c<colcount;c++)
		{
			 value=Cell.getStringCellValue();
			
		}
		System.out.println(value);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	int rowcount=sheet.getLastRowNum();//returns row count
//	System.out.println(rowcount);
//	int colcount =sheet.getRow(0).getLastCellNum();
//	System.out.println(colcount);
//	for(int i=0;i<=rowcount;i++)
//	{
//		XSSFRow CurrentRow=sheet.getRow(i);
//		for(int j=0;j<colcount;j++)
//		{
//			String value=CurrentRow.getCell(j).toString();
//			System.out.print("   "+value);
//		}
//		System.out.println();
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
