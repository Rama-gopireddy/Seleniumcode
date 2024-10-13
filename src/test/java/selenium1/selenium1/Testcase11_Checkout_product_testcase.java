package selenium1.selenium1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase11_Checkout_product_testcase extends Launch_quit {

	@Test (retryAnalyzer=selenium1.selenium1.Iretry_logic.class)
	public void product_checkout() throws InterruptedException, EncryptedDocumentException, IOException {

		Amazon_homepage hp = new Amazon_homepage(driver);
		hp.accountandlist(driver);
		hp.signin();

		Amazon_login_correct_credentials lp = new Amazon_login_correct_credentials(driver);
		lp.valid();
		lp.login();

		Amazon_searchresult sr = new Amazon_searchresult(driver);
		sr.search();

		Product_Description p1 = new Product_Description(driver);
		p1.product(driver);

		product_wishlist wish = new product_wishlist(driver);
		wish.addwishlist(driver);

		Amazon_addtocart_from_productpage adcart = new Amazon_addtocart_from_productpage(driver);

		adcart.addtocartbutton();

		Checkout_product cp = new Checkout_product(driver);

		cp.payment(driver);

		cp.card_details();

		cp.dropdown(driver);

		cp.entercvv(driver);

		System.out.println(driver.getTitle());


		Assert.assertEquals(driver.getTitle(), "Amazon.in Checkout");

	}
}
