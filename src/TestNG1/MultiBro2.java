package TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBro2 
{
	@Parameters({"BroName","URL"})
	@Test
	
	public void TC1(String BroName, String URL)
	{
		WebDriver driver=null;
		if(BroName.equals("Chrome"))
		{
			driver=new ChromeDriver();
			driver.get(URL);
		}
		else if(BroName.equals("Firefox"))
		{
			driver=new FirefoxDriver();
			driver.get(URL);
		}
		else if(BroName.equals("Edge"))
		{
			driver=new EdgeDriver();
			driver.get(URL);
			
		}
		
		

	}


}
