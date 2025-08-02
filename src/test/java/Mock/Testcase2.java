package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) {
		 WebDriver Driver = new ChromeDriver();
	       Driver.manage().window().maximize();
	       Driver.get("https://www.flipkart.com/");
	       Driver.findElement(By.name("q")).sendKeys("book");
	       Driver.findElement(By.xpath("//button[@type  ='submit']")).click();
	       Driver.findElement(By.partialLinkText("Chemistry, Mat...")).click();
	       WebElement prizeofthebook = Driver.findElement(By.xpath("//div[@class='GURu5w _5V8g3p']"));
	       System.out.println(prizeofthebook.getText());
	              
	}

}
