package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notificationhandlepopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    Driver.get("https://www.easemytrip.com/");
	    Thread.sleep(1000);
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
