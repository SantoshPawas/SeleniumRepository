package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Particular_col_info 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		
		//fetch particuler coloumn info
		
		for(int i=1;i<=4;i++)
		{
			WebElement a3=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[1]"));
			System.out.println(a3.getText());
			
		}
		
	}

}
