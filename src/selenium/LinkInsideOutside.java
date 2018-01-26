package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkInsideOutside {

	public static void main(String[] args) {
		
		String baseUrl = "http://demo.guru99.com/selenium/block.html";	
		WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Inside")).click();	
		System.out.println(driver.getTitle());
		
        driver.navigate().back();	
        
        driver.findElement(By.partialLinkText("Outside")).click();
        System.out.println(driver.getTitle());

	}

}
