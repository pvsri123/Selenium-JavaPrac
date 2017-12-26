package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriveBrCommands {

	public static void main(String[] args) {
		
		// to open FF browser
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://facebook.com");
		 driver.manage().window().maximize();
		 driver.getPageSource();
		 //driver.getTitle();
		 System.out.println(driver.getTitle());
		 // driver.getCurrentUrl();
		 System.out.println(driver.getCurrentUrl());
		 driver.close();
		 
		 
	}

}
