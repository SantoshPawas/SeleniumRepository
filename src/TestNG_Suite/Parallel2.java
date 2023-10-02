package TestNG_Suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Parallel2
{
	@Test
	public void openFlipkart()
	{
		ChromeOptions CO=new ChromeOptions();	
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		 WebDriver  driver=new ChromeDriver(CO); 

		driver.get("https://www.flipkart.com");
	}

}
