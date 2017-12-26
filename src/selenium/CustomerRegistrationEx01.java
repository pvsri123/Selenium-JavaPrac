package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomerRegistrationEx01 {

	public static void main(String[] args) {
		// : Verify Customer Registration in gcrShop Web portal
		
		//Verification point: Capture confirmation message and compare with expected.

		WebDriver driver = new FirefoxDriver();
		driver.get("http://gcrit.com/build3/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("create an account")).click();
		// check male radio button
		
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("firstname")).sendKeys("Venkata");
		driver.findElement(By.name("lastname")).sendKeys("Sreenivas");
		driver.findElement(By.name("dob")).sendKeys("09/15/1980");
		driver.findElement(By.name("email_address")).sendKeys("pvsree123@gmail.com");
		driver.findElement(By.name("company")).sendKeys("Materials Science and Engineering");
		driver.findElement(By.name("street_address")).sendKeys("Willa Creek Driver");
		driver.findElement(By.name("suburb")).sendKeys("Winter Springs");
		driver.findElement(By.name("postcode")).sendKeys("32708");
		driver.findElement(By.name("city")).sendKeys("Orlando");
		driver.findElement(By.name("state")).sendKeys("Florida");
		
		// To select the country from the Dropdown list
		
		Select Dropdown = new Select(driver.findElement(By.name("country")));
				
		Dropdown.selectByVisibleText("India");
		
		driver.findElement(By.name("telephone")).sendKeys("983983837");
		driver.findElement(By.name("fax")).sendKeys("9228282929");
		driver.findElement(By.name("newsletter")).click();
		
		driver.findElement(By.name("password")).sendKeys("Chiranjeevi");
		driver.findElement(By.name("confirmation")).sendKeys("Chiranjeevi");
		driver.findElement(By.id("tdb4")).click();
		
		String ConformationMessage = driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();

		if (ConformationMessage.equals("Your Account Has Been Created!")){
		System.out.println("Customer Registration Successful - Passed");    
		}
		else{
		System.out.println("Customer Registration Unsuccessful - Failed");    
		}
		driver.close();

		
	}

}
