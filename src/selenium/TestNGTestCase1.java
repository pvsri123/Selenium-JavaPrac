package selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TestNGTestCase1 {
	
	@Test
	public void verifyTitle(){
	WebDriver driver = new FirefoxDriver();    
	driver.get("https://www.gmail.com");
	String pageTitle = driver.getTitle();
	Assert.assertEquals(pageTitle, "Gmail");
	}

}
