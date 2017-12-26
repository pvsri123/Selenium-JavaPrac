package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLang {
	public WebDriver driver;
	public void setUp(){
		driver= new FirefoxDriver();
		driver.get("http://google.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void langClick(String myLang) throws InterruptedException{
		driver.findElement(By.linkText(myLang)).click();
		Thread.sleep(3000);
	}
	public void tearDown(){
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		GoogleLang gl=new GoogleLang();
		gl.setUp();
		gl.langClick("??????");
		gl.langClick("?????");
		gl.langClick("English");
		gl.tearDown();
	}

}
