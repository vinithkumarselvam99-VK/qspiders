package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementsmethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver Driver = new ChromeDriver();
      Driver.manage().window().maximize();
      Driver.get("https://demo.vtiger.com/vtigercrm/");	
      Driver.findElement(By.id("username")).clear();
      Driver.findElement(By.id("password")).clear();
      Driver.findElement(By.id("username")).sendKeys("Vinith");
      Driver.findElement(By.id("password")).sendKeys("Vinith21");
      Driver.findElement(By.xpath("//button[text() = 'Sign in']")).submit();
      WebElement credential = Driver.findElement(By.id("validationMessage"));
      System.out.println(credential.getText());
      
      
      
      
	}

}
