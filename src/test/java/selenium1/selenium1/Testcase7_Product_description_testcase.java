package selenium1.selenium1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Testcase7_Product_description_testcase extends Launch_quit{

@Test(retryAnalyzer=selenium1.selenium1.Iretry_logic.class)
public void product_details() throws InterruptedException, EncryptedDocumentException, IOException{
	
	Amazon_homepage hp=new Amazon_homepage(driver);
	  hp.accountandlist(driver);
	  hp.signin();
	  
	  Amazon_login_correct_credentials lp= new Amazon_login_correct_credentials(driver);
	  lp.valid();
	  lp.login();
	  
	  Amazon_searchresult sr= new Amazon_searchresult(driver);
	  sr.search();
	
	  Product_Description product =new Product_Description(driver);
	product.product(driver);
	
	System.out.println(driver.getTitle());
	
	

	
	
	

}}
