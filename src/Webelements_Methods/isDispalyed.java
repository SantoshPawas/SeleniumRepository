package Webelements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isDispalyed
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://facebook.com");
		
		//wait
		Thread.sleep(2000);
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		
		boolean b=logo.isDisplayed();
		System.out.println(b);
	}
		
		
		
		
		
}
