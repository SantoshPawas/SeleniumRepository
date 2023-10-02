package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync1 
{
	
	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//*[text()='Dropdown']")).click();
		
	
		
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(3));
		
		WebElement x=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Flipkart']")));
		
		x.click();
		
		
		
		
		
	}

}
