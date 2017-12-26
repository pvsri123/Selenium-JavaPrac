package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenShotsEx01 {

	public static void main(String[] args) throws IOException {
		
		// Using “TakesScreenshot" Interface we can Capture Screenshot of a page
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		// import java input, output file
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(f, new File("C:\\Users\\Sreenivas\\Pictures\\demo134.png"));
		
		
		//to maintain in our working folder
		
		FileUtils.copyFile(f,new File("./Screenshot/demo.png"));
	}

}
