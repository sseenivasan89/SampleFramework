package Helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	public void readExcelData() throws Exception {
		
		FileInputStream ExcelFile = new FileInputStream("InputResource\\Sheet.xlsx");
		// Access the required test data sheet
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet("DataSheet");
		
		int rowCount = ExcelWSheet.getLastRowNum() - ExcelWSheet.getFirstRowNum();
		
		for (int r = 0; r < rowCount + 1; r++) {
			XSSFRow row = ExcelWSheet.getRow(r);
			String SelRow = getCellDataValue(r, 1);
			if (SelRow.contains("Yes")) {
				for (int j = 2; j < row.getLastCellNum(); j++) {
					System.out.println(getCellDataValue(r, j));
				}
				System.out.println();
			}
		}
	}
	
	public String getCellDataValue(int RowNum, int ColNum) throws Exception {

		try {

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			if (Cell.getCellType() == CellType.STRING) {
				return Cell.getStringCellValue();
			}
			else if (Cell.getCellType() == CellType.NUMERIC) {
				return String.valueOf(Cell.getNumericCellValue());
			}
			else if (Cell.getCellType() == CellType.BOOLEAN) {
				return String.valueOf(Cell.getBooleanCellValue());
			}
			else if (Cell.getCellType() == CellType.FORMULA) {
				return String.valueOf(Cell.getCellFormula());
			}

			// String CellData = Cell.getStringCellValue();
			// System.out.println(CellData);

		} catch (Exception e) {

			return "";

		}
		return "Nothing";

	}
}

