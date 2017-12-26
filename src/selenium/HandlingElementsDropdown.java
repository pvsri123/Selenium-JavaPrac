package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingElementsDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=47gtsrhe41613u5r3eqhgdbas7");
		
		Select dropDown = new Select (driver.findElement(By.name("country")));
		
		dropDown.selectByIndex(6);//Select an item by index
	   
		//dropDown.selectByVisibleText("India");
		
		List<WebElement> e = dropDown.getOptions();
		int itemsCount = e.size();
		System.out.println(itemsCount);

		
	}

}
