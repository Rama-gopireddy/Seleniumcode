package selenium1.selenium1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase1_Amazon_register_new_user extends Launch_quit {

	@Test(retryAnalyzer = selenium1.selenium1.Iretry_logic.class)
	public void registration() {

		Amazon_homepage_register_newuser hp = new Amazon_homepage_register_newuser(driver);
		hp.accountandlist(driver);

		Amazon_register_new_user rg = new Amazon_register_new_user(driver);
		rg.register();

		System.out.println(driver.getTitle());

		Assert.assertEquals(driver.getTitle(), "Authentication required");

	}
}
