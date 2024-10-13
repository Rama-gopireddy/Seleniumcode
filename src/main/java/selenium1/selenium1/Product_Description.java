package selenium1.selenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Product_Description {
	
	WebDriver driver;
	
	@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
	WebElement firstproduct;
	
	
	
	
	public void product(WebDriver driver) throws InterruptedException 
	{
		
		
		Assert.assertTrue(firstproduct.isEnabled());
		firstproduct.click();
		
		Thread.sleep(2000);
		
		Set<String> s1= driver.getWindowHandles();
		Iterator<String> i1 =s1.iterator();
		String parentid=i1.next();
		String childid=i1.next(); 
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		
		
		
		
	
		
	
	
	}
	
	public Product_Description(WebDriver driver)
	{
		
	PageFactory.initElements(driver, this);
	
	}

}
