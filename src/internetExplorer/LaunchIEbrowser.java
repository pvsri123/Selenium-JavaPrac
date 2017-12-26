package internetExplorer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIEbrowser {
	
		public static void main(String[] args) 
		{
			
			System.setProperty("webdriver.ie.driver","C:\\SeleniumDrivers\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.get("http://www.facebook.com");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			

		}

	}


