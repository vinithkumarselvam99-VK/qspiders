package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrollbyamount {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.get("https://demowebshop.tricentis.com/");
	    Actions act = new Actions(Driver);
	    //act.scrollByAmount(0,500).perform();
	  WebElement Mybutton = Driver.findElement(By.linkText("My account"));
	    act.scrollToElement(Mybutton).perform();

	}

}
