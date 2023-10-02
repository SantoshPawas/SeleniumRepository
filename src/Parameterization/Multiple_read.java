package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_read 
{
	private static final Object[][] String = null;

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://kite.zerodha.com/");
		FileInputStream fis=new FileInputStream("D:\\Parameterization\\Demo.xlsx");
		Sheet sh=WorkbookFactory.create(fis).getSheet("Sheet8");
		
//		WebElement user=driver.findElement(By.xpath("//input[@placeholder='User ID (eg: AB0001)']"));
		
		
		
		int LastRowIndex=sh.getLastRowNum();
		for(int i=0;i<=LastRowIndex;i++)
		{
			int LastCellIndex=sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=LastCellIndex;j++)
			{
				String value=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
				
			}
			System.out.println();
			
		}
		
		
	}
	
	

}
