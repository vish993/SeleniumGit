package javaScriptExecutor;

import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickSrollWithJavaScript 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{	
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get("https://vctcpune.com/");
	Thread.sleep(1000);
	JavascriptExecutor JE = (JavascriptExecutor)driver;
	JE.executeScript("window.scrollBy(10,800)");
	//WebElement text = driver.findElement(By.xpath("//*[@id=\"gsc-i-id1\"]"));
	JE.executeScript("document.getElementByxpath('//*[@id=\\\"gsc-i-id1\\\"]').value='testuser'");
	}
}
