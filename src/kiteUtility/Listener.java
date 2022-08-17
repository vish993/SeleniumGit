package kiteUtility;


import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteBaseClass.Base;

public class Listener implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("TC is started "+result.getName(), true);
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		try {
			Base.captureScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("TC is Successful "+result.getName(), true);

	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("TC is Skipped "+result.getName(), true);

	}
	

}
