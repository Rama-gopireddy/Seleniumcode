package selenium1.selenium1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase8_Product_sorted_testcase extends Launch_quit {

	@Test  (retryAnalyzer=selenium1.selenium1.Iretry_logic.class)
	public void sorted_buttion() throws InterruptedException, EncryptedDocumentException, IOException {

		Amazon_homepage hp = new Amazon_homepage(driver);
		hp.accountandlist(driver);
		hp.signin();

		Amazon_login_correct_credentials lp = new Amazon_login_correct_credentials(driver);
		
		lp.valid();
		lp.login();

		Amazon_searchresult sr = new Amazon_searchresult(driver);
		sr.search();

		Product_shorted_price_etc sp = new Product_shorted_price_etc(driver);
		sp.sorted();
		

		System.out.println(driver.getTitle());

		//Assert.assertEquals(driver.getTitle(), "Amazon.in : soap");
		
		// Assert.assertTrue(true,driver.getTitle());

	}
}
