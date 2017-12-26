package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureErrorMessEx {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='login-signin']")).click();
		String ErrorMessage = driver.findElement(By.id("mbr-login-error")).getText(); 
		System.out.println(ErrorMessage);


	}

}
