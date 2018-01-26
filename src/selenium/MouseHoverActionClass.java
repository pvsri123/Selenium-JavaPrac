package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActionClass {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new FirefoxDriver();
		 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.linkText("Departments"));
        Thread.sleep(3000);
        
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
       
        
           // click on "Books and Audibles" and then click on "Textbooks"
     //  driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[8]/span")).click();
      
        action.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[8]/span"))).build().perform();
        
        driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[8]/div[1]/a[5]/span")).click();
       
	}

}
