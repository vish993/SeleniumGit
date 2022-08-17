package excelEditFromCode;

import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData 
{

	public static void main(String[] args) throws IOException
	{
		String path = "E:\\Selenium\\DataThroughCode.xlsx";
		FileOutputStream file=new FileOutputStream(path);
		
		try (XSSFWorkbook workbook = new XSSFWorkbook()) {
			XSSFSheet sheet = workbook.createSheet("StudentInfo");
			String [][] table= {{"First Name", "Last Name","Designation"},
									{"Vishal","Date","Senior QA"},
									{"Mayur","Lambat","QA"},
									{"Rahul","Sidnale","QA Team Lead"}};
			int rows = table.length;
			int cell = table[0].length;
			
			
			
			for (int i=0;i<rows;i++)
			{
				 XSSFRow row = sheet.createRow(i);
				 for (int j=0;j<cell;j++)
				 {
					 XSSFCell colm = row.createCell(i);
					String value = table[i][j];
					colm.setCellValue(value);
				 }
			}
			
			workbook.write(file);
		}
		file.close();
		}
	}


