package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    Driver.get("https://demowebshop.tricentis.com/");
	    Driver.findElement(By.linkText("Facebook")).click();
		String parentid = Driver.getWindowHandle();
		Set<String> childid = Driver.getWindowHandles();
		childid.remove(parentid);
		
		for (String id: childid) {
			Thread.sleep(2000);
			Driver.switchTo().window(id);
			Driver.findElement(By.id("_r_12_")).sendKeys("Vinith");
			Driver.findElement(By.id("_r_16_")).sendKeys("Vinith");
		}
	    
	}

}
