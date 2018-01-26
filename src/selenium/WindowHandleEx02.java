package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleEx02 {

	//Following program is use to count & print drop down values & window handle
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();      
		driver.manage().window().maximize();
		driver.navigate().to("http://www.pmpml.org");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		// Store the current window handle        
		String parent_window = driver.getWindowHandle();        

		System.out.println("Parent window handle: "+parent_window);        
		System.out.println("Parent Window Title: " + driver.getTitle());    
		
		// Clicking on Route Map button at the bottom the page
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div[4]/div/div/div[2]/div/div/div[1]/a")).click();
		
		driver.navigate().back();
		// Switch to new window opened       
		for (String child_window1 : driver.getWindowHandles()) 
		{
		            driver.switchTo().window(child_window1);
		}  

		System.out.println("Child Windlow title: " + driver.getTitle());   
	}

}
