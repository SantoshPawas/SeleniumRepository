package CustomizeListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test3 
{
	public static void main(String[] args) throws InterruptedException
	{		
		ChromeOptions CO=new ChromeOptions();	
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver=new ChromeDriver(CO); 
				
		//To enter URL/Open an Application	
		driver.get("https://www.facebook.com/");
		
		 //Wait
		Thread.sleep(2000);
		
		//Click Create new Account Button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		 //Wait
		Thread.sleep(2000);
		
		//step1 identify element and stoare it into object
		
		WebElement date=driver.findElement(By.id("day"));
		
		//step2 create ana object of actions class
		
		Actions act=new Actions(driver);
		
		//step 3 call the method
		
		act.click(date).perform();
		
		Thread.sleep(2000);
		
		//goto top of listbox
		act.sendKeys(Keys.HOME).perform();
		
		for(int i=0;i<2;i++)
		{
			
			Thread.sleep(1000);
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		//select option 
		act.sendKeys(Keys.ENTER).perform();
		
		
		Thread.sleep(2000);
		//for month
		
		WebElement month=driver.findElement(By.id("month"));
		
		act.click(month).perform();
		
		act.sendKeys(Keys.END).perform();
		
		for(int i=1;i<7;i++)
		{
			Thread.sleep(1000);
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		//for year
		
		WebElement year=driver.findElement(By.id("year"));
		
		act.click(year).perform();
		for(int i=0;i<39;i++)
		{
			Thread.sleep(1000);
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		//for selection
		act.sendKeys(Keys.ENTER).perform();
		
	}
		

}
