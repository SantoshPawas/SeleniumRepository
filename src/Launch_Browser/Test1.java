package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args)
	{
		
		//parameter I- Name of the browser
		//Parameter II - Path of Chrome driver exe file
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//Create an obj of ChromeDriver class & provide reference of WebDriver Interface
		WebDriver driver=new ChromeDriver();
		
		
		

		

	}

}
