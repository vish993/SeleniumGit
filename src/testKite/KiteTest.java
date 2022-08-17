package testKite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTest 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		WebElement UserID = driver.findElement(By.id("userid"));
		WebElement PassWord = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UserID.sendKeys("ELR321");
		PassWord.sendKeys("Dhana1111");
		LoginButton.click();
		Thread.sleep(1000);
		WebElement PIN = driver.findElement(By.id("pin"));
		WebElement LoginButtn = driver.findElement(By.xpath("//button[@type='submit']"));
		PIN.sendKeys("982278");
		LoginButtn.click();
		Thread.sleep(2000);
		WebElement UserID1 = driver.findElement(By.xpath("//span[@class='user-id']"));
		String ExpectedResult="ELR321";
		String ActualResult = UserID1.getText();
		
		if(ActualResult.equals(ExpectedResult))
		{
			System.out.println("Actual User Id is equals to Expected Used ID hence test case pass");	
		}
		else
		{
			System.out.println("Test Case fails");
		}
		driver.close();

		

	}

}
