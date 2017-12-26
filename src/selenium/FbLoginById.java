package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FbLoginById {

	public static void main(String[] args) 
	{
		
				WebDriver driver = new FirefoxDriver();
				driver.get("http://www.facebook.com");
				driver.manage().window().maximize();
				
				driver.findElement(By.id("u_0_9")).sendKeys("Remo");
				driver.findElement(By.id("u_0_b")).sendKeys("Demo");
				driver.findElement(By.id("u_0_e")).sendKeys("Remo.Demo@gmail.com");
				driver.findElement(By.id("u_0_l")).sendKeys("Done");
				driver.findElement(By.id("u_0_h")).sendKeys("Remo.Demo@gmail.com");
				
				
				// select class for drop down menu
				
				Select sel1 = new Select(driver.findElement(By.id("month")));
				sel1.selectByVisibleText("Sep");

				Select sel2 = new Select(driver.findElement(By.id("day")));
				sel2.selectByIndex(4);
				Select sel3 = new Select(driver.findElement(By.id("year")));
				sel3.selectByIndex(6);
						
				driver.findElement(By.className("_58mt")).click();
				driver.findElement(By.id("u_0_r")).click();
				
			}
				
}