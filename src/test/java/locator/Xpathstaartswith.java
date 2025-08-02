package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathstaartswith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.irctc.co.in/nget/train-search");
	     WebElement Text = driver.findElement(By.xpath("//button[starts-with(text(),'Easy')]"));
	     System.out.println(Text.getText());
	   
	}

}
