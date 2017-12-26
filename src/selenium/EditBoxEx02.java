package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditBoxEx02 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		// to focus on email edit box
		driver.findElement(By.id("email")).click();
		
		// to enter value in the email box
		
		driver.findElement(By.id("email")).sendKeys("InsightQ");
		
		Thread.sleep(3000);
		
		// to read values from email edit box
		
		String uid = driver.findElement(By.id("email")).getAttribute("value");
		
		// to compare string value
		
				if (uid.equals("InsightQ")){
					System.out.println("expected value displayed");
				}
				else
				{
					System.out.println("different value displayed");
				}
				// to clear data
				
				driver.findElement(By.id("email")).clear();
				

	}

}
