package selenium1.selenium1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_searchresult {
	
	
     WebDriver driver;
	
	 @FindBy(id="twotabsearchtextbox")
	 WebElement searchbox;
	
	 public void search()
	{
		
	
	searchbox.sendKeys("Books");
	searchbox.sendKeys(Keys.ENTER);
		                                                                             
	}
	
	
	public Amazon_searchresult(WebDriver driver)
	{
		
	PageFactory.initElements(driver, this);
	
	}

}
