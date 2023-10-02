package Scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_Down 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();

	
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(2000);
	
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-200)");
		
		
		
		
		
	}

}
