package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
  @Parameters("browsername")
	@Test
  public void crossbrwserTest(String Bname) 
  {
  WebDriver driver=null;
  if(Bname.equals("chrome"))
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
	  driver= new ChromeDriver();
  }
  else if (Bname.equals("firefox"))
  {
	  System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\selenium-java-4.2.2\\geckodriver.exe");
	  driver= new FirefoxDriver();
  }
  driver.manage().window().maximize();
  driver.get("https://www.facebook.com/");
  }  
}
