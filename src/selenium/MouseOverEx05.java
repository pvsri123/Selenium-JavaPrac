package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverEx05 {

	public static void main(String[] args) {
		// Write script to select "wish list" in amazon.co.in
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://amazon.in");
		
		//create Action class
		
		Actions ac= new Actions(driver);
		
		WebElement signIn= driver.findElement(By.xpath("//span[text()='Hello. Sign in']"));
	    WebElement submenu= driver.findElement(By.xpath("//span[text()='Your Wish List']"));
	//	WebElement submenu = driver.findElement(By.xpath(".//*[@id='nav_prefetch_yourorders']/span"));
		
		ac.moveToElement(signIn).moveToElement(submenu).click().build().perform();

	}

}
