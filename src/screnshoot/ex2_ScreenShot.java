package screnshoot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import jakarta.activation.FileDataSource;
import net.bytebuddy.utility.RandomString;

public class ex2_ScreenShot {
       public static void main(String[] args) throws IOException {
		
    	   WebDriver driver=new ChromeDriver();
    	     driver.get(" https://facebook.com/");

    	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);        
    	   
    	   System.out.println(src);
    	   
    	   String OS = RandomString.make(3);
    	   
    	   File dest=new File("F:\\screenshot\\Image."+OS+"png ");
    	   
    	   
    	   FileHandler.copy(src, dest);
    	   
    	   
	}
}
