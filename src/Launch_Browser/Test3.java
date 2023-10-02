package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Selenium\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
	}

}
