package selenium1.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_homepage {
	
WebDriver driver;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	
	@FindBy(xpath="//span[.='Sign in']" )
	WebElement signinbutton;
	
	
	
	public void accountandlist(WebDriver driver)
	{
		
		Actions a1=new Actions(driver);
		
		a1.moveToElement(accountandlist).perform();
		
		
	}
	
	public void signin()
	{
		
	signinbutton.click();
	
	}
	
	public Amazon_homepage(WebDriver driver)
	{
		
	PageFactory.initElements(driver, this);
	
	}

}
