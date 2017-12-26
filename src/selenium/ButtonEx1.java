package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonEx1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.id("u_0_2"));
		
		// to read name of the object
				String btnName = button.getText();
				System.out.println(btnName);
				button.click();

	}

}
