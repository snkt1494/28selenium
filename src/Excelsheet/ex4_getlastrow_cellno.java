package Excelsheet;  // ROW SIZE IN A SHEET,COLUMN SIZE IN A SHEET,GET ALL ROW&CLM DATA

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex4_getlastrow_cellno {
	 public static void main(String[] args) throws EncryptedDocumentException, IOException {
		  FileInputStream file=new FileInputStream("F:\\\\V.CLASS\\\\28 jan selenium.xlsx ");
	            Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
                      //  int lastcallindex = sh.getRow(0).getLastCellNum()-1;
	                       int lastrowindex = sh.getLastRowNum();
                        
                   //     for(int i=0; i<=lastcallindex; i++)
                   //     {
                   //     	String value = sh.getRow(0).getCell(i).getStringCellValue();  //find cell all dataa
                   //     	System.out.println(value+" ");
                  //      }
                        
                        for(int i=0; i<=lastrowindex; i++)
                        {
                        	String value = sh.getRow(i).getCell(0).getStringCellValue();  //find row all dataa
                        	System.out.println(value);
                        }
                        
                        
                        
}
}