package kiteWithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//1. Data member should be declared globally with access level private using @findBy Annotation
	@FindBy(xpath="//span[@class='user-id']") private WebElement UserID;
	@FindBy(xpath="//a[@target='_self']") private WebElement Logout;
	
	
	//2. Initialize within a constructor with access level public using pagefactory
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Utilize within a method with access level public
	
	public void IDCheck()
	{
		String ExpectedResult="ELR321";
		String ActualResult = UserID.getText();
		
		if(ActualResult.equals(ExpectedResult))
		{
			System.out.println("Actual User Id is equals to Expected Used ID hence test case pass");	
		}
		else
		{
			System.out.println("Test Case fails");
		}

	}
	
	public void logout()
	{
		UserID.click();
		Logout.click();
	}
}
