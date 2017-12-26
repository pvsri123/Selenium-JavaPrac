package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActionClassEx1 {

	public static void main(String[] args) {
		
		WebDriver driver  = new FirefoxDriver();
		driver.get("http://www.amzon.com/");
		driver.manage().window().maximize();
		
	// Actions
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"))).build().perform();
		actions.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[6]/span"))).build().perform();
		
		driver.findElement(By.partialLinkText("Fire TV Sti")).click();
	}

}
