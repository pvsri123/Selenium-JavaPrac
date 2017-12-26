package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksEx2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://demo.guru99.com/selenium/newtours/";	
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		String underConsTitle = "Under Construction: Mercury Tours";	
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		driver.get(baseUrl);					
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));	
        
        String[] linkTexts = new String[linkElements.size()];
        int	i = 0;	
        //extract the link texts of each link element		
  		for (WebElement e : linkElements) 
  		{							
  		linkTexts[i] = e.getText();							
  		i++;			
  		}
  		
  		//test each link		
  		for (String t : linkTexts) {							
  		driver.findElement(By.linkText(t)).click();	
  		if (driver.getTitle().equals(underConsTitle)) 
		{							
            System.out.println("\"" + t + "\"" + " is under construction.");			
        } 
		else 
        {			
            System.out.println("\"" + t + "\"" + " is working.");			
        }		
		driver.navigate().back();	

	}

	}
}
	
	
