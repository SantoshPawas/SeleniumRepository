package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathby_tagname_id 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*","ignote-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		//url
		driver.get("https://facebook.com");
		//waith
		Thread.sleep(2000);
		
		
		//click on login by tagname
		
		driver.findElement(By.tagName("button")).click();
		
		//wait
		Thread.sleep(2000);
		
		
		//back
		driver.navigate().back();
		
		
		//wait
		Thread.sleep(2000);
		
		//enter useid by id
		
		driver.findElement(By.id("email")).sendKeys("santosh@");
		
		//wait(2000);
		Thread.sleep(2000);
		
		//enter password by name
		
		driver.findElement(By.name("pass")).sendKeys("Pass#123");
				
		//wait
		Thread.sleep(2000);
		
		//click link by linktext
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//wait
		Thread.sleep(2000);
		
		//back
		driver.navigate().back();
		
		//wait
		
		Thread.sleep(2000);
		
		
		
		//click link by parrtial link
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
		
		
		
		
	}

}
