package POM_DDF_TestNG_Utilityclass_Property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCalss 
{
	WebDriver driver;
	public void initializeBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
	}

}
