package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    Driver.get("https://demo.guru99.com/test/delete_customer.php");
	    Driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Vinith");
	    Driver.findElement(By.xpath("//input[@type='submit']")).click();
	    //Confirmpopup
	    Thread.sleep(2000);
	    Alert alert = Driver.switchTo().alert();
	    alert.accept();
	    Thread.sleep(2000);
	    Alert alert1= Driver.switchTo().alert();
	    alert1.accept();
	    	    
	}
}
