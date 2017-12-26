package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrCmdEx01 {

	public static void main(String[] args) {
		WebDriver  driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		// String pgsource = driver.getPageSource();
		// System.out.println(pgsource);
		
		String pgTitle = driver.getTitle();
		System.out.println("The first page title is "+pgTitle);
		
		String pgurl= driver.getCurrentUrl();
		
		System.out.println(pgurl);
		
		driver.navigate().to("http://hdfcbank.com");
		driver.navigate().refresh();

		 pgTitle = driver.getTitle();
		System.out.println("The second page title is" +pgTitle);
		
		driver.navigate().back();
		driver.navigate().forward();
		

	}

}
