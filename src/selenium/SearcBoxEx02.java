package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearcBoxEx02 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.id("lst-ib"));
		searchbox.sendKeys("selenium");
		
		Thread.sleep(3000);
		searchbox.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		searchbox.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		searchbox.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		searchbox.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		searchbox.sendKeys(Keys.ENTER);
		

	}

}
