package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex4 {
	
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
    List<WebElement> selectalloptions = s.getAllSelectedOptions();
		      
		      for(WebElement s1:selectalloptions)
		      {
		    	  System.out.println(s1.getText());
		    	  
		      }
		  int size = selectalloptions.size();
		   System.out.println(size);   
	 }	      
}
