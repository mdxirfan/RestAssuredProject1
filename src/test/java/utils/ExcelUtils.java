package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

//	String excelPath = "./data/TestData.xlsx";
//	XSSFWorkbook workBook = new XSSFWorkbook(excelPath);
//	XSSFSheet sheet = workBook.getSheet("Sheet1");

	public ExcelUtils(String excelPath, String sheetName) {
		try {

			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}

//	public static void main(String[] args) {
//
//		getRowCount();
//		getCellData();
//	}

	public static void getRowCount() {
		try {
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Total Number of Rows :-" + rowCount);

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void getCellData(int rowNum, int colNum) {
		try {

			DataFormatter formatter = new DataFormatter();

			Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));

			// String value = sheet.getRow(1).getCell(2).getStringCellValue();
			// double value = sheet.getRow(1).getCell(2).getNumericCellValue();

			System.out.println("Cell Value :- " + value);

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

}
