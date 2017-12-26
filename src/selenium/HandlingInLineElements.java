package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingInLineElements {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
		//driver.findElement(By.cssSelector(".gb_b.gb_6b")).click();
		driver.findElement(By.xpath(".//*[@id='gb36']/span[1]")).click();
		
		
		
		

	}

}
