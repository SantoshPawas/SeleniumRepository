package TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTesting2 
{
	@Test
	public void openFirefox()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
