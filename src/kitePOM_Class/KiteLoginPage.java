package kitePOM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
	//declaration
	@FindBy(id="userid") private WebElement UserID;
	@FindBy(id="password") private WebElement PassWord;
	@FindBy(xpath= "//button[@type='submit']") private WebElement LoginButton;
	
	//initialization
	public KiteLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);

	}
	
	//usage
	
	public void sendUserID(String UN)
	{
		UserID.sendKeys(UN);
	}
	public void sendPassword(String PWD)
	{
		PassWord.sendKeys(PWD);
	}
	public void clickLoginBttn()
	{
		LoginButton.click();
	}

}
