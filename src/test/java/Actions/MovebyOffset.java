package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovebyOffset {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.get("https://www.instagram.com/");
	    Actions act = new Actions(Driver);
	    act.moveByOffset(969, 279).click().perform();
	}

}
