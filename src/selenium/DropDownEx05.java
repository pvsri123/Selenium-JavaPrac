package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx05 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		
		// For adult drop down
		Select Mydropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		Mydropdown.selectByIndex(3);
		
		// For child drop down
		Select Mydropdown1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		Mydropdown1.selectByValue("3");
		
		// For infant drop down
		
		Select Mydropdown2 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		Mydropdown2.selectByIndex(2);
		
		Thread.sleep(3000);

		Select Mydropdown3 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		Mydropdown3.selectByVisibleText("AED");
		
		// To find the number of values 
		List<WebElement> items = Mydropdown3.getOptions();
		System.out.println("Number of values are:"+items.size());
		
		// to print these values
		for(WebElement item:items){
			System.out.println(item.getText());
		}
			
		
	}

}
