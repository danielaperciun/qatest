package com.codistan.readingexcelfiles;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingAnExcelFile {
	

	public static void main(String[] args) throws Exception {

	File src = new File (System.getProperty("user.dir")+"\\src\\test\\resources\\ExcelFiles\\usernameandpassword.xlsx");
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet = wb.getSheetAt(0);
	
	String rowZero = sheet.getRow(1).getCell(1).getStringCellValue();
	int value = (int) sheet.getRow(1).getCell(1).getNumericCellValue();
	
	System.out.println(rowZero);
	System.out.println(value);
	
}
}