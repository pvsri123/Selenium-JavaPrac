package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeEx {

	public static void main(String[] args) {
		
	/*There are two ways to find total number of iFrames in a web page. 
	 First by executing a JavaScript and second is by finding total number
	 of web elements with a tag name of iFrame
		*/
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		driver.manage().window().maximize();
		
		//By executing a java script method
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);
 
		//By finding all the web elements using iframe tag 
		
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		
		for(WebElement myiFrames:iframeElements){
			System.out.println(myiFrames.getAttribute("name"));
		}

	}

}
