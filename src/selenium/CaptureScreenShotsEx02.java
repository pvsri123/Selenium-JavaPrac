package selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenShotsEx02 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new FirefoxDriver();
		// This will maximize the browser
        driver.manage().window().maximize();
     // This will wait for 30 seconds
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
     // This will type URL in firefox browser
        driver.navigate().to("http://newtours.demoaut.com/");
        
        String img = (new SimpleDateFormat("mm")).format(new Date());
        
        File scrFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
FileUtils.copyFile(scrFile1, new File("C:\\Users\\Sreenivas\\Pictures\\" + img + ".jpg"));
	}

}
