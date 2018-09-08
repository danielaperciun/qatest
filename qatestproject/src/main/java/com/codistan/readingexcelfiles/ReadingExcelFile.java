package com.codistan.readingexcelfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

	public static void main(String[] args) throws Exception {
	
		File src = new File (System.getProperty("user.dir")+"\\src\\test\\resources\\ExcelFiles\\excelapachepoi.xlsx");
		//First Step with File Class is just to show location
		
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		String rowZero = sheet.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(rowZero);
		
	}

}
