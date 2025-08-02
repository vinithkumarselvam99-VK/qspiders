package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
       FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Instafile.xlsx");
      Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet("Sheet1");
        Row rw = sh.getRow(1);  
        String URL = rw.getCell(0).getStringCellValue();
        String UN = rw.getCell(1).getStringCellValue();
         String PWD = rw.getCell(2).getStringCellValue();
                      
         WebDriver Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Driver.get(URL);
        Driver.findElement(By.name("username")).sendKeys(UN);
        Driver.findElement(By.name("password")).sendKeys(PWD);
       
	}

}
