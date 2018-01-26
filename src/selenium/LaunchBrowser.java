package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.facebook.com/";
		String tagName = "";
		String tagName1 = "";
		String tagName2 = "";
		
		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);
		driver.manage().window().maximize();
		tagName = driver.findElement(By.id("email")).getTagName();
		
		//tagName = driver.findElement(By.name("email")).getTagName();
		tagName1 = driver.findElement(By.xpath(".//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i")).getTagName();
        tagName2 = driver.findElement(By.id("u_0_e")).getTagName();
        
		
		System.out.println(tagName);
        System.out.println(tagName1);
        System.out.println(tagName2);
        
        driver.close();
	}

}
