package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptPromptBox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://test1.absofttrainings.com/javascript-alerts-confirm-prompt-boxes/");
		driver.findElement(By.id("prompt")).click();
		
		// to handle the java script prompt pop up box in selenium
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		System.out.println("Alert text:"+alert.getText());
		alert.sendKeys("Venkata");
		alert.accept();
		
		//back to the main page
		driver.switchTo().defaultContent();
		
		
	}

}
