package selenium1.selenium1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase13_apply_coupon_addtocart  extends Launch_quit {

	@Test(retryAnalyzer = selenium1.selenium1.Iretry_logic.class)
	public void apply_coupon() throws InterruptedException, EncryptedDocumentException, IOException

	{

		Amazon_homepage yd = new Amazon_homepage(driver);
		yd.accountandlist(driver);

		yd.signin();

		Amazon_login_correct_credentials lg = new Amazon_login_correct_credentials(driver);
lg.valid();
		lg.login();//Lg
		
		

		Apply_coupon c=new Apply_coupon(driver);
		
		c.search(driver);
		
		c.coupon(driver);
		
		c.addtocart(driver);

		System.out.println(driver.getTitle());



		Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");

}}
