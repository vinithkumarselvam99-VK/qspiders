package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetooffsetweb {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.get("https://demowebshop.tricentis.com/");
	    WebElement Search = Driver.findElement(By.xpath("//input[@value='Search']"));
	    Actions act = new Actions(Driver);
	    act.moveToElement(Search,1106,118).click().perform();
	    
	}

}
