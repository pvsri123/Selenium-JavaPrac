package selenium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DownloadFileWget {
	
	WebDriver driver;

    @BeforeClass

    public void setUp() {

        driver = new FirefoxDriver();

        driver.get("http://docs.seleniumhq.org/download/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterClass

    public void tearDown() {

        //driver.quit();

    }


    @Test

    public void shoulddoUnitTesting() {

//This is the path of element which we want to download.

        WebElement anchortagDownLoad = driver.findElement(By.xpath("//*[@id='mainContent']/p[9]/a[2]"));

        String href = anchortagDownLoad.getAttribute("href");

//cmd /c will type command in command prompt internally then path where we kept our wget file then -P for process then path where we have to save downloaded file then link from where we have to download file.       

String wgetCommand = "cmd /c F:\\All_In_One_Selenium_Dev_Tools\\wget.exe -P F:\\My Downloads " + href;

        System.out.println(wgetCommand);


        try {         //This will print the log of file download

            Process exec = Runtime.getRuntime().exec(wgetCommand);



            BufferedReader reader = new BufferedReader(new InputStreamReader(exec.getErrorStream()));

            String line = null;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);

            }

            exec.waitFor();


        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}

 


