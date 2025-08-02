package Actions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkey {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.get("https://www.instagram.com/");
	    WebElement Un = Driver.findElement(By.name("username"));
	    Actions act = new Actions(Driver);
	   // act.click(Un).sendKeys("vinith").perform();
	    act.sendKeys(Un,"Vinith").perform();
	    
	    
	    
	}

}
