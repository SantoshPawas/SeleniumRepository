package MockEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	public void login() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-lg'])[1]")).click();
		
		WebElement lbox=driver.findElement(By.xpath("//select[@name='userSelect']"));
		lbox.click();
		
		Select sel=new Select(lbox);
		
		sel.selectByIndex(2);
		
		driver.findElement(By.xpath("//div[@class='borderM box padT20 ng-scope']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("(//button[@class='btn btn-lg tab'])[2]")).click();
		
		WebElement amttext=driver.findElement(By.xpath("//input[@placeholder='amount']"));
		
		amttext.sendKeys("1000");
		
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
	}

}
