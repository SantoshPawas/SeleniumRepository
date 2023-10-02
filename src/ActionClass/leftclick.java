package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class leftclick 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.Flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//close hidden division popup
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		//step1 identifing element and stoared it into an object
		WebElement element=driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
		
		//create an object of Actions class
		Actions act=new Actions(driver);
		
		//call the method for left click-click()
		act.click(element).perform();
	}

}
