package pfPack.PFProj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;

import pfPack.PFProj.base.BaseTest;

public class HomePage extends BaseTest{
	WebDriver driver=null;
	ExtentTest eTest=null;
	
	@FindBy(css="span[class^='zicon-apps-calendar']")
	public WebElement Calendar;
	
	@FindBy(css="span[class^='zicon-apps-chat']")
	public WebElement Cliq;
	
	@FindBy(css="span[class^='zicon-apps-crm']")
	public WebElement CRM;
	
	@FindBy(css="span[class^='zicon-apps-mail']")
	public WebElement Mail;
	
	@FindBy(css="span[class^='zicon-apps-salesiq']")
	public WebElement SalesIQ;
	
	public HomePage(WebDriver driver, ExtentTest eTest)
	{
		this.driver=driver;
		this.eTest=eTest;
	}
	
	public boolean verifyhomepage()
	{
		return(isElementPresent(Cliq));
	}
}
