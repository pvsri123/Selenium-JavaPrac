package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableEx01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Learn HTML")).click();
		driver.findElement(By.linkText("HTML Tables")).click();
		
		// Taking table name into reference object
		
		WebElement MyTable = driver.findElement(By.id("customers"));
		
		// to find the number of rows available in table

		List<WebElement> Tablerows =  MyTable.findElements(By.tagName("tr"));
		
		System.out.println("Number of rows in a table are:"+Tablerows.size());
		
		for(WebElement Tablerow:Tablerows){
			List<WebElement> tabledata = Tablerow.findElements(By.tagName("td"));
			
			for(WebElement td:tabledata){
				System.out.println(td.getText());
			}
		}
		
	}

}
