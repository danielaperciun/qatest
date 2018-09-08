package com.codistan.readingexcelfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File src = new File (System.getProperty("user.dir")+"\\src\\test\\resources\\ExcelFiles\\excelapachepoi.xlsx");
		//First Step with File Class is just to show location
		
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		sheet.getRow(0).getCell(0).setCellValue("Test Passed");
		
		FileOutputStream fos = new FileOutputStream (src);
		
		wb.write(fos);
		
		
	}

}
