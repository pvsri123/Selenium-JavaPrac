package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearcBoxEx01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("HYD");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("HYDERABAD MGBS")).click();
	}

}
