package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Generic_Excel implements Auto_const
{ 
	String v = "";
	public  String getcellvalue(String Sheet, int row, int cell)
	{	
	try{
FileInputStream fis = new FileInputStream(Excel_path);

Workbook wb = WorkbookFactory.create(fis);
   Cell c = wb.getSheet(Sheet).getRow(row).getCell(cell);
   v = c.toString();
   System.out.println(v);
// int v = c.getNumericCellValue();
	}
	catch(Exception e )
	{
		
		Reporter.log("path is invalid",true);
     }
	return v;
}
	
	
	public void writecellvalue()
	{
		try
		{
			FileInputStream fis = new FileInputStream(Excel_path);
			Workbook wb = WorkbookFactory.create(fis);
			   Cell c = wb.getSheet("").createRow(0).createCell(0);
			    String v = c.toString();
			    FileOutputStream fos = new FileOutputStream(Excel_path);
			    wb.write(fos);
		}
		catch(Exception e)
		{
			Reporter.log("path is invalid",true);
		}
		
		
	}
}