package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpiceJetApplication {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='buttons']/ul/li[2]/a/span[2]")).click();
			
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_txtOriginStation1_MST']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_txt_Fromdate_MST']")).sendKeys("10/10/2018");
	}

}
