package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demowebshop.tricentis.com/");
	     driver.findElement(By.linkText("Log in")).click();
	     Thread.sleep(3000);
	     WebElement login = driver.findElement(By.tagName("h1"));
	     String logintext = login.getText();
	     System.out.println(logintext);
	     
	}

}
