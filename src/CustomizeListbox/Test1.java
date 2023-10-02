package CustomizeListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//step1 identify element & store it into object
		WebElement month=driver.findElement(By.id("month"));
		
		//step2 create an object of Action class
		Actions act=new Actions(driver);
		
		//step3 call the method click
		act.click(month).perform();
		
		//act.sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		
		
		
	}
	

}
