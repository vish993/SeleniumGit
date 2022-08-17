package kiteBaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Base 
{
	protected static WebDriver driver;
	public void openApp()
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
	driver=new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	Reporter.log("Launching Kite in Browser", true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	public static void captureScreenshot( String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dst = new File("E:\\Selenium\\Snapshots\\snap_"+TCID+".png");
		FileHandler.copy(src, dst);
		Reporter.log("Screenshot has taken", true);	
	}
}
