package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExceptionHandlingEx03 {

	public static  WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		try{		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).sendKeys("InsightQ");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
		Wait<WebDriver> Wt = new WebDriverWait(driver,30);
		Wt.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		
		driver.findElement(By.name("password")).sendKeys("Platinum");
		driver.findElement(By.xpath("//span[tex()='Next']")).click();
		
		Thread.sleep(4000);
		String PgTitle = driver.getTitle();
		if(PgTitle.contains("InsightQ")){
			System.out.println("Sucessful login Operation");
		}
		else {
			System.out.println("Unsucessful Login operation");
		}
	}	
		catch (Exception e)
		{
			
			File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:\\Users\\Sreenivas\\Pictures\\GmailLogin.png"));
			
		}

		}
}

