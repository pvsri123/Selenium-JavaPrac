package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckpointEx {

	//Verification point: Check the existence of Gmail link

	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		boolean existence = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(existence);
		if (existence == true){
			System.out.println("Gmail Link Exists - Passed");
			}
			else {
			System.out.println("Gmail Link Not Exists - Failed");
			}

	}

}
