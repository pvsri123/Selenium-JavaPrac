package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarEx04 {

	public static void main(String[] args) {
		
		// To select the 14th Feb 2018 (Month and Year)
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
		
		while(true){
			String Year = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
			if(Year.equals("2018"))
			{
				break;
			}
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			}
		while(true){
			String Month = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
			if(Month.equals("February"))
			{
				driver.findElement(By.linkText("14")).click();
				break;
			}
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
					
	}

}

