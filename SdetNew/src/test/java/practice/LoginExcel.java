package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LoginExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./data/Testdataexcel.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int lastrow = sh.getLastRowNum();
	
		for(int i=0; i<=lastrow; i++)
		{
		Row row = sh.getRow(i);
		Cell cell = row.getCell(0);
		Cell cell2= row.getCell(1);
		String cellvalue = cell.getStringCellValue();
        System.out.println(cellvalue);
		String cellvalue2 = cell2.getStringCellValue();
        System.out.println(cellvalue2);
		}


	}

}
