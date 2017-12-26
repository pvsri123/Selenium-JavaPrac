package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEx05Langs 
{

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();
		
		WebElement myLang = driver.findElement(By.id("_eEe"));
		
		
		List<WebElement> links = myLang.findElements(By.tagName("a"));
		System.out.println("Number of  language links are:"+links.size());
		
		for (WebElement link: links){
			System.out.println(link.getText());
		}

	}
}
