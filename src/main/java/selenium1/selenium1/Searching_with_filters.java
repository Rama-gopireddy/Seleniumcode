package selenium1.selenium1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

    public class Searching_with_filters {
	
	WebDriver driver;
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[5]")//get it by tomorrow
	WebElement checkbox;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[7]")
	WebElement category;
	
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[8]")//
	WebElement brand;
	
	
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base a-text-bold'])[3]")
	WebElement priceslider;
	
	

	public void select() throws InterruptedException
	
	{
		
	checkbox.click();
	}
	public void catego() {
	WebDriverWait w1=new WebDriverWait (driver,Duration.ofSeconds(10));
	w1.until(ExpectedConditions.elementToBeClickable(category));
	category.click();
	Assert.assertTrue(category.isDisplayed());
	}
	public void brandname() throws InterruptedException {
	/*WebDriverWait w2=new WebDriverWait (driver,Duration.ofSeconds(10));
	w2.until(ExpectedConditions.elementToBeClickable(brand));*/
	
	Thread.sleep(3000);
	brand.click();
	Assert.assertTrue(brand.isDisplayed());
	}
	
	public void pricerange() throws InterruptedException {
	WebDriverWait w2=new WebDriverWait (driver,Duration.ofSeconds(10));
	w2.until(ExpectedConditions.elementToBeClickable(priceslider));
		Thread.sleep(3000);
	priceslider.click();
	
	Assert.assertTrue(priceslider.isDisplayed());
	}
	
	public Searching_with_filters (WebDriver driver)
	{
		
	PageFactory.initElements(driver, this);
	
	}
	
	

}
