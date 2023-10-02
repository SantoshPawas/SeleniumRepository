package Data_Drivern_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_Testclass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		//create an obj of POM class-I
		
		Adactin_Login Login=new Adactin_Login(driver);
		
		Adactin_Welcome_HomePage Home=new Adactin_Welcome_HomePage(driver);
		Thread.sleep(1000);
		
		//call the method
		Login.enterUsername();
		
		Thread.sleep(1000);
		Login.enterPSW();
		Thread.sleep(1000);
		Login.clickLoginBtn();
		
		Thread.sleep(1000);
		Home.getUsername();
		Thread.sleep(1000);
		Home.clickLogout();
		
	}

}
