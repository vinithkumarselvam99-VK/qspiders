package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promtpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    Driver.get("https://demoqa.com/alerts");
	    Thread.sleep(2000);
	    Driver.findElement(By.id("promtButton")).click();
	    Thread.sleep(1000);
	    Alert alert = Driver.switchTo().alert();
	    Thread.sleep(1000);
	    alert.sendKeys("Vinith");
	    Thread.sleep(1000);
	    alert.accept();
	}
}
