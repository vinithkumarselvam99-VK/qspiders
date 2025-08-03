package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoption_singleselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://en-gb.facebook.com/reg/");
		WebElement Date = Driver.findElement(By.id("day"));
		Select sel = new Select(Date);
		List<WebElement> Alloptions = sel.getOptions();
		for (WebElement ele : Alloptions) {
			System.out.println(ele.getText());
		}
	}
}
