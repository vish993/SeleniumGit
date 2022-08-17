package actiosStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDropStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		//act.dragAndDrop(src, target).perform();
		
		act.clickAndHold(src).moveToElement(target).release().build().perform();
		
		
		
	}

}
