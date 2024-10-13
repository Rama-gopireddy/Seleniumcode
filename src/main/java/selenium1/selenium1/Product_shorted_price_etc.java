package selenium1.selenium1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Product_shorted_price_etc {

	WebDriver driver;

	@FindBy(id = "a-autoid-0-announce")
	WebElement sortby;

	@FindBy(id = "s-result-sort-select_2")

	WebElement hightolow;

	@FindBy(id = "a-autoid-0-announce")
	WebElement sort;

	@FindBy(id = "s-result-sort-select_3")

	WebElement cutomerreviews;

	@FindBy(id = "a-autoid-0-announce")
	WebElement sortb;

	@FindBy(id = "s-result-sort-select_5")

	WebElement bestseller;

	public void sorted() throws InterruptedException

	{
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.elementToBeClickable(sortby));
		sortby.click();

		WebDriverWait w2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w2.until(ExpectedConditions.elementToBeClickable(hightolow));

		Assert.assertTrue(hightolow.isDisplayed(), "sorry,it is not displayed");

		hightolow.click();

		WebDriverWait w3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w3.until(ExpectedConditions.elementToBeClickable(sort));

		sort.click();

		Thread.sleep(4000);

		// Assert.assertTrue(hightolow.isSelected(),"sorry,it is not selected");
		cutomerreviews.click();

		WebDriverWait w5 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w5.until(ExpectedConditions.elementToBeClickable(bestseller));

		bestseller.click();

	}

	public Product_shorted_price_etc(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
