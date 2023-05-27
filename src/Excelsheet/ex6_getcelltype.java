package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex6_getcelltype {
	 public static void main(String[] args) throws EncryptedDocumentException, IOException {
		  FileInputStream file=new FileInputStream("F:\\\\V.CLASS\\\\28 jan selenium.xlsx ");
	            Sheet sh = WorkbookFactory.create(file).getSheet("sheet4");
	       //  CellType celltype = sh.getRow(0).getCell(3).getCellType();
	            Cell info = sh.getRow(0).getCell(0);
	      CellType s1 = info.getCellType();
	     System.out.println(info);
}
}