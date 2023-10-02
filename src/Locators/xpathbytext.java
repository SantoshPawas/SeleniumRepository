package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathbytext 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--rremote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		//get url
		
		driver.get("https://facebook.com");
		
		
		//wait
		
		Thread.sleep(2000);
		//maximise
		driver.manage().window().maximize();
		
		//enter login
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("SantoshPawase");
		
		
		//wait
		
		Thread.sleep(2000);
		
		//click on Forgotton password link
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		
		
		
		
		
		
	}

}
