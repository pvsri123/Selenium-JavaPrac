package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowserEx {

	public static void main(String[] args) {
		
		WebDriver  driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.navigate().to("http://google.com");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		
		
	}

}
