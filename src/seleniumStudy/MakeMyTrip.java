package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		//driver.findElement(By.linkText("https://www.makemytrip.com/homestays/")).click();
		//driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chHomestays']")).click();

		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
	Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("9730985346");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		
		
		
		
		
		
		
		

//		// find element by using text
//	//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("9730985346");
//	//	Thread.sleep(2000);
//		
//		WebElement Continue = driver.findElement(By.xpath("//button[@class='capText font16']"));
//		Thread.sleep(2000);
//		boolean result = Continue.isEnabled();
//		Thread.sleep(2000);
//		System.out.println("Continue button is enabled "+result);
//
//		if(result)
//		{
//			System.out.println("Continue button is enabled "+result);
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//button[@class='capText font16']")).click();
//
//		}
//		else
//		{
//
//			Thread.sleep(1000);
//
//			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("9730985346");
//			
//			Thread.sleep(1000);
//
//			driver.findElement(By.xpath("//button[@data-cy='continueBtn']")).click();
//
//		}
////		Thread.sleep(5000);
////
////		String title = driver.getTitle();
////		System.out.println("The title of webpage is "+title);
////		String url = driver.getCurrentUrl();
////		System.out.println("The URL of webpage is "+url);


	}

}
