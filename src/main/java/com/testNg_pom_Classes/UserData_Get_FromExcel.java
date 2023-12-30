package com.testNg_pom_Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class UserData_Get_FromExcel {
	
	public void dataFromExcel() throws IOException {
		File file = new File("D:\\AutomationTraining\\TestNg_Demo\\UserData\\LoginTestData.xls");
		FileInputStream fis = new FileInputStream(file);		
		HSSFWorkbook workbook1 = new HSSFWorkbook(fis);		
		HSSFSheet sheet1= workbook1.getSheet("SignUp Data");
		HSSFRow row0 = sheet1.getRow(2);		
		
			
			HSSFCell cell0 = row0.getCell(0);		
			final String firstName1 = cell0.getStringCellValue();			
			
			HSSFCell cell1 = row0.getCell(1);		
			final String lastName1 = cell1.getStringCellValue();		
			
			HSSFCell cell2 = row0.getCell(2);		
			final String eMail1 = cell2.getStringCellValue();		
		
			HSSFCell cell3 = row0.getCell(3);		
			final String phoneNum = cell3.getStringCellValue();
		
			HSSFCell cell4 = row0.getCell(4);		
			final String pass1 = cell4.getStringCellValue();		
			
			HSSFCell cell5 = row0.getCell(5);
			final String conf_pass1 = cell5.getStringCellValue();
	}
		
}
			
		

