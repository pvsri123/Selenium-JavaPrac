package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableEx03 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Cruises")).click();
		
		WebElement cruise= driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/th"));
		 List<WebElement> rows=cruise.findElements(By.tagName("tr"));
		 System.out.println("Number of rows are:"+rows.size());
		 for(WebElement row :rows)
		 {
		  List<WebElement> ths=row.findElements(By.tagName("th"));
		  for(WebElement th:ths)
		  {
		   System.out.println(th.getText());
		  }
		  List<WebElement> tds=row.findElements(By.tagName("td"));
		  for (WebElement td: tds)
		  {
		   System.out.print(td.getText());
		   System.out.print("        ");

		  }
		  System.out.println("       ");
		  }
		 driver.close();


	}

}
