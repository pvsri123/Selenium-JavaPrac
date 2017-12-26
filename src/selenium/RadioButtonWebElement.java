package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonWebElement {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/webform/radio.html");
		driver.manage().window().maximize();
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
		radio1.click();
		radio2.click();
		radio3.click();

		// Selecting CheckBox		
       
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));							
        
        // This will Toggle the Check box 		
        
		option1.click();
		
		WebElement option2 = driver.findElement(By.id("vfb-6-1"));							
        
        // This will Toggle the Check box 		
        
		option2.click();
		
		WebElement option3 = driver.findElement(By.id("vfb-6-2"));							
        
        // This will Toggle the Check box 		
        
		option3.click();
        // Check whether the Check box is toggled on 		
        if (option1.isSelected()) 
        {					
            System.out.println("Checkbox is Toggled On");					

        } else 
        {			
            System.out.println("Checkbox is Toggled Off");					
        }	
        
      //Selecting Checkbox and using isSelected Method	
        
        driver.get("http://demo.guru99.com/selenium/facebook.html");					
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));	
        
        for (int i=0; i<2; i++) {											
            chkFBPersist.click (); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
        }		
		
	}

}
