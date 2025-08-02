package program;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_setsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver Driver = new ChromeDriver();
      Driver.manage().window().setSize(new Dimension(300, 300));
	}

}
