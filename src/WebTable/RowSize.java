package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowSize
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//to find row
		List<WebElement> allRow=driver.findElements(By.xpath("//table[@id='table1']//tr"));
		
		System.out.println("Row size="+allRow.size());
		
		
		
		
	}
	

}
