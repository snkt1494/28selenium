package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex2_multyselectlistbox {

	 public static void main(String[] args) throws InterruptedException{
			
 		WebDriver driver=new ChromeDriver ();
 		driver.get("file:///F:/V.CLASS/AUTOMATIN%20TESTING/HTML/example5.html");
 	  
 	// driver.findElement(By.xpath(" //a[text( )='Create new account']")).click();
 	  
	  Thread.sleep(3000);
 	  
	WebElement selectcountry=driver.findElement(By.xpath("//select[@id='1234']"));
	
	        Select s=new Select( selectcountry);
	       s.selectByVisibleText(" Ind");
	    s.selectByVisibleText("Aus");
	      s.selectByIndex(2);
	        
	      Thread.sleep(3000);
	    s.deselectAll();
	  boolean result = s.isMultiple();
	 System.out.println(result); 
	 
   }
   }

	
	

