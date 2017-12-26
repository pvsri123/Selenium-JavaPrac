package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverEx04 {

	public static void main(String[] args) throws InterruptedException {
		
		// write script to enter letters in upper case
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions act= new Actions(driver);
		Thread.sleep(3000);
		
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("smallerletters").build().perform();

	}

}
