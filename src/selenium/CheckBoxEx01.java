package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEx01 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://login.salesforce.com");
		driver.manage().window().maximize();
		
		// to check the remember check box 
		
		WebElement remobj = driver.findElement(By.name("rememberUn"));
				
		//boolean mystatus = remobj.isSelected();
		//System.out.println(mystatus);
		
		if(!remobj.isSelected()){
			remobj.click();
		}

	}

}
