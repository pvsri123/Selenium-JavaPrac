package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextEx2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/");
		 
		String theLinkText= driver.findElement(By.linkText("REGISTER")).getText();
		 System.out.println(theLinkText);
		 
		 String TheLinkText = driver.findElement(By.partialLinkText("egi")).getText();
		 System.out.println(TheLinkText);
	}

}
