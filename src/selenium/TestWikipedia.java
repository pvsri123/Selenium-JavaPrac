package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWikipedia {

	public static void main(String[] args) throws InterruptedException  
	{
		// open wikipedia website and click on English and search for a term
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		// to click on the English link in the web page
		// create an object 
		
		
		// to find the link in the page and we reference the link
		

		WebElement link;
		link = driver.findElement(By.linkText("English"));
		link.click();
		
		// wait there for 5000 milliseconds or 5 seconds
		
		Thread.sleep(5000);  
		
		// here to avoid exception we have to add thorough exception
	    //throws InterruptedException
		// add another web element for search box
		
		WebElement searchBox;
		searchBox= driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Software");
		searchBox.submit();
		Thread.sleep(5000);    // 5 seconds
		
		driver.quit();
		
		
	
	}

}
