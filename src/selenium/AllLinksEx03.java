package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksEx03 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 
		driver.get("http://rediffmail.com/");
		driver.manage().window().maximize();
 
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
 
		System.out.println(links.size());
 
		for (int i = 1; i<=links.size(); i=i+1)
 
		{
 
			System.out.println(links.get(i).getText());
 
		}
 
	}

}
