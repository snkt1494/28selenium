
	
	package Framework;

	import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
	import java.util.ArrayList;
	import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import org.openqa.selenium.interactions.Actions;

	
		public class Ex_2WithDDF {	

		public static void main(String[] args ) throws InterruptedException, EncryptedDocumentException, IOException {
			
			FileInputStream file= new FileInputStream("F:\\V.CLASS\\28 jan selenium.xlsx");
			Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
			
			
			
			
			
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
	     	driver.get("https://www.policybazaar.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			
			//click on sign in Button
		   driver.findElement(By.xpath("// a [text ( )='Sign in'] ")).click();
		   
		   //enter on mobile number
		   String mobno = sh.getRow(0).getCell(0).getStringCellValue();
		   driver.findElement(By.xpath(" ( //input[@type='number']  )[2]  ")).sendKeys(" mobno ");
		   
		   //click on sign in
		   
		   driver.findElement(By.xpath("(//span[ text ( )='Sign in with Password'] )[2] ")).click();
		   Thread.sleep(2000);
		   
		   // click on password 
		       String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		   driver.findElement(By.xpath("// input[@ type='password'] ")).sendKeys("pwd  ");
		   Thread.sleep(2000);
		   //click on sign in button
		   
		   driver.findElement(By.xpath("// span[ text ( )='Sign in']  ")).click();
		   
		   Thread.sleep(2000);
		   
		   
		    WebElement MyAcc = driver.findElement(By.xpath("//div [@ class='userprofile'] "));
		   Actions act=new  Actions(driver);
		   act.moveToElement(MyAcc).perform();
		   Thread.sleep(2000);
		
		   //click on my profile
	         
		  driver.findElement(By.xpath(" // span[contains(text(),'My profile')]  ")).click();
		  Thread.sleep(2000);
		   
		 // Switch to child window
		  
		Set<String> allids = driver.getWindowHandles();
		  ArrayList<String> a1=new ArrayList<String>(allids);
		  driver.switchTo().window(a1.get(1));
		  
		  //get full name
		  
		 String actText= driver.findElement(By.xpath("//input [@name='personName']  ")).getAttribute("value");
	                 String expText = sh.getRow(0).getCell(2).getStringCellValue();
		  
		  if(actText.equals(expText))
		  {
			  System.out.println("TC pass");
		  }
		  else
		  {
			  System.out.println("TC Fail");
		  }  
			  
			  Thread.sleep(2000);
			  
			  driver.quit();
			  
			  
			  
			  
			  
		  
		  
		
		}
	
	
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


