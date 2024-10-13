package selenium1.selenium1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase5_6_Search_result_testcase extends Launch_quit{
	
	@Test(retryAnalyzer=selenium1.selenium1.Iretry_logic.class)
	  public void login_buttion() throws InterruptedException, EncryptedDocumentException, IOException{
			
			
	  Amazon_homepage hp=new Amazon_homepage(driver);
	  hp.accountandlist(driver);
	  hp.signin();
	  
	  Amazon_login_correct_credentials lp= new Amazon_login_correct_credentials(driver);
	  lp.valid();
	  lp.login();
	  
	  Amazon_searchresult sr= new Amazon_searchresult(driver);
	  sr.search();
	  
	 Searching_with_filters  sf=new Searching_with_filters (driver);
	  sf.select();
	  sf.catego();
	  sf.brandname();
	  sf.pricerange();
	
	  System.out.println(driver.getTitle());
	  
	 
	 
			
	

}}
