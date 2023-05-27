package screnshoot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ex3_Screenshot {

	
	public static void main(String[] args) throws IOException {
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://WWW.facebook.com/");
		 
		 
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        System.out.println(src);
	        
	      String PP = RandomString.make(8);                                            //Q1 write Screenshotcode?
	                                                                                    //Q2  how to save Screnshot
	  File dest=new File("F:\\screenshot\\image.png ");//F:\screenshot
	  
	  FileHandler.copy(src, dest);    //classname.methodname
		
	}
}
