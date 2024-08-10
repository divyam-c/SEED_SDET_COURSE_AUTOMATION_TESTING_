package DAY_10;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D12_WriteToExcel // using set
{
	String fpath = "\"E:\\Seed Infotech\\SEED_SDET_COURSE_AUTOMATION_TESTING\\SEED_SDET_COURSE_AUTOMATION_TESTING\\src\\main\\java\\New Microsoft Excel Worksheet.xlsx\"";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
  @Test
  public void f() 
  {
	  row = sheet.createRow(0);
	  cell = row.createCell(0);
	  cell.setCellValue("Name");
	  cell = row.createCell(1);
	  cell.setCellValue("Surname");	 
	  
	  row = sheet.createRow(1);
	  cell = row.createCell(0);
	  cell.setCellValue("Dewashree");
	  cell = row.createCell(1);
	  cell.setCellValue("Shendye");	 
	  
	  row = sheet.createRow(2);
	  cell = row.createCell(0);
	  cell.setCellValue("Shweta");
	  cell = row.createCell(1);
	  cell.setCellValue("Bedekar");
	  
	  row = sheet.createRow(3);
	  cell = row.createCell(0);
	  cell.setCellValue("Harshada");
	  cell = row.createCell(1);
	  cell.setCellValue("Kale");
  }
  @BeforeTest
  public void beforeTest() throws Exception 
  {
	  file = new File(fpath);
	  fos = new FileOutputStream(file);
	  wb = new XSSFWorkbook();
	  sheet = wb.createSheet("Student Data");
  }

  @AfterTest
  public void afterTest() throws IOException 
  {
	  wb.write(fos);
	  wb.close();
	  fos.close();
  }

}