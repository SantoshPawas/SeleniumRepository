package POM_DDF_TestNG_Utilityclass_Property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UtilityClass 
{
	@Test
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\shree\\eclipse-workspace\\Selenium1\\PropFile.properties");
		
		Properties prop=new Properties();
		
		prop.load(file);
		
		String value=prop.getProperty(key);
		return(value);
	}
	
	@Test
	public static String getDataFromExcel(int i,int j) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("D:\\Parameterization\\Demo.xlsx");
		
		String value1=WorkbookFactory.create(fis).getSheet("Sheet11").getRow(i).getCell(j).getStringCellValue();
		
		return(value1);
		
	}
	@Test
	public static void CaptureScreenShot(WebDriver driver,String TestCaseID) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		
		File Destination=new File("D:\\Screenshots\\"+TestCaseID+".jpg");
		
	
		
		FileHandler.copy(source, Destination);		
		
				
				
	}

}
