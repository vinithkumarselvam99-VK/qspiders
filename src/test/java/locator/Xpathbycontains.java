package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbycontains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demowebshop.tricentis.com/");
	     driver.findElement(By.linkText("Log in")).click();
	     Thread.sleep(3000);
	    WebElement partialtext = driver.findElement(By.xpath("//div[contains(text(),'By creating an account')]"));
	    System.out.println(partialtext.getText());
	     
	}

}
