package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarEx2 {

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
		//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
		//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
		//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
		
		
		// .//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]
		
		do{
			String myMonth = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/div")).getText();
			if(myMonth.equals("January")){
				break;
			}
			else
			{
			 driver.findElement(By.xpath("//*text()='Next']")).click();
			 Thread.sleep(2000);
			}
		
			}
			while(true);
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[2]/td[4]/a")).click();
		
	}

}
