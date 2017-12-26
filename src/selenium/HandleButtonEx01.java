package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleButtonEx01 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		driver.findElement(By.linkText("Next")).click();
		
		System.out.println(driver.findElement(By.id("next")).isEnabled());//true

		driver.findElement(By.id("next")).click();

		System.out.println(driver.findElement(By.id("next")).isDisplayed());//true

		System.out.println(driver.findElement(By.id("next")).isEnabled());//false

		System.out.println(driver.findElement(By.id("next")).getAttribute("type"));

		System.out.println(driver.findElement(By.id("next")).getAttribute("name"));

		System.out.println(driver.findElement(By.id("next")).getAttribute("value"));


	}

}
