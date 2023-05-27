package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_xpathbyattributetype {

	public static void main(String[] args) 
{
		
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(by.xpath(" //input[@name='email']")).sendKeys("ppt");
		
         driver.findElement(By.xpath(" //input[@name='email']")).sendKeys("ABC");

	//	driver.findElements(By.xpath(" //input[@id='email']")).send
		
		driver.findElement(By.xpath("  //input[@placeholder='Password']")).sendKeys("CBZ");

		driver.findElement(By.xpath("  //button[@type='submit']")).click();


         driver.findElement(By.xpath(" //button[@type='submit']")).click();

}
	
	
	
	
	
	
	
}
