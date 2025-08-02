package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementgetrect {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.get("https://www.facebook.com/");
	    WebElement login = Driver.findElement(By.name("login"));
	    Rectangle rect = login.getRect();
	    System.out.println(rect.getHeight());
	    System.out.println(rect.getWidth());
	    System.out.println(rect.getX());
	    System.out.println(rect.getY());
	    
	    

	}

}
