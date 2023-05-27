package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_Tagname {
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
	
		driver.get(" file:///F:/V.CLASS/AUTOMATIN%20TESTING/HTML/example3.html ");
	     driver.findElement(By.xpath("//input")).sendKeys("XYZ");
		
	}

}
