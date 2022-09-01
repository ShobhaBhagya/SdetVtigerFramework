package comcast.vtiger.genericUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel_Utility {
	

	/**
	 * This method is used to fetch the data from excel
	 * @param sheetName
	 * @param RowNum
	 * @param cellNum
	 * @return
	 * @throws Throwable
	 * @author Bhargavi
	 */
	public String getDataFromExcel(String sheetName, int RowNum, int cellNum) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./data/VtigerTestdata.xlsx");
	    Workbook book= WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
	Row row = sheet.getRow(RowNum);
		Cell cell = row.getCell(cellNum);
		String data = cell.getStringCellValue();
	return data;
	
		//DataFormatter format= new DataFormatter();
		//return format.formatCellValue(book.getSheet(sheetName).getRow(RowNum).getCell(cellNum));
	}

}
