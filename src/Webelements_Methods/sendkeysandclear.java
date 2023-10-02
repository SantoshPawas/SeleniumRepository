package Webelements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sendkeysandclear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://facebook.com");
		
		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		//wait
		Thread.sleep(2000);
		
		username.sendKeys("Santosh");
		
		//wait
		
		Thread.sleep(2000);
		
		username.clear();
		//wait
		Thread.sleep(2000);
		
		username.sendKeys("Pawase");
		
		
		
	}

}
