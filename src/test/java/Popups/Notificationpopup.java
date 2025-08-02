package Popups;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
       ChromeOptions settings = new ChromeOptions();
       settings.addArguments("--disable-notifications");
		WebDriver Driver = new ChromeDriver(settings);
	    Driver.manage().window().maximize();
	    Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    Driver.get("https://www.easemytrip.com/");

	     
	}

}