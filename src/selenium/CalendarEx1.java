package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarEx1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtJourneyDate")).click();;
		driver.findElement(By.linkText("25")).click();
	}

}
