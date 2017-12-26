package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayedEx01 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://makemytrip.com");
		driver.manage().window().maximize();
		
		// to check "Return" webelement enabled or not,by creating instance object
		
		WebElement ReturnDate = driver.findElement(By.id("hp-widget__return"));
		
		boolean x = ReturnDate.isEnabled();
		System.out.println(x);
		// click on round trip button
		
		driver.findElement(By.xpath(".//*[@id='js-switch__option']/div[2]/label")).click();
		
		
		

	}

}
