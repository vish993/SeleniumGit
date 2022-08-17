package findElementsUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebpage 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links present on google HomePage are "+links.size());
		
		//to find the links present
		
		for( WebElement l:links)
		{
			System.out.println(l.getText());
		}
		
		
		

	}

}
