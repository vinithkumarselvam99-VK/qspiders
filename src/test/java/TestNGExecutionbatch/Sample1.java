package TestNGExecutionbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1 {

	@Test
	public void amazon() {	
		WebDriver Driver= new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.amazon.in/");
	}
	
}
