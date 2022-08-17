package kitePOM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{
	//declaration
	@FindBy(id="pin") private WebElement Pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement ClickContinue;
	
	//initialize
	public KitePinPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
	
	public void sendPIN(String PIN)
	{
		Pin.sendKeys(PIN);
	}
	
	public void ContinueButtonClick()
	{
		ClickContinue.click();
	}

}
