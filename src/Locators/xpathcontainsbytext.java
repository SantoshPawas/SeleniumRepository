package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathcontainsbytext 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		//enter url
		driver.get("https://kite.zerodha.com");
		
		//wait
		
		Thread.sleep(2000);
		
		//click on forget userid  or password link
		driver.findElement(By.xpath("//a[contains(text(),'Forgot user ID')]")).click();
		
	}

}
