package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("pvsree123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		// to pasuse the execution unti the  pwd edit box is available
		
		
		WebDriverWait wt = new WebDriverWait(driver, 10);
		 
		wt.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		
		driver.findElement(By.name("password")).sendKeys("Pvshraddha25");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(5000);
		String PgTitle = driver.getTitle();
		if(PgTitle.startsWith("Inbox"))
		{
			System.out.println("Successful login operation");
		}
		else
		{
			System.out.println("Un-Successful login operation");
		}
		
			// to click on compose button
		
		
		driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("to")).sendKeys("pvsri123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("subjectbox")).sendKeys("Hello");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@class='a1 aaA aMZ")).click();
		driver.findElement(By.id(":ob")).click();
		Thread.sleep(4000);
		StringSelection filepath = new StringSelection("C:\\Users\\Sreenivas\\Desktop\\CSIR-CGCRI\\CV-Venkata Sreenivas Puli.doc"); 
		
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
		
		driver.findElement(By.id(":me")).click();
	}

}
