package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions
{
	public static void main(String[] args) throws InterruptedException 
	{

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-errors=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		//url
		driver.get("file:///C:/Users/shree/Desktop/multselect.html");
		//wait
		Thread.sleep(2000);
		
		//maximise
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement we=driver.findElement(By.xpath("//select[@name='names']"));
		
		Select s1=new Select(we);
		
		for(int i=0;i<5;i=i+2)
		{
			Thread.sleep(1000);
			s1.selectByIndex(i);
		}
		List<WebElement> ele=s1.getAllSelectedOptions();
		
		Thread.sleep(2000);
		for(WebElement w:ele)
		{
			System.out.println(w.getText());
			
		}
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
	}

}
