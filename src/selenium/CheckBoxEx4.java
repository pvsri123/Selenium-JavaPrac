package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEx4 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/Automation-practice-form");
		driver.manage().window().maximize();
		
		List<WebElement> checks = driver.findElements(By.name("tool"));
		
		System.out.println("Number of check boxes are:"+checks.size());
		
		for(WebElement check:checks){
			if(!check.isSelected())
				check.click();
		}

	}

}
