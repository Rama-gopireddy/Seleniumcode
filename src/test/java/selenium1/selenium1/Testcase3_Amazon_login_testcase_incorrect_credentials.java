package selenium1.selenium1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class Testcase3_Amazon_login_testcase_incorrect_credentials extends Launch_quit {
	
	@Test(retryAnalyzer=selenium1.selenium1.Iretry_logic.class)
    public void login_button() throws InterruptedException, EncryptedDocumentException, IOException{
	
	
	Amazon_homepage hp=new Amazon_homepage(driver);
	hp.accountandlist(driver);
	hp.signin();
	
	Amazon_Login_incorrect_credentials lp = new Amazon_Login_incorrect_credentials(driver);
	
	lp.invalid();
	
	lp.invalid_login();
	
	System.out.println(driver.getTitle());

	Assert.assertEquals(driver.getTitle(), "Authentication required");
	
	//Assert.assertEquals(driver.getTitle(),contains("Amazon.in"));


}}
