package selenium1.selenium1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcas15_Amazon_cart_without_login  extends Launch_quit {

	@Test (retryAnalyzer=selenium1.selenium1.Iretry_logic.class)
	public void addtocart() throws InterruptedException {

		Amazon_cart_without_login ac=new Amazon_cart_without_login(driver);
		
		ac.search();
		ac.product();
		ac.addtocart(driver);

		System.out.println(driver.getTitle());


		Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");
}}
