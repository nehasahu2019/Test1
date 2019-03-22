package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;

import Config.Constant;

public class ExcelUtil {
	Properties prop;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sh;
	
public void Config_Property() throws FileNotFoundException{
	
 prop = new Properties();
File file = new File("./Config/Config.properties");
FileInputStream fis = new FileInputStream(file);

try {
	prop.load(fis);
} catch (IOException e) {
	System.out.println("File is not found");
}

	}
	@BeforeTest
	public String get_Property(String prop_name){
		return prop.getProperty(prop_name);
		
		
	}
	
	
	public void excelConfig(){
		File file = new File("C:/Users/agraw/workspace/FrameWork/Data/data.xlsx");
		try {
			fis = new FileInputStream(file);
			System.out.println("Inside ecel config");
		} catch (FileNotFoundException e) {
			System.out.println(e+"File not loaded in memory");
		}
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			
			System.out.println("Not able to read excel file");
		}
		
	}
	
	public void getExcelDataByROW(int sheetnum){
		excelConfig();
		
		 int rowCount=wb.getSheetAt(sheetnum).getLastRowNum();
		 
		 for(int i=0;i<rowCount;i++){
		 
			String	 id =wb.getSheetAt(sheetnum).getRow(i).getCell(Constant.col_id).getStringCellValue();
				System.out.println(id);
				
				 double pwd =wb.getSheetAt(sheetnum).getRow(i).getCell(Constant.col_pwd).getNumericCellValue();
				System.out.println(pwd);
				
		 }
		
	}
	public void getExcelData(int sheetnum,int row,int col){
		excelConfig();
		
			String	 id =wb.getSheetAt(sheetnum).getRow(row).getCell(col).getStringCellValue();
				System.out.println(id);
				
				// double pwd =wb.getSheetAt(sheetnum).getRow(row).getCell(col).getNumericCellValue();
				//System.out.println(pwd);
				
		 
		
	}	
	
}
