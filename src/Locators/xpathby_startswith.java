package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathby_startswith
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		//url
		driver.get("https://kite.zerodha.com/");
		//wait
		Thread.sleep(2000);
		
		//xpath by starts with
		
		driver.findElement(By.xpath("//a[starts-with(@class,'text-light forgot-link')]")).click();
		
		
		
	}

}
