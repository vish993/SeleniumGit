package seleniumStudyacd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makeMyTrip 
{
	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Vishal Date\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		Thread.sleep(2000);

		// find element by using text
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("9730985346");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-cy='continueBtn']")).click();

		

	}

}
