package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		//step1 identifing element and stoared it into object
		WebElement source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement destination=driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[2]"));
		
		//step2 create an object of Action class
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		//call the methhod dragAndDrop()
		act.dragAndDrop(source, destination).perform();
	}

}
