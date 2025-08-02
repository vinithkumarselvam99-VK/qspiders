package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver Driver = new ChromeDriver();
       Driver.manage().window().maximize();
       Driver.get("https://demowebshop.tricentis.com/");
       Driver.findElement(By.linkText("Jewelry")).click();
       WebElement Addtocartbutton = Driver.findElement(By.cssSelector("input[value='Add to cart']"));
       System.out.println(Addtocartbutton.getCssValue("background-color"));
       Driver.findElement(By.cssSelector("input[value='Add to cart']")).click();
       
	}

}
