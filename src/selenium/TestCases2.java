package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCases2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		// Check the existence of Gmail link in google page
		
		boolean existence = driver.findElement(By.linkText("Gmail")).isDisplayed();
		if (existence == true)
			{
			System.out.println("Gmail Link Exists - Passed");
			}
			else 
			{
			System.out.println("Gmail Link Not Exists - Failed");
			}

}
}
