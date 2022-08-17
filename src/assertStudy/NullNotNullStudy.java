package assertStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NullNotNullStudy {
  @Test
  public void nullNotNull() throws InterruptedException 
  
  
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  
	  WebElement LoginID = driver.findElement(By.xpath("//input[@id='userid']"));
//	  Thread.sleep(1000);
//	  LoginID.sendKeys("AWEFFJ");
	  
	  Assert.assertNull(LoginID);
	  
	  
  }
}
