package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		 /*Uploading files in WebDriver is done by simply using the sendKeys() method
		on the file-select 	input field to enter the path to the file to be uploaded.*/
		
		
		 String baseUrl = "http://demo.guru99.com/selenium/upload/";
	        WebDriver driver = new FirefoxDriver();
	        driver.get(baseUrl);
	        WebElement uploadElement = driver.findElement(By.name("uploadfile_0"));
	        uploadElement.sendKeys("C:\\Users\\Sreenivas\\Documents\\icmab.pdf");
	        
	     // enter the file path onto the file-selection input field
	        
	                
	        Robot rb = new Robot();
			// to perform ctrl+V
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			Thread.sleep(2000);
			
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
	        
			
			driver.findElement(By.linkText("Open")).click();
			
	     // check the "I accept the terms of service" check box
	        driver.findElement(By.id("terms")).click();

	        Thread.sleep(2000);
	        // click the "UploadFile" button
	        driver.findElement(By.name("send")).click();

	}

}
