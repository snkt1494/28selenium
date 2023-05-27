package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example2_close {

	    public static void main(String[] args) {
	    	
	    	
	    	WebDriver driver= new ChromeDriver();
			driver.get("https://google.com/");
	    	
	    	driver.close();
			
		}
	
	
	
}
