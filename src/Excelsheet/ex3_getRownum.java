package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex3_getRownum {
	 public static void main(String[] args) throws EncryptedDocumentException, IOException {
		  FileInputStream file=new FileInputStream("F:\\\\V.CLASS\\\\28 jan selenium.xlsx ");
		  
		   //  int rowsize = WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum()+1;
		    //     System.out.println(rowsize);
		         
		     short value = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getLastCellNum();
		         System.out.println(value);
}
}