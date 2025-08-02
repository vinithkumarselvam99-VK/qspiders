package program;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://shoppersstack.com/products_page/17");
		Thread.sleep(20000);
		Driver.findElement(By.id("compare")).click();
		String parentid = Driver.getWindowHandle();
		Set<String> childid = Driver.getWindowHandles();
		childid.remove(parentid);
		
		for (String id: childid) {
			Thread.sleep(2000);
			Driver.switchTo().window(id);
			Driver.close();
		}
		Driver.switchTo().window(parentid);
		Driver.close();
	}

}
