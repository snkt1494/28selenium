package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex2_Alertpopup {
           public static void main(String[] args) {
			
        	   WebDriver driver=new ChromeDriver();
        	  
        	  driver.manage().window().maximize();
        	   
        	  driver.get( "https://demo.Guru99.com");
        	   
        	  driver.findElement(By.xpath(" //input[@name='emailid']")).sendKeys("111");
        	   
        	 driver.findElement(By.xpath(" //input[@name='btnLogin']")).click();
        	   
        	        //  String text = driver.switchTo().alert().getText();
        	        //     System.out.println("text");
        	         //    String text = driver.switchTo().alert().getText();
        	           // System.out.println(text);
        	             
        	         //    driver.switchTo().alert().dismiss();

        	         //    driver.switchTo().alert().accept();

        	        //     driver.switchTo().alert().accept();
           }
	
	
}
