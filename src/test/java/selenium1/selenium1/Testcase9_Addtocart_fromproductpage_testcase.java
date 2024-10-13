package selenium1.selenium1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase9_Addtocart_fromproductpage_testcase extends Launch_quit {

	@Test (retryAnalyzer=selenium1.selenium1.Iretry_logic.class)
	public void addtocart() throws InterruptedException {

		Amazon_homepage hp = new Amazon_homepage(driver);
		hp.accountandlist(driver);
		hp.signin();

		Amazon_login_correct_credentials lp = new Amazon_login_correct_credentials(driver);
		lp.login();

		Amazon_searchresult sr = new Amazon_searchresult(driver);
		sr.search();

		Product_Description p1 = new Product_Description(driver);
		p1.product(driver);

		product_wishlist wish = new product_wishlist(driver);
		wish.addwishlist(driver);

		Thread.sleep(2000);

		Amazon_addtocart_from_productpage adcart = new Amazon_addtocart_from_productpage(driver);

		adcart.addtocartbutton();

		System.out.println(driver.getTitle());

		 Assert.assertTrue(true,driver.getTitle());
		
	}
}
