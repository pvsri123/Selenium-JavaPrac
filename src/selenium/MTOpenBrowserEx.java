package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MTOpenBrowserEx {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		String pgTitle = driver.getTitle();
		System.out.println(pgTitle);
		
		driver.navigate().refresh();
		driver.navigate().to("http://google.co.in");
		
		String pgTitle1 = driver.getTitle();
		System.out.println(pgTitle1);
		
		driver.navigate().back();
		driver.close();
		
		
		
		

	}

}
