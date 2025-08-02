package program;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_getsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver Driver = new ChromeDriver();
      Driver.manage().window().maximize();
      //Driver.manage().window().minimize();
      //Driver.manage().window().fullscreen();
      Dimension size = Driver.manage().window().getSize();
      System.out.println(size.getHeight());
      System.out.println(size.getWidth());
}
}