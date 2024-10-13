package selenium1.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_Login_incorrect_credentials  extends DDT_Class {
	
	   WebDriver driver;
		
		@FindBy(id="ap_email")
		WebElement un;
		
		
		@FindBy(id="continue")
		WebElement continuebutton;
		
		@FindBy(id="ap_password" )
		WebElement pass;
		
		@FindBy(id="signInSubmit" )
		WebElement signinbutton;
		
		
		
		
		public void invalid_login()
		{
			
		
		un.sendKeys(username);
		continuebutton.click();
			                                                                             
		pass.sendKeys(password);
		signinbutton.click();
			
			
		}
		
		
		
		public Amazon_Login_incorrect_credentials(WebDriver driver)
		{
			
		PageFactory.initElements(driver, this);
		
		}
}
