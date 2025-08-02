package Mock;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.get("https://www.swiggy.com/restaurants");
	    WebElement Swiggy1 = Driver.findElement(By.xpath("//*[name( ) = \"svg\" and @class=\"VXJlj\"]"));
        File temp = Swiggy1.getScreenshotAs(OutputType.FILE);
	    File perm = new File("./Screenshot/Swiggy1.jpg");
	    FileHandler.copy(temp, perm);
	        
	}

}
