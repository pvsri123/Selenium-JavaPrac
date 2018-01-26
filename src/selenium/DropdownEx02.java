package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx02 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		
		Select myList = new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
		
		/*// select US dollars
		
		myList.selectByValue("USD");
		
		myList.selectByIndex(0);
		Thread.sleep(2000);*/
		
		// to select value by based on visible text
		myList.selectByVisibleText("INR");
		
		// to find number of values in the drop down list
		List<WebElement> options = myList.getOptions();
		System.out.println("Number of values in dropdown list are" +options.size());
		
		// to display the drop down list 
		for (WebElement option: options)
		{
			System.out.println(option.getText());
		}

		

	}

}
