package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
	       Driver.manage().window().maximize();
	       Driver.get("https://demo.vtiger.com/vtigercrm/");
	       WebElement Signinbutton  = Driver.findElement(By.xpath("//button[@type='submit']"));
	       System.out.println(Signinbutton.getAttribute("class"));
	       System.out.println(Signinbutton.getTagName());
	       System.out.println(Signinbutton.getSize());
	       System.out.println(Signinbutton.getLocation());
	       
	}

}
