package TestNGExecutionbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void instagram() {
		
		WebDriver Driver= new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.instagram.com/");
	}
	
}
