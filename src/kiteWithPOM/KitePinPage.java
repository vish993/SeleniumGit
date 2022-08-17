package kiteWithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{
	//declaration
	@FindBy(id="pin") private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']") private WebElement ClickContinue;
	
	//initialize
	public KitePinPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
	
	public void sendPIN()
	{
		PIN.sendKeys("982278");
	}
	
	public void ContinueButtonClick()
	{
		ClickContinue.click();
	}

}
