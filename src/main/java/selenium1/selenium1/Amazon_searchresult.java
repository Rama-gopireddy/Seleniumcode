package selenium1.selenium1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_searchresult {
	
	
    WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
    public void search()
	{
		
    	Assert.assertTrue(searchbox.isDisplayed());
	searchbox.sendKeys("soap");
	searchbox.sendKeys(Keys.ENTER);
		                                                                             
	}
	
	
	public Amazon_searchresult(WebDriver driver)
	{
		
	PageFactory.initElements(driver, this);
	
	}

}
