package TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ParallelTesting1 
{
	@Test
	public void openFlipkart()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
	}
}
