package testKite;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteWit_Exceel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium-java-4.2.2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		WebElement UserID = driver.findElement(By.id("userid"));
		WebElement PassWord = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		File myfile=new File("E:\\Selenium\\My File.xlsx");
		Workbook MyWorkbook = WorkbookFactory.create(myfile);
		Sheet mySheet = MyWorkbook.getSheet("Sheet2");
		String UID = mySheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		UserID.sendKeys(UID);
		PassWord.sendKeys(PWD);
		LoginButton.click();
		Thread.sleep(1000);

		WebElement enterPIN = driver.findElement(By.id("pin"));
		WebElement LoginButtn = driver.findElement(By.xpath("//button[@type='submit']"));
		enterPIN.sendKeys(PIN);
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
