package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice_Locator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*","ignore-ceretificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		//url
		driver.get("https:\\www.facebook.com");
		
		//wait
		Thread.sleep(2000);
		
		//maximize
		
		driver.manage().window().maximize();
		
		//entee userid by xpath by attribute
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Santosh");
		
		//wait
		Thread.sleep(2000);
		
		
		// click by xpath by text
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		//wait
		Thread.sleep(2000);
		//bacck
		
		driver.navigate().back();
		//wait
		Thread.sleep(2000);
				
		//insert pass by contains xpath by attribute
		
		
		driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy _9npi')]")).sendKeys("Santosh@123");
		
		
		//wait
				Thread.sleep(2000);
		
		//click on login button by conatiins xpath by text
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		
		//wait
				Thread.sleep(2000);
				
		//bacck
				
		driver.navigate().back();
		//click on create on new acc
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		//wait
		Thread.sleep(2000);
		
		//enter username by xpath by index	
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Santosh");
		
				
		
		
		
		
	}

}
