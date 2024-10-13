package selenium1.selenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_cart_without_login {
	
    WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	
	@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[5]")
	WebElement productselect;
	
	@FindBy(id="add-to-cart-button")
	WebElement addtocart;
	
	
    public void search()
	{
		
	
	searchbox.sendKeys("shoes");
	searchbox.sendKeys(Keys.ENTER);
		                                                                             
	}
    
    public void product()
    {
    	

		
		
		productselect.click();
		
    }
    

    public void addtocart(WebDriver driver)
	{
		
    	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	Set<String> s1= driver.getWindowHandles();
		Iterator<String> i1 =s1.iterator();
		String parentid=i1.next();
		String childid=i1.next(); 
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
	
	addtocart.click();	                                                                             
	}
    

	public Amazon_cart_without_login(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
