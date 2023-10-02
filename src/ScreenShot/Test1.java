package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://kite.zerodha.com/");
		
		//wait
		Thread.sleep(2000);
		
		//typecast/downcasting//convert
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(Source);
		//creat an object of File class
		
		File Destination=new File("D:\\Screenshots\\Sample3.jpg");
		
		//copy screenshot
		
		FileHandler.copy(Source, Destination);

		
	}

}
