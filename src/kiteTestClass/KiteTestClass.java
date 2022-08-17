package kiteTestClass;

import org.testng.annotations.Test;

import kiteBaseClass.Base;
import kitePOM_Class.HomePage;
import kitePOM_Class.KiteLoginPage;
import kitePOM_Class.KitePinPage;
import kiteUtility.UtilityClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
@Listeners(kiteUtility.Listener.class)
public class KiteTestClass extends Base implements ITestListener
{
	KiteLoginPage login;
	KitePinPage pin;
	HomePage home;
	@BeforeClass
	public void launchBrowser()
	{
		openApp();
		login = new KiteLoginPage(driver);
		pin =new KitePinPage(driver);
		home =new HomePage(driver);
		
	}
	@BeforeMethod
	public void loginToKite() throws EncryptedDocumentException, IOException
	{
		login.sendUserID(UtilityClass.dataFromProperties("UN"));
		Reporter.log("Sending User ID", true);
		
		login.sendPassword(UtilityClass.dataFromProperties("PWD"));
		Reporter.log("Sending Password", true);
		
		login.clickLoginBttn();
		Reporter.log("Clicking Login Button", true);
		UtilityClass.waits(driver, 1000);
		
		pin.sendPIN(UtilityClass.dataFromProperties("PIN"));
		Reporter.log("Sending PIN", true);
		pin.ContinueButtonClick();
		Reporter.log("Clicking on continue Button", true);
		UtilityClass.waits(driver, 1000);
	}
	
	@Test
	public void ValidateKiteUserID() throws EncryptedDocumentException, IOException
	{
		//String TCID="1234";
		Assert.assertEquals(home.getActualUserID1(), UtilityClass.dataFromProperties("UN1"), 
				"TC failed, Actual User ID is Not Equals Expected");
		Reporter.log("Validating UserID", true);
		//UtilityClass.captureScreenshot(driver, TCID);	
	}
	
	@AfterMethod
	
	public void logoutKiteApp()
	{
		home.logout();
		Reporter.log("Clicking on Logout Button", true);
		UtilityClass.waits(driver, 1000);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		Reporter.log("Closing browser", true);
	}
 
 
}
