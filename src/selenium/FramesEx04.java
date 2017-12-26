package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesEx04 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("login_page");
			
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		
				
		// to read error message in java script popup box
		String ErrorMsg =driver.switchTo().alert().getText();
		System.out.println(ErrorMsg);
		// to close the alert
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		// to enter the customer id
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("12234");
		
		

	}

}
