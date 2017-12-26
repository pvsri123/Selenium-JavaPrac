package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeTables {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		driver.manage().window().maximize();
	
				
		//Here we are storing the value from the cell in to the string variable
		String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(sCellValue);
		String sCellValue1 = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[4]/td[2]")).getText();
		System.out.println(sCellValue1);
		String sCellValue2 = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[2]/td[1]")).getText();
		System.out.println(sCellValue2);
		
		// Here we are clicking on the link of first row and the last column
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
		System.out.println("Link has been clicked otherwise an exception would have thrown");
		driver.close();

	}

}
