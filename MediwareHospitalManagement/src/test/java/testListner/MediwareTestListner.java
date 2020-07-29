package testListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MediwareTestListner implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Success of test cases and its details are : " + result.getName());
	}

	
	public void onTestSuccess(ITestResult result) {

		System.out.println("Passed Test cases and its details are " + result.getName());
	}


	public void onTestFailure(ITestResult result) {

		System.out.println("Failure of test cases and its details are : " + result.getName());
	}

	
	public void onTestSkipped(ITestResult result) {

		System.out.println("Skip of test cases and its details are : " + result.getName());
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("Failure of test cases and its details are : " + result.getName());
	}


	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}
