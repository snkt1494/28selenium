package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_xpathbyText {
	public static void main(String[] args) throws   InterruptedException {
		
		
		       WebDriver driver=new ChromeDriver();
		       driver.get(" https://www.facebook.com/");
	
	
	        // driver.findElement(By.xpath("  //a[text( )='Forgotten password?']")).click();     // example by xpath by text
	      //   driver.findElement(By.xpath("  //a[text( )='Create new account']")).click();          // formula- //tagname[text( )='text value']
		       
		       
	      //   driver.findElement(By.xpath("  //a[contains( text( ),'Forgotten') ]")).click();   // example br xpath by contains
	        driver.findElement(By.xpath(" //a[contains( text( ),'new') ]")).click();    // formula - //tagname[contains(text(),'partial text')]
	
 // driver.findElement(By.xpath(" //i[contains( @ class,'sx_69') ] ")).click();  //  example byxpath by contains using attributes
		   
	        // formula -//taname[contains(@attributename,'attribute value')]
		
	   //     Thread.sleep(2000);
	        
	  // driver.findElement(By.xpath("  (//input[@type='text'])[2]" )).sendKeys("ABC");      // example Xpath by index
	                                                                                      // formula - [multiple matching expression][index]
	        
	    //    Thread.sleep(2000);
	        
	    //    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("XYZ");
	        
		       
	}

}
