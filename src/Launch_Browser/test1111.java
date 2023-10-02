package Launch_Browser;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1111 
{
	static void main(String[] args) throws InterruptedException 
	{
		
		 ChromeOptions CO=new ChromeOptions();
			
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		
			//To enter URL/Open an Application	
		driver.get("https://www.facebook.com/");
		
		 //Wait
		Thread.sleep(2000);
		
		
		//Create object of Dimension Class
		Dimension D1=new Dimension(400,700);  //Width Height
		
		
		//To set size of the browser
		driver.manage().window().setSize(D1);  //Width Height
		
		
	}


}
