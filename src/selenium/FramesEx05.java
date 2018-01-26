package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesEx05 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking");
		driver.manage().window().maximize();
		
				
		List<WebElement> myFrames = driver.findElements(By.tagName("frame"));
		System.out.println("Number of frames are:"+myFrames.size());
		for(WebElement myFrame:myFrames)
		{
			System.out.println(myFrame.getAttribute("name"));

		}

	}

}
