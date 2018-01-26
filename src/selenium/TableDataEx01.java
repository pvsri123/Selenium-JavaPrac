package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableDataEx01 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

        driver.get("http://jqueryui.com/datepicker");
        driver.manage().window().maximize();
       
        WebElement ele = driver.findElement(By.className("demo-frame"));
       driver.switchTo().frame(ele);
     
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        // Click on text box so that date picked will come
        driver.findElement(By.id("datepicker")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        
        // Click on next so that we will be go over the next month
        driver.findElement(By.xpath("/html/body/div/div/a[2]/span")).click();
       
        // Date picker is a table so that navigate to each cell, If particular
        // cell matches value 13 then select it
        WebElement dateWidget = driver.findElement(By.className("ui-datepicker-calendar"));

        List<WebElement> rows = dateWidget.findElements(By.tagName("tr"));
        List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

        // select 20th date
        for (WebElement row : rows) {
            for (WebElement col : columns) {
                if (col.getText().equals("20")) {
                    col.click();
                    break;
                }
            }
        }
	}

}
