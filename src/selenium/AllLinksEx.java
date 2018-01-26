package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksEx {

	public static void main(String[] args) {
		
		//The WebDriver code below checks each link from the Mercury Tours home page to determine those that are working and those 
		// that are still under construction
		//One of the common procedures in web-Testing is to test if all the links 
		//present within the page are working. This can be conveniently done using a combination of 
		// the Java for-each loop, findElements() & By.tagName("a") method.
		
		
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://demo.guru99.com/selenium/newtours/";	
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		driver.get(baseUrl);	
		
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));	
      
        System.out.println("Number of links present in the website are:"+linkElements.size());
        
        String[] linkTexts  = new String[linkElements.size()];	
		
        int	i = 0;	
      //extract the link texts of each link element		
		for (WebElement element : linkElements) 
		{							
		linkTexts[i] = element.getText();							
			
		System.out.println(linkTexts[i]);
		i++;
		System.out.println("**************************************************");
		}
				
		//test each link	
		
		String underConsTitle = "Under Construction: Mercury Tours";
		
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
	


