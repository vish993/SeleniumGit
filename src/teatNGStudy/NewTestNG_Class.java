package teatNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestNG_Class 
{
  @Test
  public void tetNG_test() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
  }
}
