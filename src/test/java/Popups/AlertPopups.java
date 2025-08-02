package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    Driver.get("https://demowebshop.tricentis.com/");
	    Driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(2000);
	    //Alertpopup
	    Alert alert = Driver.switchTo().alert();
	    alert.accept();
	    Driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
	    
	    
	}

}
