package selenium1.selenium1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_homepage_register_newuser {
	
	
WebDriver driver;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	
	@FindBy(partialLinkText="Start here.")
	WebElement starthere;
	
	public void accountandlist(WebDriver driver)
	{
		
	Actions a1=new Actions(driver);
		
	a1.moveToElement(accountandlist).perform();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	starthere.click();
	
	}
	
	
	
	public Amazon_homepage_register_newuser(WebDriver driver)
	{
		
	PageFactory.initElements(driver, this);
	
	}

}
