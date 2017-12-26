package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLoginGcritEx01 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.equals("http://www.gcrit.com/build3/admin/index.php")){
			driver.findElement(By.linkText("Online Catalog")).click();
			}
		System.out.println(driver.getCurrentUrl());

	}
}
