package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLogin {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("email")).sendKeys("smith");
		//driver.findElement(By.id("pass")).sendKeys("pass");
		//driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.linkText("Forgot account?")).click();
		

	}

}
