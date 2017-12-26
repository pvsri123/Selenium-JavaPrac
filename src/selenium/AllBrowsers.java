package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowsers {

public static WebDriver driver;
public static int browser;
public static String BrowserName;
			
public static void main(String[] args)
{
			for (browser = 1; browser <= 3; browser++)
			{
				if (browser == 1) 
				{
					driver = new FirefoxDriver();
					BrowserName = "Mozilla Firefox Browser: ";
				}
			else if (browser == 2) 
			{
				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
				BrowserName = "Google Chrome Browser: ";
			}
			else if (browser == 3)
			{
				System.setProperty("webdriver.ie.driver", "C:\\SeleniumDrivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				BrowserName = "Internet Explorer Browser: ";
			}
			
			driver.get("https://www.google.com");

			String PageTitle = driver.getTitle();

			if (PageTitle.equals("Google")){
			System.out.println(BrowserName + " - Google Application Launched - Passed");
			}
			else {
			System.out.println(BrowserName + " - Google Application Not Launched -Failed");    
			}
			driver.close();
			}
		}
			
}


