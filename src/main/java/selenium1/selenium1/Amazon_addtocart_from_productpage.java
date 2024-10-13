package selenium1.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_addtocart_from_productpage {

	WebDriver driver;

	

	@FindBy(id= "add-to-cart-button")
	WebElement addcart;

	

	public void addtocartbutton() throws InterruptedException {

		Thread.sleep(2000);

		
		 Assert.assertEquals(addcart.isDisplayed(),true,"Sorry,add to cart button not displayed");

		  addcart.click();
		 
	}

	public Amazon_addtocart_from_productpage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
