package SVG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Svg {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.get("https://www.instagram.com/");
	    Driver.findElement(By.xpath("//*[name( ) ='svg' and @aria-label = 'Log in with Facebook']")).click();

	}

}
