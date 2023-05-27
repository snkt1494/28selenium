package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex5_getalldataprint {
	 public static void main(String[] args) throws EncryptedDocumentException, IOException {
		  FileInputStream file=new FileInputStream("F:\\\\V.CLASS\\\\28 jan selenium.xlsx ");
	            Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
	           int lastrowno = sh.getLastRowNum();
	           for (int i = 0; i<=lastrowno; i++)
	           {
	        	int lastcell = sh.getRow(i).getLastCellNum()-1;
	        	for(int j = 0;j<=lastcell; j++)
	        	{
	        		String value = sh.getRow(i).getCell(j).getStringCellValue();
	        		
					System.out.print(value+" ");
	        	}
	        	System.out.println();
	           }		   
	        			   
	        			   
	        			   
	        			   
	        		   
	           

}
}