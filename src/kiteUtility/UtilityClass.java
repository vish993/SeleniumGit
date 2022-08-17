package kiteUtility;

//import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.WebDriver;

public class UtilityClass 
{
	//method to call login credentials from excel sheet
//	public static String dataFromExcel(int rowNo, int cellNO) throws EncryptedDocumentException, IOException
//	{
//		File myFile = new File("E:\\Selenium\\My File.xlsx");
//		String value = WorkbookFactory.create(myFile).getSheet("Sheet3").getRow(rowNo).getCell(cellNO).getStringCellValue();
//		return value;	
//	}
	
	public static String dataFromProperties(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myFile=new FileInputStream("C:\\Users\\VISH\\eclipse-workspace\\SeleniumNew\\MyProperty.properties");
		prop.load(myFile);
		String value = prop.getProperty(key);
		return value;
	}
	
	
	
	public static void waits(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}

}
