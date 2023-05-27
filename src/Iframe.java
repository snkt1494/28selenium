import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
         
		driver.get(" https://w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath(" //button[contains(text(),'Click me to')]")).click();
		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("  //a[@id='menuButton']")).click();
		
	}

}
//ex1&ex2 mix