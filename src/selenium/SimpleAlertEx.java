package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SimpleAlertEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		
		// This step will result in an alert on screen
		driver.findElement(By.xpath(".//*[@id='content']/p[4]/button")).click();
 
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		System.out.println("Alert text is " + alertText);
		Thread.sleep(3000);
		simpleAlert.accept();
		
		driver.findElement(By.xpath(".//*[@id='content']/p[8]/button")).click();
		
		Alert ConfirmAlert = driver.switchTo().alert();
		
		String ConfirmAlertText = ConfirmAlert.getText();
		System.out.println(ConfirmAlertText);
		Thread.sleep(3000);
		ConfirmAlert.accept();
		
	}

}
