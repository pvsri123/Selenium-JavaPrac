package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonEx3 {

	public static void main(String[] args) {		
		WebDriver driver = new FirefoxDriver();
		driver.get("http:facebook.com");
		driver.manage().window().maximize();
	
		//WebElement btn = driver.findElement(By.id("u_0_r"));
		
		WebElement firstname = driver.findElement(By.id("u_0_9"));		
		firstname.sendKeys("Remo");
		
		WebElement lastname = driver.findElement(By.id("u_0_b"));		
		lastname.sendKeys("Demo");
		
		WebElement reg_email = driver.findElement(By.id("u_0_e"));
		reg_email.sendKeys("Remo.Demo@gmail.com");
		
		WebElement password = driver.findElement(By.id("u_0_l"));
		password.sendKeys("trash");
		
		// select class for drop down menu
		
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel1.selectByVisibleText("Sep");
						
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel2.selectByIndex(4);
		Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.selectByIndex(6);
				
		// For selection of female radio button	
		driver.findElement(By.xpath(".//*[@id='u_0_6']")).click();
				
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Remo.Demo@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_r']")).click();
		
				
		/*// to read name of the object
		String btnName = btn.getText();
		System.out.println(btnName);
		
		// to check object enabled or not
		if(btn.isEnabled()){
			System.out.println("Button is enabled");
			btn.click();
		}
		else
		{
			System.out.println("Button is disabled");
		}
		
		*/

	}

}
