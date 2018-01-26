package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverEx01 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		
	Actions act= new Actions(driver);
	act.moveToElement(search).contextClick().build().perform();
	 driver.close();
	}

}
