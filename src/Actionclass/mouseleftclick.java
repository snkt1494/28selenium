package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseleftclick {
     public static void main(String[] args) throws InterruptedException {
		
    	 
    	 
    	   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		driver.get("  https://flipkart.com/");
	   
		
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath( " //button[@ class='_2KpZ6l _2doB4z' ] ")).click();
		
		Thread.sleep(2000);
		
	 WebElement cart = driver.findElement(By.xpath("//span[text()='cart']  "));
	
	  
	                            
	          Actions   act   =new   Actions(driver);
    	 act.click(cart).perform();
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	}
}
