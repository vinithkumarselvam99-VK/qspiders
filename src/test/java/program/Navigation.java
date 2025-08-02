package program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver Driver = new ChromeDriver();
      Driver.manage().window().maximize();
      Driver.navigate().to("https://www.flipkart.com/");
	}

}
