package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToelement   {//mouse right click
	
public static void main(String[] args) throws InterruptedException {
	
	
	
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	driver.get("  https://demo.guru99.com/test/simple_context_menu.html");
	
	
	Thread.sleep(2000);
	
             WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
	
             Actions   act   =new   Actions(driver);
	
	   act.moveToElement(ele).perform();
	  act.contextClick().perform();
	 //  act.contextClick(ele).perform();
	
	
	
	
	
	
	
	
	
	
	
}

}
