package ScreenShot;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Sectionscreenshot1 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		

		driver.get("https://www.swiggy.com/");
		
		
		//wait
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement we=driver.findElement(By.xpath("//span[text()='Locate Me']"));
		we.click();
		
		WebElement element=driver.findElement(By.xpath("//div[@class='sc-efBctP iMcNGa']"));

		File Source=element.getScreenshotAs(OutputType.FILE);

		File Destination=new File("D:\\Screenshots\\image2.jpg");
		
		
		FileHandler.copy(Source,Destination);
	
	
	
		

	}
}
