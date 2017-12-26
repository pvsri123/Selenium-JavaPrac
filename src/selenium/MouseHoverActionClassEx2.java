package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActionClassEx2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver  = new FirefoxDriver();
		driver.get("https://www.officedepot.com/");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(".//*[@id='navGroup1']/h1/a"))).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='sg1676']/div/div/div[1]/div[1]/ul/li[3]/a/span")).click();
		
	}

}
