package assertStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NullNotNullExcel {
  @Test
  public void nullWithExcell() throws EncryptedDocumentException, IOException {
	  File myfile=new File("E:\\Selenium\\My File.xlsx");
		Workbook MyWorkbook = WorkbookFactory.create(myfile);
		Sheet mySheet = MyWorkbook.getSheet("Sheet1");
		String value = mySheet.getRow(1).getCell(0).getStringCellValue();
		//System.out.println(value);
		Assert.assertNull(value);
  }
}
