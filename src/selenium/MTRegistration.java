package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MTRegistration {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("James");
		driver.findElement(By.name("lastName")).sendKeys("Scott");
		driver.findElement(By.name("phone")).sendKeys("9923439234");
		driver.findElement(By.id("userName")).sendKeys("James.Scott@hotmail.com");
		driver.findElement(By.name("address1")).sendKeys("Long Road");
		driver.findElement(By.name("address2")).sendKeys("Apt#114");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Andhra Pradesh");
		driver.findElement(By.name("postalCode")).sendKeys("500060");
				
		Select select1 = new Select(driver.findElement(By.name("country")));
		select1.selectByVisibleText("INDIA");
		
		driver.findElement(By.id("email")).sendKeys("James.Scott@hotmail.com");
		driver.findElement(By.name("password")).sendKeys("Scott");
		driver.findElement(By.name("confirmPassword")).sendKeys("Scott");
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")).click();
			
		
	}

}
