package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getNumericdata {
	
		   public static void main(String[] args) throws EncryptedDocumentException, IOException {
			  FileInputStream file=new FileInputStream("F:\\\\V.CLASS\\\\28 jan selenium.xlsx ");
			//double value = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(1).getNumericCellValue();
			//  System.out.println(value);
			  
			boolean value = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(2).getBooleanCellValue();
			 System.out.println(value);
			  
			  
			  
			  
}
}
