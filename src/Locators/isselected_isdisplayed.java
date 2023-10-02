package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isselected_isdisplayed
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allow-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//Enter URL
		driver.get("https://businessemail.rediff.com/login-page?sc_cid=www.google.com|login_page");
		
		//Wait
		Thread.sleep(2000);
		
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='remember']"));
		System.out.println("Status of checkbox before clicked="+checkbox.isSelected());
		checkbox.click();
		System.out.println("Status of checkbox after clicked="+checkbox.isSelected());
		//wait
		Thread.sleep(2000);
		
	
		driver.close();
		
		
	}

}
