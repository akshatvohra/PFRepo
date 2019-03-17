package pfPack.PFProj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfPack.PFProj.util.Constants;

public class LaunchPage {
	
	WebDriver driver=null;
	ExtentTest eTest=null;
	
	@FindBy(className="zh-customers")
	public WebElement Customers;
	
	@FindBy(className="zh-support")
	public WebElement Support;
	
	@FindBy(className="zh-login")
	public WebElement Login;
	
	@FindBy(className="zh-signup")
	public WebElement SignUp;
	
	public LaunchPage(WebDriver driver, ExtentTest eTest)
	{
		this.driver = driver;
		this.eTest= eTest;
	}
	
	public boolean GoToLoginPage()
	{
		driver.get(Constants.APP_URL);
		
		eTest.log(LogStatus.INFO, "Url got Open.");
		
		Login.click();
		
		eTest.log(LogStatus.INFO, "Login got clicked.");
		
		LoginPage loginPage = new LoginPage(driver,eTest);
		
		PageFactory.initElements(driver, loginPage);
		
		boolean loginstatus = loginPage.doLogin();
		
		return loginstatus;
	}
	
}
