package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOverEx1 {

	public static void main(String[] args) {
		
		String baseUrl = "http://facebook.com";
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(txtUsername);
		builder.click();
		builder.keyDown(txtUsername,Keys.SHIFT);
		builder.sendKeys(txtUsername,"hello");
		builder.doubleClick();
		builder.contextClick();
		builder.build();
		seriesOfActions.perform();
		
		
	}

}
