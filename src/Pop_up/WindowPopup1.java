package Pop_up;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowPopup1
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement we1=driver.findElement(By.xpath("//input[@name='NewTab']"));
		we1.click();
		
		Thread.sleep(2000);
		
		Set<String> sid=driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<String>(sid);
		
		String mpid=al.get(0);
		String cpid=al.get(1);
		
		System.out.println(mpid+"\n"+cpid);
		
		//move focus  to child page
		driver.switchTo().window(cpid);
		
		Thread.sleep(2000);
		
		WebElement we2=driver.findElement(By.xpath("(//span[@class='menu-text'])[22]"));
		
		
		we2.click();
		
		Thread.sleep(2000);
		driver.switchTo().window(mpid);
		Thread.sleep(2000);
		
		WebElement we3=driver.findElement(By.xpath("//input[@name='home']"));
		we3.click();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	}

}
