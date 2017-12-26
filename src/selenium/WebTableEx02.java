package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableEx02 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Cruises")).click();
		
		WebElement cruise= driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/th"));
		
		List<WebElement> Tablerows =  cruise.findElements(By.tagName("tr"));
		System.out.println("Number of rows in a table are:"+Tablerows.size());
		
		for(WebElement Tablerow:Tablerows){
			List<WebElement> tabledata = Tablerow.findElements(By.tagName("td"));
			
			for(WebElement td:tabledata){
				System.out.println(td.getText());
			}
		}
		

	}

}
