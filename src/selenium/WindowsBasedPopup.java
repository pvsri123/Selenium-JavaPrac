package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsBasedPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
		
		// click on upload CV
		
		driver.findElement(By.id("input_resumeParser")).click();
		
		//open upload window
		 //   upload.click();

		    //put path to your CV in a clip board
		   
		StringSelection filepath = new StringSelection("C:\\Users\\Sreenivas\\Desktop\\CSIR-CGCRI\\CV-Venkata Sreenivas Puli.PDF");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		    
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

	}

}
