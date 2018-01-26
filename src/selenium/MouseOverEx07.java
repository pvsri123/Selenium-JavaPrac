package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverEx07 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.in");
		
		Thread.sleep(1000);
		
		
		
		WebElement ele1 = driver.findElement(By.id("gh-btn"));
		//WebElement ele2= driver.findElement(By.xpath("//*[text()='Daily Deals']"));
		WebElement ele2= driver.findElement(By.linkText("Deals"));
		Actions act = new Actions(driver);
		
		// To scroll down to the page upto Dialy Deals using drag and drop
		
		act.dragAndDrop(ele1, ele2).build().perform();
		Thread.sleep(3000);
		WebElement ele3 = driver.findElement(By.linkText("User Agreement"));
		act.dragAndDrop(ele2, ele3).build().perform();
		
		
		}

}