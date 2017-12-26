package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLoginGcrit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
			
		String url =driver.getCurrentUrl();
		if(url.equals("http://www.gcrit.com/build3/admin/index.php")){
			System.out.println("Login successful- Test passed");
		}
		else
		{
			System.out.println("Login Unsuccessful- Test failed");
		}
		
		driver.close();
	}

}
