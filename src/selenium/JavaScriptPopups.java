package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptPopups {

		public static void main(String[] args) throws InterruptedException 
		{
			
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			// click on go to button without user name and password
			
			driver.findElement(By.name("proceed")).click();
			
			// to handle the java script alert pop up box in selenium
			
			Alert alert = driver.switchTo().alert();
			
			Thread.sleep(3000);
			System.out.println("Alert text:"+alert.getText());
			alert.accept();
			
			//back to the main page
			driver.switchTo().defaultContent();
			driver.findElement(By.name("proceed")).getAttribute("value");
			System.out.println("Go button text:"+
			driver.findElement(By.name("proceed")).getAttribute("value"));
	}

}
