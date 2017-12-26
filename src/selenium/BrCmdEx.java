package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrCmdEx {

	public static void main(String[] args) 
	{
		WebDriver  driver = new FirefoxDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize();
		
		// String pgsource = driver.getPageSource();
		// System.out.println(pgsource);
		
		String pgTitle = driver.getTitle();
		System.out.println(pgTitle);
		
		String pgurl= driver.getCurrentUrl();
		
		System.out.println(pgurl);


	}

}
