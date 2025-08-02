package program;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	      WebDriver Driver = new ChromeDriver();
	      Driver.manage().window().maximize();
	      Driver.navigate().to("https://www.youtube.com/");
	      Thread.sleep(2000);
	      Driver.navigate().to("https://open.spotify.com/");
	      Thread.sleep(2000);
	      Driver.navigate().back();
	      Thread.sleep(2000);
	      Driver.navigate().forward();
	      Driver.navigate().refresh();
	      
	}

}
