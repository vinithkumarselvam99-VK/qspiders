package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementsinflipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.flipkart.com/");
		List<WebElement> Link = Driver.findElements(By.tagName("a"));
	    for(WebElement alllinks:Link) {
			System.out.println(alllinks.getSize());
		}
	}
}
