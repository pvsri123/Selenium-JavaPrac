package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptPopupsEx01 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://secure.aponline.gov.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#Table10>tbody>tr>td>a>img")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("userId")).sendKeys("InsightQ");
		driver.findElement(By.id("ImageButton1")).click();
		Thread.sleep(3000);
	
		Alert Alt = driver.switchTo().alert();
		String errorMsg = Alt.getText();
		System.out.println("errorMsg");
		Alt.accept();
		driver.findElement(By.id("password")).sendKeys("Madhukar");
		
	
	}
	

}
