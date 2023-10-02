package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchData_ForA_Row
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		
		//fetch data of perticular row
		
		WebElement a3=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]"));
		System.out.println(a3.getText());
		//OR
		
		for(int i=1;i<=3;i++)
		{
			WebElement a2=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td["+i+"]"));
			
			System.out.print(a2.getText()+" ");
		}
		System.out.println();
	}
}
