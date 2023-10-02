package Annotations2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterDDemo 
{
	@Parameters("URL")
	@Test
	public void TC1(String URL)
	{
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
	}
	

}
