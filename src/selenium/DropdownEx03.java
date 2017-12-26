package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx03 {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "http://newtours.demoaut.com/mercuryregister.php";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseURL);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("INDIA");
		
		// to find the number of values
		
		List<WebElement> options = drpCountry.getOptions();
		System.out.println("Number of values in dropdown list are" +options.size());
		
		for(WebElement option:options)
		{
			
			System.out.println(option.getText());
			
		}
		
	}
}
