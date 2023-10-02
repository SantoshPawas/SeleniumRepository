package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectListItem 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		
		
		WebElement element=driver.findElement(By.xpath("//a[text()='Create new account']"));
		
		element.click();
		Thread.sleep(2000);
		
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select s2=new Select(day);
		
		s2.selectByIndex(2);
		
		Thread.sleep(2000);
		
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select s3=new Select(year);
		
		s3.selectByVisibleText("1984");
		Thread.sleep(2000);
		
		
		//step1:identify webelement(listbox) by xpath
		
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		//step2 creat an Object of select class:
		
		Select s1=new Select(month);
		
		s1.selectByVisibleText("Jun");
		
		
		

		
		
		
		
	}

}
