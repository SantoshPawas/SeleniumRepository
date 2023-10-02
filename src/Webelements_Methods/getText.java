package Webelements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getText
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://facebook.com");
		
		//wait
		Thread.sleep(2000);
		
		//find element
		WebElement link=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		String s=link.getText();
		System.out.println(s);
		
	}

}
