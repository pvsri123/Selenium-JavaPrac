package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='u_0_7']")).sendKeys("Remo");
		driver.findElement(By.xpath(".//*[@id='u_0_9']")).sendKeys("Demo");
		driver.findElement(By.xpath(".//*[@id='u_0_c']")).sendKeys("Remo.Demo@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("Done");
		
		
		// select class for drop down menu
		
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel1.selectByVisibleText("Sep");
		
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel2.selectByIndex(4);
		Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.selectByIndex(6);
				
		driver.findElement(By.xpath(".//*[@id='u_0_5']")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_p']")).click();
	}
		


}