package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CheckcommdifferentBrowsers {

	public static void main(String[] args) throws InterruptedException {
		WebDriver firefoxDriver = new FirefoxDriver();
		firefoxDriver.get("https://www.google.com");
		firefoxDriver.findElement(By.linkText("Gmail")).click();
		String text = firefoxDriver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h2")).getText();

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://www.gcrit.com/build3/create_account.php?osCsid=1vbg1oj32ole3qrcv4b6mr7m24");
		chromeDriver.findElement(By.name("firstname")).sendKeys(text);
		Thread.sleep(3000);

		System.setProperty("webdriver.ie.driver","C:\\SeleniumDrivers\\IEDriverServer.exe");
		WebDriver  IEDriver = new InternetExplorerDriver();
		IEDriver.get("https://in.mail.yahoo.com/");

		firefoxDriver.close();
		chromeDriver.close();
		IEDriver.close();

	}

}
