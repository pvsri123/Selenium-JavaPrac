package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		String Error_Message =alert.getText();//Returns Error message
		System.out.println(Error_Message);

		alert.accept();//Closes OK Button
		driver.findElement(By.id("login1")).sendKeys("Inda123");




	}

}
