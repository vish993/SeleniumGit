package teatNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class BeforeAfterStudy {
	@Test
	public void validateUserID()
	{
	Reporter.log("User ID is validated",true);
	}

	@BeforeMethod
	public void login()
	{
	Reporter.log("Login done",true);
	}

	@AfterMethod
	public void logout()
	{
	Reporter.log("Log out done",true);
	}

}
