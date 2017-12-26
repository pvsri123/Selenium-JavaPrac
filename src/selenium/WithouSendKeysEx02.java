package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.WrapsDriver;

public class WithouSendKeysEx02 {

	public static void setAttribute(WebElement element, String attributeName,String value)

    {

        WrapsDriver wrappedElement = (WrapsDriver) element;

        JavascriptExecutor driver = (JavascriptExecutor) wrappedElement.getWrappedDriver();

        driver.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])",element, attributeName, value);

    }
	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com");
        driver.manage().window().maximize();

        WebElement uName = driver.findElement(By.name("userName"));
        WebElement pwd = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.name("login"));

        setAttribute(uName, "Value", "Venkata");
        setAttribute(pwd, "Value", "mercury");
        login.submit();
	}

}
