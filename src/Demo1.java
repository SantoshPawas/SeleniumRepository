import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://dash.gallery/dash-tsne/");
		driver.manage().window().maximize();
		
		
		WebElement element=driver.findElement(By.xpath("(//div[@class='rc-slider-step']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(element).perform();
		act.click().perform();
		
		
				
		
	}

}
