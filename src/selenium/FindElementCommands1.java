package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementCommands1 {

	public static void main(String[] args) {
		// Create a new instance of the FireFox driver
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
		 
				// Launch the ToolsQA WebSite
				driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
		 
				// Type Name in the FirstName text box      
				driver.findElement(By.name("firstname")).sendKeys("Shraddha"); 
		 
				//Type LastName in the LastName text box
				driver.findElement(By.name("lastname")).sendKeys("Sharma");
		 
				// Click on the Submit button
				driver.findElement(By.id("submit")).click();
	}

}
