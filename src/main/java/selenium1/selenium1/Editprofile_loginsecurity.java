package selenium1.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Editprofile_loginsecurity {
	
	WebDriver driver;
	
	@FindBy(id="nav-link-accountList")
	WebElement accountandlist;
	
	/*@FindBy(xpath="" )
	WebElement youraccount;*/
	
	@FindBy(xpath="(//div[@class='a-column a-span9 a-span-last'])[2]")
	WebElement loginsecurity;
	
	@FindBy(id="NAME_BUTTON")
	WebElement name;
	
	@FindBy(name="customerName")
	WebElement newname;
	
	@FindBy(id="cnep_1C_submit_button")
	WebElement savechanges;
	
	
	/*public void accountandlist(WebDriver driver)
	{
		
		Actions a1=new Actions(driver);
		
		a1.moveToElement(accountandlist).perform();
		
		/*Select s1=new Select(youraccount);

		s1.selectByVisibleText("Your Account");

		//s1.selectByIndex(1);
		
	}*/
	
	public void loginandsecurity()
	{
		accountandlist.click();
		//youraccount.click();
		loginsecurity.click();
		name.click();
		newname.sendKeys("devi");
		savechanges.click();
		
		
	}
	
	public Editprofile_loginsecurity(WebDriver driver)
	{
		
	PageFactory.initElements(driver, this);
	
	}

}
