package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementisdisplayed {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.get("https://demowebshop.tricentis.com/");
	    WebElement searchfield = Driver.findElement(By.xpath("//input[@value='Search store']"));
	    System.out.println(searchfield.isDisplayed());
	    searchfield.sendKeys("mobile");
	    Driver.close();
	    

	}

}
