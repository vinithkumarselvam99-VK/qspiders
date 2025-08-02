package Actions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotwebelement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.get("https://demowebshop.tricentis.com/");
	    WebElement button = Driver.findElement(By.xpath("//input[@type='submit']"));
	    File temp = button.getScreenshotAs(OutputType.FILE);
	    File perm = new File("./Screenshot/button.jpg");
	    FileHandler.copy(temp, perm);
	               
	}

}
