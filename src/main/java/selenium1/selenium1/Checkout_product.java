package selenium1.selenium1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout_product {

	WebDriver driver;

	@FindBy(id = "attach-sidesheet-checkout-button")
	WebElement proceedtocheckout;

	@FindBy(id = "shipToThisAddressButton")
	WebElement shipingaddress;

	@FindBy(xpath = "(//div[@class='a-radio'])[2]") // radiobutton
	WebElement creditcard;

	@FindBy(partialLinkText = "Enter card details") // enter card num
	WebElement entercardnum;

	@FindBy(name = "ApxSecureIframe")
	WebElement iframe;

	// @FindBy(id="pp-sbhLhO-104")
	@FindBy(xpath = "//input[@class='a-input-text a-form-normal pmts-account-Number']")
	WebElement creditcardnum;

	@FindBy(name = "ppw-accountHolderName")
	WebElement nickname;
	@FindBy(name = "ppw-expirationDate_month")
	WebElement expiremonth;

	@FindBy(name = "ppw-expirationDate_year")
	WebElement expireyear;

	@FindBy(name = "ppw-widgetEvent:AddCreditCardEvent")
	WebElement entercarddetails;

	@FindBy(name = "apx-secure-field-addCreditCardVerificationNumber")
	WebElement iframe2;

	@FindBy(id = "field")
	WebElement cvv;

	@FindBy(xpath = "(//input)[22]")
	WebElement usethispaymentmethod;

	public void payment(WebDriver driver) {
		proceedtocheckout.click();
		shipingaddress.click();
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOf(creditcard));

		creditcard.click();

		WebDriverWait w2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w2.until(ExpectedConditions.visibilityOf(entercardnum));

		entercardnum.click();

		driver.switchTo().frame(iframe);
	}

	public void card_details() throws InterruptedException

	{

		WebDriverWait w3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w3.until(ExpectedConditions.visibilityOf(creditcardnum));

		creditcardnum.sendKeys("4266841695059863");
		nickname.clear();
		nickname.sendKeys("ramya");

		Thread.sleep(4000);

	}

	public void dropdown(WebDriver driver) throws InterruptedException {

		Select s1 = new Select(expiremonth);

		s1.selectByIndex(2);

		Select s2 = new Select(expireyear);

		s2.selectByIndex(2);

		entercarddetails.click();

		Thread.sleep(2000);

		driver.switchTo().defaultContent();

	}

	public void entercvv(WebDriver driver) throws InterruptedException

	{

		Thread.sleep(4000);
		driver.switchTo().frame(iframe2);

		cvv.sendKeys("787");

		driver.switchTo().defaultContent();

		WebDriverWait w5 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w5.until(ExpectedConditions.visibilityOf(usethispaymentmethod));

		usethispaymentmethod.click();

	}

	public Checkout_product(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
