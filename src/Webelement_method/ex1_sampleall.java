package Webelement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_sampleall {

	      public static void main(String[] args)throws InterruptedException {
			
	    		WebDriver driver=new ChromeDriver ();
	    		driver.get("https://www.facebook.com/");
	    	  
	    	//  driver.findElement(By.xpath("//input[@name='email']  ")).sendKeys("ABC");
	    	  
	    //	 WebElement UN = driver.findElement(By.xpath("//input[@name='email']  "));
	    //	  UN.sendKeys("ABC");                                                     //-----------------use sendkeys  
	    	  
	   	//  Thread.sleep(2000);
	    //	  UN.clear();                                                         //-------------use clear
	   //   UN.sendKeys("XYZ");
	    	  
	    //	  driver.findElement(By.xpath(" (//a[@role='button'])[2]")).click();
	    //	  Thread.sleep(2000);
	    //	   driver.findElement(By.xpath(" //input[@type='radio'] ")).click();    //---------click
	    	  
	    		// String text;
			// String text = driver.findElement(By.xpath("  //a[text( )='Forgotten password?']")).getText();//------get text
	    	//  String text;
			//System.out.println(text);
	    	             //      boolean Result = driver.findElement(By.xpath("//button[@name='login'] ")).isEnabled();//---isEnabled
	    	         //   System.out.println(Result);
	    //	  if (Result)
	    	//  {   System.out.println("given statment is enabled");
	    	//  }
	    	//  else
	    	//  {    System.out.println("given statment is disabled");
	    	//  }
	    	  
	    //	boolean Result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img'] ")).isDisplayed();
	    //	  System.out.println(Result);
	    	  
	    		driver.findElement(By.xpath("  //input[@placeholder='Password']")).sendKeys("CBZ");
	            Thread.sleep(2000);
	   String  text= driver.findElement(By.xpath("  //input[@placeholder='Password']")).getAttribute("value");
	   System.out.println("text"); 		
	    		
	   
		}
}
