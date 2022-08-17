package seleniumStudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectDeselectStudy 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vishal");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Date");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("vishaldate46@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vishaldate46@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("1234@qwer");
		WebElement day = driver.findElement(By.id("day"));
		Select s1=new Select(day);
		s1.selectByValue("11");
		WebElement month = driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByValue("7");
		WebElement year = driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByValue("1993");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='search'])[1]")).click();
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//i[@data-visualcompletion='css-img'])[1]")).click();
	}
}
