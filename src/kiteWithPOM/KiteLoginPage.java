package kiteWithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
	//declaration
	@FindBy(id="userid") private WebElement UID;
	@FindBy(id="password") private WebElement PWD;
	@FindBy(xpath= "//button[@type='submit']") private WebElement LoginButton;
	
	//initialization
	public KiteLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);

	}
	
	//usage
	
	public void sendUserID()
	{
		UID.sendKeys("ELR321");
	}
	public void sendPassword()
	{
		PWD.sendKeys("Dhana1111");
	}
	public void login()
	{
		LoginButton.click();
	}

}
