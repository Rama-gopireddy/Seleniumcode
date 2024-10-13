package selenium1.selenium1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Editprofile {

	WebDriver driver;

	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	WebElement accountandlist;

	@FindBy(xpath = "//button[@class='sc-fqkvVR sc-fTFjTM jZunJN eqmAHp']")
	WebElement manageprofile;

	@FindBy(partialLinkText = "View")
	WebElement viewbutton;

	@FindBy(xpath = "//span[@class='editProfile']")
	WebElement editnameprofile;

	@FindBy(id = "editProfileNameInputId")
	WebElement editname;

	@FindBy(id = "editProfileContinueButton")
	WebElement editcontinue;

	public void manageprofile(WebDriver driver) throws InterruptedException {

		Actions a1 = new Actions(driver);

		a1.moveToElement(accountandlist).perform();

		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		manageprofile.click();
		viewbutton.click();
		editnameprofile.click();
        editname.clear();
        
        Thread.sleep(2000);
		editname.sendKeys("ramadevigopireddy");

		Thread.sleep(5000);
		
		editcontinue.click();
		
		Assert.assertTrue(editcontinue.isDisplayed(),"editcontinueis displaye");

	}

	public Editprofile(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
