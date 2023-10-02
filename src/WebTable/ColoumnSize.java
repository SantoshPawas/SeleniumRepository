package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColoumnSize
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//to find coloumn size
		List<WebElement> allColSize=driver.findElements(By.xpath("(//table[@id='table1']//tr)[1]/th"));
		System.out.println("Coloumn size="+allColSize.size());
	}
}
