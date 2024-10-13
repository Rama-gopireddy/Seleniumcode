package selenium1.selenium1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Remove_product_from_cart {

	WebDriver driver;

	@FindBy(xpath = "(//input[@class='a-button-input'])[22]")
	WebElement cartbutton;

	@FindBy(xpath = "//span[@class='a-button a-button-dropdown quantity']")
	WebElement changequntity;

	@FindBy(id = "quantity_2")

	WebElement quantity;

	@FindBy(xpath = "//input[@class='a-color-link']")
	WebElement delete;

	public void reviewcart(WebDriver driver) {
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));

		w1.until(ExpectedConditions.elementToBeClickable(cartbutton));
		cartbutton.click();

	}

	public void quantity() throws InterruptedException {

		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.elementToBeClickable(changequntity));
		changequntity.click();
		

		
		Assert.assertTrue(quantity.isDisplayed(),"sorry,quntity is not changed");

		quantity.click();

	}

	public void delete() throws InterruptedException {
		Thread.sleep(3000);
		
		Assert.assertTrue(delete.isDisplayed(),"sorry,the cart is not empty");
		delete.click();

	}

	public Remove_product_from_cart(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
