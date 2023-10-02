package TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallerTesting3 
{
	@Test
	public void openEdge()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
	}

}
