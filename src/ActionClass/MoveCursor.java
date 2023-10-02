package ActionClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;


public class MoveCursor 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		//step 1 identify element & store it into an object
		WebElement element=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		
		//step2 create an obj of Actions class
		Actions act=new Actions(driver);
		
		//step 3 call the method
		
		act.moveToElement(element).perform();
	
	}
	

}
