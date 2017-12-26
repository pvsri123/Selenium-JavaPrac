package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.WrapsDriver;

public class WithouSendKeys {

	public static WebDriver driver;
	
//	public static void setAttribute(WebElement element, String attributeName, String value)
	 
	public static void setAttribute()
	 
    {
 
        /*WrapsDriver wrappedElement = (WrapsDriver) element;
 
        JavascriptExecutor driver = (JavascriptExecutor)wrappedElement.getWrappedDriver();
 
        driver.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element, attributeName, value);*/
 
        WebElement cssValue= driver.findElement(By.id("email"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('email').value='Done@gmail.com'");
        
    }
	
	
	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		setAttribute();
		
			}

}
