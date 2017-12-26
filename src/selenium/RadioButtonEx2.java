package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonEx2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php?osCsid=11a90be74bed0ecefd0226d8a86b6eb5");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.name("findFlights")).click();
		
		List<WebElement> radios = driver.findElements(By.name("outFlight"));
		System.out.println("Number of departure flights are:"+radios.size());
		
		for(WebElement radio: radios){
			radio.click();
		}
		
	}

}
