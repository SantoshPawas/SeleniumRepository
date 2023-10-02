package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_all_record 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		
		//fetch all record from webtable
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=3;j++)
			{
				WebElement element=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]"));
				
				System.out.print(element.getText()+" ");
				
			}
			System.out.println();
		}
	}
		

}
