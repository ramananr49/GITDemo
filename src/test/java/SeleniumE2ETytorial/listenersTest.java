package SeleniumE2ETytorial;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;

public class listenersTest implements ITestListener{
	
	Base B= new Base();
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			B.takeScrshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			B.takeScrshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testmain()
	{
		
	}
	
	public void testmasn()
	{
	}
	
	public void Messagman()
	{
	}

		

}
