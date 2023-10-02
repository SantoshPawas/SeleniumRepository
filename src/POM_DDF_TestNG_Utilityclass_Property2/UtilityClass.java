package POM_DDF_TestNG_Utilityclass_Property2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class UtilityClass 
{
	@Test
	public static String getDataFromPropFile(String key) throws IOException
	{
		//reach up to property file
		FileInputStream file=new FileInputStream("C:\\Users\\shree\\eclipse-workspace\\Selenium1\\PropFile.properties");
		
		//creat an obj of Properties class
		
		Properties prop=new Properties();
		
		//open property file
		
		prop.load(file);
		
		//fetch data from prop file
		
		String value=prop.getProperty(key);
		return value;
		
	}
	@Test
	public static String getDataFromExcelSheet(int Rowindex,int Cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\Parameterization\\Demo.xlsx");
		String value=WorkbookFactory.create(file).getSheet("Sheet11").getRow(Rowindex).getCell(Cellindex).getStringCellValue();
		
		return value;
		
		
	}
	
	
	

}
