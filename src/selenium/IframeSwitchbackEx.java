package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeSwitchbackEx {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		driver.manage().window().maximize();
		
		/*List<WebElement> myFrames = driver.findElements(By.tagName("frame"));
		System.out.println("Number of frames are:"+myFrames.size());
		for(WebElement myFrame:myFrames)
		{
			System.out.println(myFrame.getAttribute("name"));

		}*/
		
		//First find the element using any of locator strategy
		WebElement iframeElement = driver.findElement(By.id("IF1"));
 
		//now use the switch command
		driver.switchTo().frame(0);
 
		//Do all the required tasks in the frame 0
		//Switch back to the main window
		driver.switchTo().defaultContent();
		//driver.quit();

	}

}
