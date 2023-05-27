package HandlingMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3 {
         public static void main(String[] args) throws InterruptedException {
			
        	   WebDriver driver=new ChromeDriver();
        	   driver.get("file:///F:/V.CLASS/AUTOMATIN%20TESTING/HTML/checkbox.html  ");
        	   
        	   List<WebElement> allcheckbox = driver.findElements(By.xpath(" //input [@type='checkbox']"));
        	   
        	     System.out.println(allcheckbox.size());
        	     
        	     for(WebElement s1:allcheckbox)
          	   {
          		   s1.click();
          		   Thread.sleep(500);
          		   
          	   }
        	     
        	     
        	             
        for(int i=allcheckbox.size()-1; i>=0; i--)
        {
        	allcheckbox.get(i).click();
        	Thread.sleep(500);
        }
           
        	     
         }
} 

        
        
		

