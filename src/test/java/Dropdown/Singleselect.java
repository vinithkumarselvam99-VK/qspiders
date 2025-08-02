package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singleselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://en-gb.facebook.com/reg/");
		WebElement Day = Driver.findElement(By.id("day"));
		WebElement Month = Driver.findElement(By.id("month"));
		WebElement Year = Driver.findElement(By.id("year"));
		
		Select sel1 = new Select(Day);
		sel1.selectByIndex(20);
		
		Select sel2 = new Select(Month);
		sel2.selectByValue("12");
		
		Select sel3 = new Select(Year);
		sel3.selectByVisibleText("2000");
		
	}

}
