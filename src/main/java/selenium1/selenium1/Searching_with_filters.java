package selenium1.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searching_with_filters {
	
	WebDriver driver;
	@FindBy(className="a-icon a-icon-checkbox")
	WebElement checkbox;
	
	public void select()
	
	{
		
	checkbox.click();	
		
	}
	public Searching_with_filters (WebDriver driver)
	{
		
	PageFactory.initElements(driver, this);
	
	}

}
