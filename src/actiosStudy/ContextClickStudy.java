package actiosStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		//create a object of action class
		Actions act=new Actions(driver);
		//find element to be worked and store it 
				
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		//take action
	//	act.moveToElement(rightClick).contextClick().build().perform();
		
		act.contextClick(rightClick).perform();

	}

}
