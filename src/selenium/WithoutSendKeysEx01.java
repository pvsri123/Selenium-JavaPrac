package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WithoutSendKeysEx01 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("email")).sendKeys("Done@gmail.com");
		
		// WebElement cssValue= driver.findElement(By.xpath(".//*[@id='email']"));
		
		WebElement cssValue= driver.findElement(By.id("email"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('email').value='Done@gmail.com'");
	}

}
