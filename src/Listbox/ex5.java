package Listbox;     //  get all option from listbox

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex5 {
public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.facebook.com/");
	  
	  driver.findElement(By.xpath(" //a[text( )='Create new account']")).click();
	  
	  Thread.sleep(3000);
	  
	 WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	 Select s=new Select(month); 
	 
	List<WebElement> alloptions = s.getOptions();
	 
	 for(WebElement s1: alloptions)
	 {
		 System.out.println(s1.getText());
	 }
	 
	 
	 
	 
}
}