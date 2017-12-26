package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class saleForceLogin {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("mercury");
		driver.findElement(By.id("password")).sendKeys("mercury");
		driver.findElement(By.id("Login")).click();		
		
	}
	

}
