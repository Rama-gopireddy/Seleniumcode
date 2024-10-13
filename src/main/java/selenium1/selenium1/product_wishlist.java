package selenium1.selenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class product_wishlist {
	

	WebDriver driver;
	
	   @FindBy(id="add-to-wishlist-button-submit")
	   WebElement wishlistbutton;
	
	   @FindBy(id="continue-shopping")
	   WebElement continuebutton;
	   
		/*@FindBy(id="huc-view-your-list-button")
		WebElement viewyourlist;*/
		
	   
	   public void addwishlist(WebDriver driver) throws InterruptedException
	{
		Set<String> s1= driver.getWindowHandles();
		Iterator<String> i1 =s1.iterator();
		String parentid=i1.next();
		String childid=i1.next(); 
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		wishlistbutton.click();
		continuebutton.click();
     // viewyourlist.click();
      
     }	
	  public product_wishlist(WebDriver driver)
	{
		
	    PageFactory.initElements(driver, this);
	
	}

}
