package chromeBrowser;

/*Go to http://barnesandnoble.com, keep the pointer over ‘Books’, in the sub menu click ‘Biography’ as shown below
*/ 
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BookBiographyEx {

	WebDriver driver;
	WebDriverWait wait;
	@BeforeClass
	
	public void setUP() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://barnesandnoble.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 }
	@Test(description="Click on Books => Biography")
	 public void clickBiography()
	 {
	    driver.findElement(By.xpath("//a[@href='#'][@aria-label='Close']")).click();
	    
	    driver.findElement(By.linkText("Books")).click();
	    Assert.assertEquals(driver.getTitle(), "Books | Barnes & Noble®","Unable to reach on books page");
	    System.out.println("Title of books page: "+driver.getTitle());
	    waitTillPageLoad();
	    
	    driver.findElement(By.linkText("Biography")).click();
	    waitTillPageLoad();
	    Assert.assertEquals(driver.getTitle(), "Biography, Books | Barnes & Noble®","Unable to reach on biography page");
	    System.out.println("Title of Biography page: "+driver.getTitle());
	 }
	 
	 /**
	  * This will wait until specified attribute has specified attribute value
	  * while loading attribute value is "landingPage" and after loading page attribute value is
	  * "landingPage rfk_wbh"
	  */
	 public void waitTillPageLoad()
	 {
	  wait=new WebDriverWait(driver,60);
	  WebElement element=driver.findElement(By.tagName("body"));
	  wait.until(ExpectedConditions.attributeContains(element, "class", "landingPage rfk_wbh".trim()));
	 }
	 
	 @AfterClass
	 public void tearDown()
	 {
	  driver.close();
	 }
	}
