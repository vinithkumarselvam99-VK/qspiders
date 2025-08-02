package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileuploadpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    Driver.get("https://www.naukri.com/");
	    Driver.findElement(By.id("register_Layer")).click();
	    Actions act = new Actions(Driver);
	    act.scrollByAmount(0,269).perform();
	    Driver.findElement(By.id("resumeUpload")).sendKeys("C:/Users/admin/Downloads/S Vinith Kumar.pdf");
	}

}
