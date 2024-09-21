package selenium1.selenium1;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Amazon_login_testcse_correct_credentials  extends Launch_quit{
	
	    @Test
	    public void login_buttion() throws InterruptedException{
		
		
		Amazon_homepage hp=new Amazon_homepage(driver);
		hp.accountandlist(driver);
		hp.signin();
				
		
		
		Amazon_login_correct_credentials lp= new Amazon_login_correct_credentials(driver);
		lp.login();
		
		
		System.out.println(driver.getTitle());
	
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	
	
}}
