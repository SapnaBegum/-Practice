/**
 * 
 */
package Com.Java;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * @author MY PC
 *
 */
public class Excel{
	@Test(dataProvider ="datasource-1")
	public void execution(String a, String b, String c) {
		int val1 =Integer.parseInt(a);
		int val2 =Integer.parseInt(b);
		int val3=Integer.parseInt(c);
		System.out.println(val1 + val2 + val3);
		
	}
	
	@DataProvider(name = "datasource-1")
	public Object[][] Fetchdata() throws BiffException, IOException {
		Workbook wb =Workbook.getWorkbook(new File(System.getProperty("user.dir")+"\\Data.xls"));
		  Sheet sh =wb.getSheet("Sheet1");
		  int rows=  sh.getRows();
		  int columns =sh.getColumns();
		String Data[][]= new String[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				Cell c =sh.getCell(j, i);
				Data[i][j]=c.getContents();
				System.out.print(Data[i][j]+"\t");
				
			}
			System.out.println("\n");
			
		}
		return Data;
	
	
		
	}

}
