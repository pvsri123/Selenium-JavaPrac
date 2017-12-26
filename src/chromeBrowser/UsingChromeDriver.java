package chromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UsingChromeDriver {

	ChromeDriver driver;

    @BeforeClass
    public void setUp() {

    	System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");
    }

    @AfterClass
    public void tearDown()
    {
    driver.quit();
    }

    @Test

    public void shouldoUnitTesting()
    {
        WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("Softedge100");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Softedge100");
        password.submit();
    }

}
