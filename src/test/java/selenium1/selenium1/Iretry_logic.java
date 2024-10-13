package selenium1.selenium1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretry_logic implements IRetryAnalyzer  {
	int count=0;
	int retry=1;
	@Override
	public boolean retry(ITestResult result) {

		
           if(count<retry)
			{
				
				count++;
				
				return true;
			}
        System.out.println(count);
			return false;
		
		
	        }}