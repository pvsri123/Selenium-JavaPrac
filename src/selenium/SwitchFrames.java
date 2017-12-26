package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchFrames {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.manage().window().maximize();
		List<WebElement> myFrames = driver.findElements(By.tagName("frame"));
		System.out.println("Number of frames are:"+myFrames.size());
		
		for(WebElement myFrame:myFrames)
		{
			System.out.println(myFrame.getAttribute("name"));

		}
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
        driver.close(); 
	}

}
