package Webelements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isselected 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://facebook.com");
		
		//wait
		Thread.sleep(2000);
		
		//gettting webelemetn
		WebElement button=driver.findElement(By.xpath("//a[text()='Create new account']"));
		
		//click creat an account button
		
		button.click();
		
		//wait
		Thread.sleep(2000);
		
		//getting an radio button as webelement
		
		WebElement radio=driver.findElement(By.xpath("//input[@name='sex']"));
		
		
		
		//wait
		Thread.sleep(2000);

		
		
		boolean b=radio.isSelected();
		System.out.println(b);
	}
		
		
		

}
