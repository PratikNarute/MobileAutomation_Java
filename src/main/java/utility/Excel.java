package utility;


import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class Excel
{
	public static String data;
	public static Cell c;
	public static XSSFCell cell;
	
	public static String importDataFromExcel(String sheet, int row, int cell) throws EncryptedDocumentException, IOException 
	{
		String excelPath = "C:\\Users\\Lenovo\\Desktop\\KOLONIZER\\CRM\\Excel\\Test data for CRM.xlsx";
		FileInputStream file = new FileInputStream(new File(excelPath));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet s=workbook.getSheet(sheet);
				
				 c = s.getRow(row).getCell(cell);
				 CellType dataType=c.getCellType();

					if (dataType==CellType.STRING)
					{
						data=c.getStringCellValue();
					
					}
					else if (dataType==CellType.NUMERIC)
					{
						double dataDouble=c.getNumericCellValue();
						data = String.valueOf(dataDouble);
						
					}
					else if (dataType==CellType.BLANK)
					{
						System.out.println("NULL");
					}
					
					return data;
		}
	
	public static void exportData(String sheetName, int rowNumber, int cellNumber, String data) throws Exception 
	{
		String excelPath = "C:\\Users\\Lenovo\\Desktop\\KOLONIZER\\CRM\\Excel\\Test data for CRM.xlsx";
		FileInputStream file = new FileInputStream(new File(excelPath));
		XSSFWorkbook wb =new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet(sheetName);
		XSSFRow row=sheet.getRow(rowNumber);
	
		if (row==null)
		{
		     cell=sheet.createRow(rowNumber).createCell(cellNumber);
		     cell.setCellValue(data);
		    
		}
		else
		{
			cell = row.getCell(cellNumber);
			if (cell==null)
			{
				cell=row.createCell(cellNumber);
				cell.setCellValue(data);
			}
			else
			{
				cell.setCellValue(data);
			}
					
		}
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		
		fos.close();
		wb.close();
		
	}
//	===============================================================================================================  //
	
	public static String Regression_importDataFromExcel(String sheet, int row, int cell) throws EncryptedDocumentException, IOException 
	{
		String excelPath = "C:\\Users\\Lenovo\\Desktop\\KOLONIZER\\CRM\\Excel\\Regression Test data.xlsx";
		FileInputStream file = new FileInputStream(new File(excelPath));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet s=workbook.getSheet(sheet);
				
				 c = s.getRow(row).getCell(cell);
				 CellType dataType=c.getCellType();

					if (dataType==CellType.STRING)
					{
						data=c.getStringCellValue();
					
					}
					else if (dataType==CellType.NUMERIC)
					{
						double dataDouble=c.getNumericCellValue();
						data = String.valueOf(dataDouble);
						
					}
					else if (dataType==CellType.BLANK)
					{
						System.out.println("NULL");
					}
					
					return data;
		}
	
	public static void Regression_exportData(String sheetName, int rowNumber, int cellNumber, String data) throws Exception 
	{
		String excelPath = "C:\\Users\\Lenovo\\Desktop\\KOLONIZER\\CRM\\Excel\\Regression Test data.xlsx";
		FileInputStream file = new FileInputStream(new File(excelPath));
		XSSFWorkbook wb =new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet(sheetName);
		XSSFRow row=sheet.getRow(rowNumber);
	
		if (row==null)
		{
		     cell=sheet.createRow(rowNumber).createCell(cellNumber);
		     cell.setCellValue(data);
		    
		}
		else
		{
			cell = row.getCell(cellNumber);
			if (cell==null)
			{
				cell=row.createCell(cellNumber);
				cell.setCellValue(data);
			}
			else
			{
				cell.setCellValue(data);
			}
					
		}
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		
		fos.close();
		wb.close();
		
	}
}

		
		
	
		
	


