package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbytext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demowebshop.tricentis.com/cart");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span[text() ='Shopping cart']")).click();
       
	}

}
