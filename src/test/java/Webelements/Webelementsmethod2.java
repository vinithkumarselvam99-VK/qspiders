package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementsmethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	      Driver.get("https://www.actitime.com/");
	      WebElement button = Driver.findElement(By.linkText("Try actiTIME for Free"));
	      //getAttribute
	      System.out.println(button.getAttribute("href"));
	      System.out.println(button.getAttribute("class")); 
	      //gettagname
	      System.out.println(button.getTagName());
	}

}
