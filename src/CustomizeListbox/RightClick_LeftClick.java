package CustomizeListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClick_LeftClick 
{
	public static void main(String[] args) throws InterruptedException
	{		
		ChromeOptions CO=new ChromeOptions();	
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver=new ChromeDriver(CO); 
				
		//To enter URL/Open an Application	
		driver.get("https://www.flipkart.com/");
		
		 //Wait
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		//close hidden popup
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement element=driver.findElement(By.xpath("//span[text()='Cart']"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		act.contextClick(element).perform();
		
		Thread.sleep(2000);
		
		//press escape button from keyboard
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ESCAPE).perform();
		
		//for left click
		
		
		
		
		
		
		
		
		
		
	}
	

}
