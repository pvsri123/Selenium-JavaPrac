package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarEx03 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("HYD");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("HYDERABAD MGBS")).click();
		driver.findElement(By.id("toPlaceName")).sendKeys("NLR");
		Thread.sleep(2000);
		driver.findElement(By.linkText("KOVUR-NLR")).click();
		driver.findElement(By.id("txtJourneyDate")).click();
		driver.findElement(By.xpath("//*text()='Next']")).click();
		
		while(true){
			String myMonth = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/div")).getText();
			if(myMonth.equals("January"))
			{
				driver.findElement(By.linkText("25")).click();
				break;
		}

			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
		}
		
		driver.findElement(By.id("searchBtn"));
		
	}
	
}
