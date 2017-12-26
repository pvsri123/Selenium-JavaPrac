package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement myElement = driver.findElement(By.name("firstname"));
		myElement.sendKeys("Done");
		WebElement myElement1 = driver.findElement(By.name("lastname"));
		myElement1.sendKeys("Ram");
		WebElement myElement2 = driver.findElement(By.name("reg_email__"));
		myElement2.sendKeys("Done@gmail.com");
		WebElement myElement3 = driver.findElement(By.name("reg_passwd__"));
		myElement3.sendKeys("trash");
		// select class for drop down menu
		
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel1.selectByVisibleText("Sep");
				
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel2.selectByIndex(4);
		Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.selectByIndex(6);
		
			// For selection of female radio button	
		driver.findElement(By.xpath(".//*[@id='u_0_6']")).click();
		
		// For selection of male radio button	
		
		//driver.findElement(By.xpath(".//*[@id='u_0_7']']")).click();
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Done@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='u_0_r']")).click();
		//driver.close();
	}

}
