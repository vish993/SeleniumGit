package kiteWithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMexecution {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		KiteLoginPage KLP=new KiteLoginPage(driver);
		KitePinPage KP=new KitePinPage(driver);
		HomePage HP=new HomePage(driver);
		
		Thread.sleep(1000);
		KLP.sendUserID();
		KLP.sendPassword();
		KLP.login();
		Thread.sleep(1000);

		KP.sendPIN();
		
		KP.ContinueButtonClick();
		Thread.sleep(2000);

		HP.IDCheck();
		Thread.sleep(1000);

		HP.logout();
		
		driver.close();
		
		
	}

}
	