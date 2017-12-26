package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsEx01 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		// to enter email
		// driver.findElement(By.id("email")).sendKeys("smith");
		// driver.findElement(By.id("pass")).sendKeys("mercury");
		// driver.findElement(By.id("u_0_0")).click();
		// driver.findElement(By.linkText("Forgot account?"));
		
	    driver.findElement(By.xpath(".//*[@id='u_0_7']")).sendKeys("Remo");
		
	    driver.findElement(By.xpath(".//*[@id='u_0_9']")).sendKeys("Demo");
		
	    driver.findElement(By.xpath(".//*[@id='u_0_c']")).sendKeys("Remo.Demo@gmail.com");
	    
	    driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("useless");
		
	    
	    Select sel1= new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel1.selectByVisibleText("Sep");
		
		Select sel2= new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel2.selectByValue("6");	
		
		Select sel3= new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.selectByIndex(6);	
		
		// For radio button selection "male"
		
		driver.findElement(By.xpath(".//*[@id='u_0_5']")).click();
				
		// For clicking create account button 
				
		driver.findElement(By.xpath(".//*[@id='u_0_p']")).click();
				
		
		}

}
