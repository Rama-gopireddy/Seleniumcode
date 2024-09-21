package selenium1.selenium1;

import org.testng.annotations.Test;

public class Search_result_testcase extends Launch_quit{
	
	@Test
	  public void login_buttion() throws InterruptedException{
			
			
	  Amazon_homepage hp=new Amazon_homepage(driver);
	  hp.accountandlist(driver);
	  hp.signin();
	  
	  Amazon_login_correct_credentials lp= new Amazon_login_correct_credentials(driver);
	  lp.login();
	  
	  Amazon_searchresult sr= new Amazon_searchresult(driver);
	  sr.search();
	  
	  Searching_with_filters  sf=new Searching_with_filters (driver);
	  sf.select();
	  
	  System.out.println(driver.getTitle());
		 
	 //Assert.assertEquals(driver.getTitle(), "Amazon.in : Books");
	 
	 
			
		 

}}
