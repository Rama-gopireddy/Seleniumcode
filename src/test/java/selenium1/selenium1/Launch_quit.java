package selenium1.selenium1;

import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@Listeners(selenium1.selenium1.Listenrs_class.class)

public class Launch_quit extends Listenrs_class{
	

	@BeforeMethod
	//@Parameters("browser")
	public void launch() {
		
		/*if(nameofbrowser.equals("chrome"))
		{
			 driver =new ChromeDriver();
		}
		
		if(nameofbrowser.equals("edge"))
		{
			 driver =new EdgeDriver();
		}	
		//ITestListner.driver=driver;*/
		
	driver=new ChromeDriver ();
	driver.get("https://www.amazon.in/");
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@AfterMethod
	public void quit() throws InterruptedException
	{
		
		Thread.sleep(2000);		
		//driver.quit();
	

}}
