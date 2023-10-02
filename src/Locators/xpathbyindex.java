package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathbyindex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		//enter url
		driver.get("https://facebook.com");
		
		//wait
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//wait
		
		Thread.sleep(2000);
		
		//enter firstname in opened popup
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Santosh");
		
		//wait
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Pawase");
		
	}

}
