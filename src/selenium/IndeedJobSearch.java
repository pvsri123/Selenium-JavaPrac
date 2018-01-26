package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndeedJobSearch {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.indeed.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("what")).sendKeys("selenium-Java");
		driver.findElement(By.id("where")).clear();
		
		// "clear" will clear the existing text in the Where field.
		
		driver.findElement(By.id("where")).sendKeys("Orlando,Fl");
		driver.findElement(By.id("fj")).click();
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.id("searchCount")).getText());
		driver.close();

	}

}
