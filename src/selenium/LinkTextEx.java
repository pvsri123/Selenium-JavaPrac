package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextEx {

	public static void main(String[] args) {
		WebDriver driver =  new FirefoxDriver();
		
		String baseUrl = "http://demo.guru99.com/selenium/link.html";					
                	       		
        driver.get(baseUrl);					
        driver.findElement(By.linkText("click here")).click();					
        System.out.println("title of page is: " + driver.getTitle());							

	}

}
