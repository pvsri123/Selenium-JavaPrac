package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverEx02 {

	public static void main(String[] args) {
		
		//write script to  click on Login button in FB home page using Actions class
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		// normal way of clicking on login button
		//driver.findElement(By.id("u_0_2")).click();
		
		// Using Actions class
				
		WebElement ButtonObj = driver.findElement(By.id("u_0_2"));
		
		// Create Instance object for Actions Class
		
		Actions act = new Actions(driver);
		act.moveToElement(ButtonObj).click().build().perform();
		
	}
	

}
