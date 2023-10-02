package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathbytext1 
{
	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		//enter url
		driver.get("https://facebook.com");
		
		//click on Create new account
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
	}

}
