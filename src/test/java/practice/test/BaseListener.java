package practice.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class BaseListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"isStarting");
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"has passed");
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			System.out.println(result.getMethod()+"has failed");
			System.out.println("ScreenShot");
		}
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+"has skipped");
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}