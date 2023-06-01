package Framework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Ex_1withoutdatadrivenFramework {
	

	public static void main(String[] args ) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
     	driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//click on sign in Button
	   driver.findElement(By.xpath("// a [text ( )='Sign in'] ")).click();
	   
	   //enter on mobile number
	   
	   driver.findElement(By.xpath(" ( //input[@type='number']  )[2]  ")).sendKeys("9665005701 ");
	   
	   //click on sign in
	   
	   driver.findElement(By.xpath("(//span[ text ( )='Sign in with Password'] )[2] ")).click();
	   Thread.sleep(2000);
	   
	   // click on password 
	   
	   driver.findElement(By.xpath("// input[@ type='password'] ")).sendKeys("Sanket@1492");
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
                 String expText = "Tata com";
	  
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
