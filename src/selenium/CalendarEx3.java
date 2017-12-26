package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarEx3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtJourneyDate")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("3")).click();
		
		//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
	}

}
