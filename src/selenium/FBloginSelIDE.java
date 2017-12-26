package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBloginSelIDE {

	public static void main(String[] args) {
		
		String baseurl = "http://facebook.com";
		WebDriver driver = new FirefoxDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("smith");
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("pass");
		driver.findElement(By.id("u_0_0")).click();
	}

}
