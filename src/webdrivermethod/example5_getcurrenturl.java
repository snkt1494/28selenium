package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_getcurrenturl {

	
	  public static void main(String[] args) {
		
		  WebDriver driver=new ChromeDriver();
      	driver.get("https://www.facebook.com/");
      	String url=driver.getCurrentUrl();
      	System.out.println(url);
		  
		  
		  
		  
	}
}

