
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionsEx01 {

	WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void shouldDoUnitTesting() {
        WebElement uName = driver.findElement(By.name("userName"));
        WebElement pwd = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.name("login"));

        Actions actions = new Actions(driver);
        Action build = actions.moveToElement(uName).click(uName)
                .keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT)
                .sendKeys("oftedge100").keyDown(Keys.CONTROL)
                .sendKeys("a" + "c").keyUp(Keys.CONTROL).click(pwd)
                .keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
                .click(login).build();

        build.perform();

    }

}
