package MockEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo3 
{
	@Test
	public void clickSlider() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://dash.gallery/dash-tsne/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement source=driver.findElement(By.xpath("//span[text()='500']"));
		
		Thread.sleep(2000);

		WebElement destination=driver.findElement(By.xpath("//span[text()='750']"));

		Actions act=new Actions(driver);
		
		act.dragAndDrop(source, destination).perform();
		
		
		
	}

}
