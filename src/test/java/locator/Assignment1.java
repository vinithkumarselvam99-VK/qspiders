package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.youtube.com/");
       driver.findElement(By.name("search_query")).sendKeys("mugai mazhai");
       driver.findElement(By.cssSelector("button[aria-label=Search]")).click();
       driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer' and @aria-label='Mugai Mazhai - Video Song | Tourist Family | Sasikumar, Simran | Sean Roldan | Abishan Jeevinth 3 minutes, 48 seconds']")).click();
	      
	}

}
