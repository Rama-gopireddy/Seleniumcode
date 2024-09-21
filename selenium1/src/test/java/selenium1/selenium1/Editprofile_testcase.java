package selenium1.selenium1;

import org.testng.annotations.Test;

public class Editprofile_testcase extends Launch_quit{
	
	
	
	@Test
	public void loginsecurity()
	
	{
		
		Youraccount_home_editprofile yd=new Youraccount_home_editprofile(driver);
		yd.accountandlist(driver);
		
		
		yd.signin();
		
		Amazon_login_correct_credentials lg= new Amazon_login_correct_credentials(driver);
		
		lg.login();
		
		Editprofile_loginsecurity el=new Editprofile_loginsecurity(driver);
		el.loginandsecurity();
		
		
		
		
		
		
		
	}

}
