package pfPack.PFProj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfPack.PFProj.util.Constants;

public class LoginPage {
	
	WebDriver driver=null;
	ExtentTest eTest=null;
	@FindBy(id="lid")
	public WebElement EmailField;
	
	@FindBy(id="pwd")
	public WebElement PasswordField;
	
	@FindBy(id="signin_submit")
	public WebElement SignInButton;
	
	public LoginPage(WebDriver driver, ExtentTest eTest)
	{
		this.driver=driver;
		this.eTest=eTest;
	}
	
	public boolean doLogin()
	{
		EmailField.sendKeys(Constants.USERNAME);
		
		eTest.log(LogStatus.INFO, "UserName entered.");
		PasswordField.sendKeys(Constants.PASSWORD);
		eTest.log(LogStatus.INFO, "Password entered.");
		SignInButton.click();
		eTest.log(LogStatus.INFO, "Submit button got clicked.");
		
		HomePage homepage = new HomePage(driver,eTest);
		PageFactory.initElements(driver, homepage);
		
		boolean loginstatus = homepage.verifyhomepage();
		
		return loginstatus;
	}

}
