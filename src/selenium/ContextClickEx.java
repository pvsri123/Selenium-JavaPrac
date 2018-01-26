package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextClickEx {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
        driver.get("http://www.seleniumhq.org/docs/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
        
        //WebElement element=driver.findElement(By.xpath("//a[@href='/download/']"));
     
      WebElement element=driver.findElement(By.xpath(".//*[@id='menu_download']/a"));
              
        element.click();
                
                
WebElement ele2=driver.findElement(By.xpath("//*[@id='nav']/li/ul/li[1]/a"));
        
WebElement auto_suggest=(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='nav']/li/ul/li[1]/a")));
        
Actions action= new Actions(driver);
        
        action.contextClick(ele2).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}
