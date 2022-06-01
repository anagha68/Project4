package packageselnium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Auto15
{
public static void main(String[] args) throws IOException
{
	FileInputStream file=new FileInputStream("C:\\Users\\USER\\Desktop\\ANAGHA\\selenium.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet Sheet=workbook.getSheet("ana");
	int rowcount=Sheet.getLastRowNum();
	int colcount=Sheet.getRow(1).getLastCellNum();
	System.out.println("Total no.of row= "+rowcount );
	System.out.println("Total no.of column= "+colcount);
	for(int i=0;i<=rowcount;i++)
	{
		XSSFRow CurrentRow=Sheet.getRow(i);
		for(int j=0;j<colcount;j++)
		{
			String Value=CurrentRow.getCell(j).toString();
			System.out.print("  "+ Value);
		}
		System.out.println();
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
