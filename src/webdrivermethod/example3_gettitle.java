package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_gettitle 
{
        public static void main(String[] args) {
			
        	WebDriver driver=new ChromeDriver();
        	driver.get("https://www.facebook.com/");
        	String title=driver.getTitle();
        	System.out.println(title);
        			
        	
		}
	
	
}
