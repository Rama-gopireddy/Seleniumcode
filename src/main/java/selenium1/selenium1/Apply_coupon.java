
package selenium1.selenium1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Apply_coupon {
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[3]")
	WebElement productselect;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[1]")
	WebElement coupon;
	
	@FindBy(id="add-to-cart-button")
	WebElement addtocart;
	
	public void search(WebDriver driver) {
		
		searchbox.sendKeys("shoes in deal");
		searchbox.sendKeys(Keys.ENTER);
		
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOf(productselect));
		
		productselect.click();
		
		//Thread.sleep(2000);
		}
	
	public void coupon(WebDriver driver) {
		
		

		Set<String> s1= driver.getWindowHandles();
		Iterator<String> i1 =s1.iterator();
		String parentid=i1.next();
		String childid=i1.next(); 
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOf(coupon));
		
		Assert.assertEquals(addtocart.isDisplayed(),true,"Sorry,add to cart button not displayed");

		coupon.click();
		
		//Thread.sleep(2000);
		
		
	
	
	}
	
public void addtocart(WebDriver driver) {
		
		
	WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(20));
	w1.until(ExpectedConditions.visibilityOf(addtocart));
		addtocart.click();
		
		//Thread.sleep(2000);
		
		
	
	
	}
	
	public Apply_coupon(WebDriver driver)
	{
		
	PageFactory.initElements(driver, this);
	
	}

}
