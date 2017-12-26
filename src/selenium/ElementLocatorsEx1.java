package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementLocatorsEx1 {
public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		WebElement Email = driver.findElement(By.name("identifier"));
		Email.sendKeys("India");
		Email.clear();
		driver.close();
		
		//WebElement link = driver.findElement(By.linkText("Forgot email?"));
		// link.click();
		//driver.findElement(By.name("identifier")).clear();	
	}

}



