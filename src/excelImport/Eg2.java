package excelImport;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("E:\\Selenium\\My File.xlsx");
		Workbook MyWorkbook = WorkbookFactory.create(myfile);
		Sheet mySheet = MyWorkbook.getSheet("Sheet1");
		int totalRows = mySheet.getLastRowNum();
		int totalCells = mySheet.getRow(0).getLastCellNum()-1;
		
		for (int i=0;i<=totalRows;i++)
		{
			for(int j=0;j<= totalCells;j++)
			{
				
			}
		}

	}

}
