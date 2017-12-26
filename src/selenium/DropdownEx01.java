package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		
		Select myList = new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
							
		// select US dollars
		
		myList.selectByValue("USD");
		Thread.sleep(2000);
		myList.selectByValue("INR");
		
		

		
		
	}

}
