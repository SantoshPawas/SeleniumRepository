package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPopup
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement text=driver.findElement(By.xpath("//input[@name='cusid']"));
		
		Thread.sleep(2000);
		text.sendKeys("abc123");
		Thread.sleep(2000);
		
		WebElement but=driver.findElement(By.xpath("//input[@name='submit']"));
		but.click();
		Thread.sleep(2000);
		
		Alert alt=driver.switchTo().alert();
		
		alt.accept();
		
		
		
		
		
	}

}
