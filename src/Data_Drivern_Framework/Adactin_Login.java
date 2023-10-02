package Data_Drivern_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login 
{
	//POM Class-II
	//step1:-Data members/variables should be declared globally with access level private by using @FindBy annotation
	
	@FindBy(xpath = "//input[@name='username']")private WebElement UN;
	@FindBy(xpath="//input[@name='password']")private WebElement PSW;
	@FindBy(xpath="//input[@name='login']")private WebElement Login_Btn;
	//step2 Initialize within a constructor with access level public using PageFactory class
	public Adactin_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3 create method with acceess level public
	public void enterUsername()
	{
		UN.sendKeys("Velocity");
	}
	public void enterPSW()
	{
		PSW.sendKeys("U1YP1G");
	}
	public void clickLoginBtn()
	{
		Login_Btn.click();
	}

}
