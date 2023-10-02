package TestNG1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidaer2 
{
	@Test(dataProvider="m1")
	public void m1(String UN,String PSW )
	{
		System.out.println("Username="+UN);
		System.out.println("Password="+PSW);
	}
	@DataProvider
	
	public String[][] m1() throws EncryptedDocumentException, IOException
	{
		String[][] data=new String[2][2];
//		data[0][0]="Santosh";
//		data[0][1]="123";
//	
//		data[1][0]="Parth";
//		data[1][1]="456";
		
		
		
		FileInputStream fis=new FileInputStream("D:\\Parameterization\\Demo.xlsx");
		Sheet sh= WorkbookFactory.create(fis).getSheet("Sheet10");
		
		int rowsize=sh.getLastRowNum();
		for(int i=0;i<=rowsize;i++)
		{
			int cellsize=sh.getRow(i).getLastCellNum();
			for(int j=0;j<cellsize;j++)
			{
				data[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
				
			}
		}
		return data;
	}
		
		


}
