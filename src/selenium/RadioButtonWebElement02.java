package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonWebElement02 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		// perform login operation
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		// to pause the execution
		
		Thread.sleep(3000);
		// to click on continue button
		
		driver.findElement(By.name("findFlights")).click();
		List<WebElement> radios = driver.findElements(By.name("outFlight"));
		System.out.println("Number of radio buttons are:"+radios.size());
		
		for(WebElement radio: radios){
			radio.click();
			Thread.sleep(3000);
		}
	}

}
