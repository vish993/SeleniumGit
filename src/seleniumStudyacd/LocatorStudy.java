package seleniumStudyacd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStudy 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Vishal Date\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		
//		// find element by using text
//		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
//		Thread.sleep(1000);
//		
		// find element by using attribute
		driver.findElement(By.xpath("//div[@id='signin-block']")).click();
		Thread.sleep(2000);

		// find element by using text
		driver.findElement(By.xpath("//div[@id='hc']")).click();
		Thread.sleep(5000);
		 WebElement text = driver.findElement(By.xpath("//div[@class='new-signin-header m-l-44']"));
		 System.out.println(text);
		//driver.findElement(By.xpath("//div[@class='nsm7Bb-HzV7m-LgbsSe-MJoBVe'][1]")).click();
		// boolean result = driver.findElement(By.xpath("//input[@type='number']")).isEnabled();
		// System.out.println(result);
	

		
		//WebElement OTP = driver.findElement(By.xpath("//div[@id='otp-container']"));
		//Thread.sleep(2000);

//		boolean result = OTP.isEnabled();
//		if (result)
//		{
////			WebElement MobNumFeild = driver.findElement(By.xpath("//input[@type='number']"));
////			MobNumFeild.sendKeys("9999999999");
////			OTP.click();
//			System.out.println("OTP button is disabled. Please enter valid phone number");
//		
//		}
//		else
//		{
//			
//		}
		
		
		

	}

}
