package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebButtonEx01 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		WebElement botton = driver.findElement(By.id("u_0_r"));
		System.out.println(botton.getText());
		
		if(botton.isEnabled()){
			System.out.println("Object is enabled");
			botton.click();
		}
		else
		{
			System.out.println("Object is disabled");
		}

	}

}
