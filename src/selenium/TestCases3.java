package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCases3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		// Check the existence of Gmail link in google page
		
		try
		{
		if (driver.findElement(By.linkText("Gmailabc")).isDisplayed()){
		System.out.println("Gmail Link Exists - Passed");
		}
		}
		catch (NoSuchElementException e)
		{
		System.out.println("Gmail Link Not Exists - Failed");
		}
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
