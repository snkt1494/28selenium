package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_Hiddendivisionpopup {
        public static void main(String[] args) {
			WebDriver driver =new  ChromeDriver();
			driver.get("https://flipkart.com/");
			
			driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU'] ")).sendKeys("ABC");
        	
		}
	
	
	
	
}
