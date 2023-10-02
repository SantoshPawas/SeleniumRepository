package Scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_up_Down 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
			 WebDriver  driver=new ChromeDriver(CO); 
			
			//To enter URL/Open an Application
			driver.get("https://demo.guru99.com/test/guru99home/");
					
			 //Wait
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		//Scroll Down: 2nd Parameter "+Ve" pixel value	
	  ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
			
		Thread.sleep(5000);
	
	//Scroll Up: 2nd Parameter "-Ve" pixel value	
	  ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");

		
	}

}
