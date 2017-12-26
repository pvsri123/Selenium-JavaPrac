package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://google.com");
	driver.manage().window().maximize();
	
	String URL= driver.getCurrentUrl();
	System.out.println(URL);
	
	String PageTitle = driver.getTitle();
	System.out.println(PageTitle);
	
	String PageSource = driver.getPageSource();
	System.out.println(PageSource);

	String WindowHandle = driver.getWindowHandle();
	System.out.println(WindowHandle);
	
	driver.close();
	driver.quit();

	}

}