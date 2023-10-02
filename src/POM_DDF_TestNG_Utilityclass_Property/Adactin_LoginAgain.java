package POM_DDF_TestNG_Utilityclass_Property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_LoginAgain 
{
	@FindBy(xpath="//a[text()='Click here to login again']")private WebElement loginAgain;
	
	public Adactin_LoginAgain(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickLoginAgain()
	{
		loginAgain.click();
	}

}
