package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//step1 identifing element and stoared into an object
		WebElement element=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		//step2 create an object of Actions class
		
		Actions act=new Actions(driver);
		
		//step3 call the method doubleClick();
		act.doubleClick(element).perform();
		
//		Thread.sleep(2000);
//		//swict to alert popup
//		Alert alt=driver.switchTo().alert();
//		
//		alt.accept();
//		
		
				
		
		
		
	}

}
