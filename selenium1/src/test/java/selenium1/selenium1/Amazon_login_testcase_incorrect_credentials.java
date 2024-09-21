package selenium1.selenium1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_login_testcase_incorrect_credentials extends Launch_quit {
	
	@Test
    public void login_button() throws InterruptedException{
	
	
	Amazon_homepage hp=new Amazon_homepage(driver);
	hp.accountandlist(driver);
	hp.signin();
	
	Amazon_Login_incorrect_credentials lp=new Amazon_Login_incorrect_credentials(driver);
	
	lp.login();
	System.out.println(driver.getTitle());

	//Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");


}}
