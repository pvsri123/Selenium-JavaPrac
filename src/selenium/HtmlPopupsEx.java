package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HtmlPopupsEx {

	public static void main(String[] args) throws InterruptedException {
		
		// write script to select "senior citizen" check box and to close 
		// html popup(url: https://goindigo.in)
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://goindigo.in");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Click on pop-up window
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='roundWay']/form/div[1]/div/div/div/ul/li[3]/div/label")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='globalModal']/div/div/div[3]/button")).click();

	}

}
