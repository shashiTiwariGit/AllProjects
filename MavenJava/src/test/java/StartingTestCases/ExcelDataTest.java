package StartingTestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataTest {

	public static void main(String[] args) throws IOException {

		ArrayList<String> testData = getValuesFromExcel("TestData", "Data1", "etdsa");
		System.out.println(testData);

	}

	public static ArrayList getValuesFromExcel(String sheetName, String headerColumnName, String coulumnRespectiveValue)
			throws IOException {

		// Create object of XSSF Work Book class
		// Get access to sheet
		// Identify Test cases column
		// Scan Test cases column and Search for Purchase Test case
		// Pull all the data for Purchase test case data
		// Get access of all the row
		FileInputStream fis = new FileInputStream("D:\\Training\\Workspace\\MavenJava\\TestData\\DataDemo.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		ArrayList<String> a = new ArrayList<String>();
		int countOfSheet = workBook.getNumberOfSheets();
		int coulumn = 0;

		for (int i = 0; i < countOfSheet; i++) {
			if (workBook.getSheetAt(i).getSheetName().equals(sheetName)) {
				int k = 0, l = 0;
				XSSFSheet sheet = workBook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();
				Iterator<Cell> cells = firstRow.cellIterator();
				while (cells.hasNext()) {
					Cell value = cells.next();

					if (value.getStringCellValue().equals(headerColumnName)) {
						coulumn = k;
					}
					k++;
				}
				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(coulumn).getStringCellValue().equalsIgnoreCase(coulumnRespectiveValue)) {
						Iterator<Cell> cv = r.cellIterator();
						Cell c = cv.next();
						while (cv.hasNext()) {
							a.add(c.getStringCellValue());
						}

					}

				}
			}

		}
		return a;
	}
}
