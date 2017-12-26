package chromeBrowser;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HandlekeyboardEx {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
		
		
		 WebDriver driver = new ChromeDriver();

		   driver.get("http://newtours.demoaut.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  
		  WebElement uName = driver.findElement(By.name("userName"));
		  WebElement pwd = driver.findElement(By.name("password"));
		  WebElement login = driver.findElement(By.name("login"));

		   //Enter username and password Softedge100
		  Actions actions = new Actions(driver);
		  Action build = actions.moveToElement(uName).click(uName)
		                  .keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT)
		                  .sendKeys("oftedge100").keyDown(Keys.CONTROL)
		                  .sendKeys("a" + "c").keyUp(Keys.CONTROL).click(pwd)
		                  .keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
		                  .click(login).build();

		      build.perform();
	}

}
