package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relativelocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demowebshop.tricentis.com/");
		WebElement ref = Driver.findElement(By.xpath("//input[@type ='submit']"));
		Driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(ref)).sendKeys("books");
		
		
	}

}
