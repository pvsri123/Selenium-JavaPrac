package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverEx06 {

	public static void main(String[] args) throws InterruptedException {
		// write script to click "frequently asked questions" option in "Customer care" menu
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize();
		
		Actions ac= new Actions(driver);
		Thread.sleep(2000);
		
		ac.moveToElement(driver.findElement(By.linkText("Customer Care"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Frequently Asked Questions")).click();

	}

}
