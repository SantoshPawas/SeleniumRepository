package Data_Drivern_Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TestNGDemo1 
{
	@Test
	public void VerifyUser() throws IOException, InterruptedException
	{
		System.out.println("Running Verify username");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/SearchHotel.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		FileInputStream fis=new FileInputStream("D:\\Parameterization\\Demo.xlsx");
		Sheet sh=WorkbookFactory.create(fis).getSheet("Sheet9");
		String UN=sh.getRow(0).getCell(0).getStringCellValue();
		String PSW=sh.getRow(1).getCell(0).getStringCellValue();
		
		String ExpectedUsername=sh.getRow(2).getCell(0).getStringCellValue();
		
		//enter username
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN);
		
		//enter password
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PSW);
		
		//click on login button
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		//verify test case verify username
		
		String s1=driver.findElement(By.xpath("//input[@name='username_show']")).getAttribute("value");
		
		String a1[]=s1.split(" ");
		
		String ActualUsername=a1[1];
		
		//verify testcase->username verify
		
		if(ExpectedUsername.equals(ActualUsername))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
			
			File source=driver.findElement(By.xpath("//input[@name='username_show']")).getScreenshotAs(OutputType.FILE);
			
			File dest=new File("D:\\Screenshots\\Test2.jpeg");
			
			FileHandler.copy(source, dest);
			System.out.println("Screenshot taken successfully.......");
			
			
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
