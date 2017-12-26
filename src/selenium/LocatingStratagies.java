package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingStratagies {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.indeed.com/");
		
		// Locating by Id
		// driver.findElement(By.id("what")).sendKeys("selenium");
		// Locating by Name
		//driver.findElement(By.name("q")).sendKeys("selenium");
		// Locating by LinkText
		
		//driver.findElement(By.linkText("Upload your resume")).click();
		
	//	driver.findElement(By.partialLinkText("Post Job")).click();
	
		 // Locating by Xpath and prints src value from the image (Indeed logo)
		System.out.println(
				driver.findElement(By.xpath("//img[@title='Indeed job search']"))
				.getAttribute("src")
				);
		
		
	}

}
