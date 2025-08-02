package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\E29.properties");
      Properties prop = new Properties();
      prop.load(fis);
      prop.getProperty("browser");
     String URL = prop.getProperty("url");
     String UN = prop.getProperty("username");
      String PW = prop.getProperty("password");
      
      WebDriver Driver = new ChromeDriver();
      Driver.manage().window().maximize();
      Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      Driver.get(URL);
      Driver.findElement(By.name("username")).sendKeys(UN);
      Driver.findElement(By.name("password")).sendKeys(PW);
      
	}

}
