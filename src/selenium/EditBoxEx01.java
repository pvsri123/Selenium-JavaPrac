package selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditBoxEx01 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		String myId ="Ram";
		
		
		// creating instance object for email edit box to use throughout the program
		
		WebElement EmailObj = driver.findElement(By.id("email"));
		
		// to focus on email edit box
		EmailObj.click();
		
		// enter value
		EmailObj.sendKeys(myId);
		
		// to read value from the edit box
	
		String Id = EmailObj.getAttribute("value");
		
		// to compare string value
		
		if (Id.equals(myId)){
			System.out.println("expected value displayed");
		}
		else
		{
			System.out.println("different value displayed");
		}
		EmailObj.clear();
	}

}
