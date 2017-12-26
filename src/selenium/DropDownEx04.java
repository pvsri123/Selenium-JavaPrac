package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx04 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		
		// click on leaving from and going to drop down box
		// These drop downs are auto suggested drop downs
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Goa (GOI)")).click();
							
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		
		
	}

}
