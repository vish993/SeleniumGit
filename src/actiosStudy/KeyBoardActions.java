package actiosStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/?rs=2");
		
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		Thread.sleep(1000);

		WebElement day = driver.findElement(By.id("day"));
		Thread.sleep(1000);

		act.click(day).perform();
		Thread.sleep(1000);
		for (int i=1;i<=3;i++)
		{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		act.click().perform();
		WebElement month = driver.findElement(By.id("month"));
		Thread.sleep(1000);

		act.click(month).perform();
		Thread.sleep(1000);
		for (int i=1;i<=5;i++)
		{
		act.sendKeys(Keys.ARROW_UP).perform();
		}
		act.click().perform();
		act.click().perform();
		WebElement year = driver.findElement(By.id("year"));
		Thread.sleep(1000);

		act.click(year).perform();
		Thread.sleep(1000);
		for (int i=1;i<=29;i++)
		{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		act.click().perform();

		
	}

}
