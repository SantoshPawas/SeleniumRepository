package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cssselector3
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		//url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//wait
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Santosh");
		
		//wait
		Thread.sleep(2000);
		
		//OR
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("santosh123");
		
	}
	

}
