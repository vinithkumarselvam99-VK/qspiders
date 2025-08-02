package program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchingbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demowebshop.tricentis.com/");
		String id = Driver.getWindowHandle();
		System.out.println(id);
		
	}
}
