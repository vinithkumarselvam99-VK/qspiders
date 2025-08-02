package Mock;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.get("https://demowebshop.tricentis.com/");
	    Driver.findElement(By.linkText("Jewelry")).click();
	    Thread.sleep(1000);
        WebElement button = Driver.findElement(By.xpath("//input[@onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/14/1/1    ');return false;\"]"));   
	    button.click();
	    WebElement bar = Driver.findElement(By.id("bar-notification"));
        File temp = bar.getScreenshotAs(OutputType.FILE);
	    File perm = new File("./Screenshot/bar.jpg");
	    FileHandler.copy(temp, perm);
	    
	}

}
