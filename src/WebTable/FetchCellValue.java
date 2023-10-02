package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchCellValue 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//to find coloumn size
		
		WebElement element=driver.findElement(By.xpath("//table[@id='table1']//tr[2]//td[3]"));
		System.out.println(element.getText());
	}

}
