package Locators;
import org.openqa.selenium.By;
//xpath contains using attribute
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xPathbycontains 
{
	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		//enter url
		driver.get("https://kite.zerodha.com");
		
		//click on forget userid  or password link
		
		driver.findElement(By.xpath("//a[contains(@class,'text-light')]")).click();
		//
	}

}
