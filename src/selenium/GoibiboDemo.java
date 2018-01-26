package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoibiboDemo {

	public static void main(String[] args) {
		
			WebDriver driver = new FirefoxDriver();
	        driver.get("http://www.goibibo.com/bus");
	        driver.manage().window().maximize();
	        WebElement source=driver.findElement(By.id("gi_source"));
	        source.clear();
	        source.sendKeys("Dhule");
	        
	    //    driver.findElement(By.linkText("Dhule,Maharashtra")).click();
	        	        
	        //Explicit wait until element is located
	     
	        WebElement auto_suggest=(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.className("autoSuggestList")));
	      
	        //It will press down & enter keys of keyboard
	      
	        source.sendKeys(Keys.DOWN , Keys.ENTER);
	        
	                
	        
	        WebElement destination=driver.findElement(By.id("gi_destination"));
	        destination.clear();
	        destination.sendKeys("Pune");
	        
	        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	      
	        //It will return all elements with li tag
	        
	        List<WebElement> liElements = driver.findElements(By.xpath("//*[@id='gi_suggest_2']/ul/li"));
	        System.out.println(liElements.size());
	        for (int i = 1; i < liElements.size()+1; i++) {
	            
	            WebElement linkElement = driver.findElement(By.xpath("//*[@id='gi_suggest_2']/ul/li[" + i + "]/a"));
	            System.out.println(linkElement.getText());
	           
	            if (linkElement.getText().equals("Pune")) {
	                linkElement.click();
	                break;
	            }
	        }
	        driver.findElement(By.xpath("//*[@id='gi_search_btn']")).click();
	}

}
