package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCases1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_%28software%29");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create account")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.contains("wikipedia.org")){
			System.out.println("It is an Internal Link - Redirected to another page in the Same Application - Passed");
			}
			else{
			System.out.println("It is an External Link - Redirected to another page in the Other Application -Failed");
			}
	
		driver.navigate().back();
		driver.findElement(By.partialLinkText("seleniumhq.org")).click();
		
		url = driver.getCurrentUrl();
		if (! url.contains("wikipedia.org")){
		System.out.println("It is an External Link - Redirected to another page in the Other Application - Passed");
		}
		else{
		System.out.println("It is an Internal Link - Redirected to another page in the same Application - Failed");
		}

		driver.close();
	}

}
