package selenium1.selenium1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase4_Editprofile_testcase extends Launch_quit {

	@Test (retryAnalyzer = selenium1.selenium1.Iretry_logic.class)
	public void loginsecurity() throws InterruptedException, EncryptedDocumentException, IOException

	{

		Amazon_homepage yd = new Amazon_homepage(driver);
		yd.accountandlist(driver);

		yd.signin();

		Amazon_login_correct_credentials lg = new Amazon_login_correct_credentials(driver);
		lg.valid();
		lg.login();

		Editprofile el = new Editprofile(driver);
		el.manageprofile(driver);

		System.out.println(driver.getTitle());

		Assert.assertEquals(driver.getTitle(), "Profile Hub");

	}

}
