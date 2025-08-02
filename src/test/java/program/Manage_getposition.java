package program;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_getposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver Driver = new ChromeDriver();
      Driver.manage().window().fullscreen();
           Point position = Driver.manage().window().getPosition();
           System.out.println(position);
	}

}
