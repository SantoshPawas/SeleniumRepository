package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo2
{
	@Test
	public void login()
	{
		WebDriver driver=new ChromeDriver();
	

	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");


	driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-lg'])[1]")).click();

	WebElement name=driver.findElement(By.xpath("//select[@id='userSelect']"));

	Select s1=new Select(name);

	s1.selectByVisibleText("Harry Potter");

	// for login

	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();

	//for withdraw

//	driver.findElement(By.xpath("(
	//for withdraw

	driver.findElement(By.xpath("(//button[@class='btn btn-lg tab'])[3]")).click();
}
}
