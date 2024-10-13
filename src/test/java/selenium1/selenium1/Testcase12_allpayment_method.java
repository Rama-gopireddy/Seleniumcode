package selenium1.selenium1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Testcase12_allpayment_method extends Launch_quit {

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

		All_payments_method pm = new All_payments_method(driver);

		pm.paymentmethods(driver);

	}
}
