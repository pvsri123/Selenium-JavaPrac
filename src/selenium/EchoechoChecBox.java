package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EchoechoChecBox {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		List<WebElement> checks = driver.findElements(By.name("Checkbox"));
		System.out.println("Number of check boxes are:"+checks.size());
		
		for(WebElement check:checks)
		{
			if(!check.isSelected())
				check.click();
		}
	}

}
