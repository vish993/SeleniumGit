package serialParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 
{
  @Test
  public void paytmLaunch() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://paytm.com/");
  }
}
