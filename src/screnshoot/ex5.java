package screnshoot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ex5 {
	    public static void main(String[] args) throws IOException, InterruptedException {
			WebDriver driver=new ChromeDriver();
			
			driver.get(" https://www.facebook.com/");
		   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		      System.out.println(src);
		      
		      String RS = RandomString.make(2);
           
		      File dest=new
		    		  
		    		  File("F:\\screenshot\\Image.png");       //    F:\\screenshot\\Image.png
	               FileHandler.copy(src,dest);
		
		
	




	

	
}
}


