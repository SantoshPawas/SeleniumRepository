package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cssSelector
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		//url
		driver.get("https://kite.zerodha.com/");
		
		
		//insert username by tagname&id
		driver.findElement(By.cssSelector("input#userid")).sendKeys("admin");
		
		//wait
		Thread.sleep(2000);
		//OR
		
		driver.findElement(By.cssSelector("#password")).sendKeys("admin123");
		
	
		
		
		
		
		
		
		
	}
}

		
