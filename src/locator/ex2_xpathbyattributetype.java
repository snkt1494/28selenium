package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_xpathbyattributetype {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=New ChromeDriver() 
		driver.get(" https://www.google.com/ ");
		Thread.sleep(2000);
		
		//driver.findElement(by.xpath(" //input[@name='email']")).sendKeys("ppt");
		
	driver.findElement(By.xpath(" //textarea[@class='gLFyf']")).sendKeys("Velocity class pune");
      Thread.sleep(2000);
       driver.findElement(By.xpath(" //a[@class='gb_t']")).click();
       Thread.sleep(2000);
	   driver.findElement(By.xpath(" //svg[@class='gb_g']")).click();
		Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[@class='gb_ma gb_td gb_Td gb_id']")).click();
        Thread.sleep(2000);
	driver.findElement(By.xpath(" //input[@type='email'] ")).sendKeys("snkt14292@gmail.com");
	
	}

}
