package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckpointEx01 {

	public static void main(String[] args) {
		//Verification point: Check the existence of Gmail link
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
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
		driver.close();

	}

}
