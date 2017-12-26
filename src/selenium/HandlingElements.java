package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingElements {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div[1]/a[2]/u")).click();
		WebElement MaleRaidoButton = driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]"));
		boolean elementStatus = MaleRaidoButton.isDisplayed();
		System.out.println(elementStatus);//true
		System.out.println(MaleRaidoButton.isEnabled());//true
		System.out.println(MaleRaidoButton.isSelected());//false
		MaleRaidoButton.click();
		System.out.println(MaleRaidoButton.isSelected());//true


	}

}
