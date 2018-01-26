package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesEx04 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking");
		driver.manage().window().maximize();
		
		List<WebElement> myFrames = driver.findElements(By.tagName("frame"));
		
		System.out.println("Number of frames are:"+myFrames.size());
		
		for(WebElement myFrame:myFrames){
			System.out.println(myFrame.getAttribute("name"));
		}
		
		driver.switchTo().frame("login_page");
			
	    driver.findElement(By.xpath("//img[@alt='continue']")).click();
		
	//	driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img")).click();
		
				
		// to read error message in java script pop-up box
		String ErrorMsg =driver.switchTo().alert().getText();
		System.out.println(ErrorMsg);
		// to close the alert
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		// to enter the customer id
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("12234");
		
		driver.close();

	}

}
