package selenium1.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class All_payments_method {

WebDriver driver;

	

	@FindBy(id = "attach-sidesheet-checkout-button")
	WebElement proceedtocheckout;

	@FindBy(id = "shipToThisAddressButton")
	WebElement shipingaddress;

	@FindBy(name = "ppw-instrumentRowSelection") // radiobutton
	WebElement creditcard;
	
	@FindBy(xpath= "//div[@class='a-radio a-spacing-top-mini']") 
	WebElement netbank;
	
	@FindBy(xpath= "(//div[@class='a-radio'])[3]") 
	WebElement otherupi;
	
	/*@FindBy(xpath= "//div[@class='a-radio a-spacing-top-micro']") 
	WebElement emi;*/

	

	public void paymentmethods(WebDriver driver) throws InterruptedException {
		proceedtocheckout.click();
		shipingaddress.click();
		creditcard.click();
		
		Thread.sleep(5000);
		

		
		Assert.assertTrue(netbank.isDisplayed(),"sorry,the radiobutton not displayed");
		netbank.click();
		/*WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOf(otherupi));*/
		Thread.sleep(4000);
		
		otherupi.click();
		

		Assert.assertTrue(otherupi.isDisplayed(),"sorry,the radiobutton not displayed");
		
		Thread.sleep(3000);
		//emi.click();
	}

		

	public All_payments_method(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
}
