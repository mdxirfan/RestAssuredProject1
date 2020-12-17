package utils;

public class ExcelXLSFormat {
	
	public static void main(String[] args) {
		
		String excelPath = "./data/TestData.xls";
		String sheetName = "Sheet1";
		ExcelUtilsXLSFormat excel = new ExcelUtilsXLSFormat(excelPath, sheetName);
		
		excel.getRowCount();
		excel.getCellData(1,0);
		excel.getCellData(1,1);
		excel.getCellData(1,2);
	}

}
