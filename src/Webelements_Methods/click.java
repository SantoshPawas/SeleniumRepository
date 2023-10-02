package Webelements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class click
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://facebook.com");
		
		//wait
		Thread.sleep(2000);
		
		WebElement button=driver.findElement(By.xpath("//a[text()='Create new account']"));
		//click on button
		
		button.click();
	}
		

}
