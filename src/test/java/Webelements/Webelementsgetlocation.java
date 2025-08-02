package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementsgetlocation {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.get("https://www.instagram.com/");
        WebElement getpositionw = Driver.findElement(By.xpath("//button[@type ='submit']"));
        System.out.println(getpositionw.getLocation());
	}

}
