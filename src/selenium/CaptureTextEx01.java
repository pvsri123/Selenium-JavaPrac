package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureTextEx01 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		String s = driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).getText();
		System.out.println(s);

	}

}
