package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverEx03 {

	public static void main(String[] args) {
		
		// Right click on the create account button
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		WebElement botton = driver.findElement(By.id("u_0_r"));
		Actions act = new Actions(driver);
		
		act.moveToElement(botton).contextClick().build().perform();

	}

}
