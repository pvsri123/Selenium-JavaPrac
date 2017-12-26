package chromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GCRShopPageLaunch {

	public static void main(String[] args) {
		//Instantiate the Browser Driver 
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("http://www.gcrit.com/build3/admin/"); 
		String PageTitle = driver.getTitle(); 
		if (PageTitle.equals("GCR Shop"))
		{ System.out.println("GCR Shop Admin Home Page displayed - Passed"); 
		}
		else 
		{ 
			System.out.println("GCR Shop Admin Home Page Not displayed - Failed");
		} 
		driver.close();
	}

}
