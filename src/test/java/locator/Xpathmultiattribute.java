package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathmultiattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demowebshop.tricentis.com/");
	     driver.findElement(By.linkText("Log in")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@type ='button' and @value='Register']")).click();
	     
	}

}
