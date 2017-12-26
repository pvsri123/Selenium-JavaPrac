package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEx {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://login.salesforce.com");
		driver.manage().window().maximize();
		
		// to check the remember check box 
		driver.findElement(By.name("rememberUn")).click();

	}

}
