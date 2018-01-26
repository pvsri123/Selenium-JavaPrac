package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonWebElement01 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		List<WebElement> radios = driver.findElements(By.className("_58mt"));
		System.out.println("Number of Radio buttons are:"+radios.size());
		
		// For-each loop with collection variable first, here radio is collection variable
		
		for(WebElement radio:radios){
			radio.click();
		}
		

	}

}
