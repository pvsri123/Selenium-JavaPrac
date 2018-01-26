package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class ImageLinks {

	public static void main(String[] args) {
		
		String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
		WebDriver driver = new FirefoxDriver();
		 driver.get(baseUrl);
		 driver.manage().window().maximize();
		 
		 
		 // Synchronization concept
		 // Implicit wait, for any web element 
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 		 
		//click on the "Facebook" logo on the upper left portion
		 
		 driver.findElement(By.cssSelector(".fb_logo.img.sp_3OxEQobvphM.sx_4353e5")).click();
		 
		//verify that we are now back on Facebook's homepage	
		 			
			if (driver.getTitle().equals("Facebook - log in or sign up")) 
			{							
				System.out.println("We are back at Facebook's homepage");					
			}
			else 
			{			
				System.out.println("We are NOT in Facebook's homepage");					
			}
			driver.close();	
	}

}
