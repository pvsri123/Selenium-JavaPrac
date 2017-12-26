package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksEx01 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> listWebElements = driver.findElements(By.tagName("a"));
		
		 int i = 0;
	     int size = listWebElements.size();
	     System.out.println("Number of links present in the website are:"+size);
	     
	     String linkText[] = new String[size];
	     
	     for (WebElement element : listWebElements) {
	            linkText[i] = element.getText();
	            i++;
	        }

	     for (String linkTemp : linkText) {

	            System.out.println("\n" + linkTemp);
	            if (linkTemp != "") {
	                driver.findElement(By.linkText(linkTemp)).click();
	                driver.navigate().back();
	            }
	        }        
	}

}
