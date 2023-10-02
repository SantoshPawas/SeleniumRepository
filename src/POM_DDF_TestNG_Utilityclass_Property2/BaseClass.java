package POM_DDF_TestNG_Utilityclass_Property2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver driver;
	public void initializeBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
	}

}
