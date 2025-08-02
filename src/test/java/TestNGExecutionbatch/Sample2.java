package TestNGExecutionbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample2 {

	@Test
	public void flipkart() {	
		WebDriver Driver= new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.flipkart.com/");
}
}