package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchCellValue2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		
		//fetch particuler info "Dheepti"
		
		WebElement a1=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]/td[1]"));
		
		System.out.println(a1.getText());
		
				
	}
	
}
