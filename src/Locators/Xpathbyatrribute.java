package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpathbyatrribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://facebook.com");
		//wait
		Thread.sleep(2000);
		//maximise
		driver.manage().window().maximize();
		
		
		//enter username
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("SantoshPawase");
		
		
		//enter pass
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Parth");
		
		
		//click on login button
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
		
	}

}
