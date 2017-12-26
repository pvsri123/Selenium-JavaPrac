package pageobject.pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonDriver {
	private WebDriver driver;
	 private long lngPageLoadTimeOut;
	 private long lngElementDetectionTimeOut;
	 
	 /**
	  *  Constructor to initialize timeout
	  */
	 public CommonDriver(){
	  lngPageLoadTimeOut = 60L;
	  lngElementDetectionTimeOut = 30L;
	 }

	 /**
	  * @return driver 
	  */
	 public WebDriver getDriver() {
	  return driver;
	 }

	  /**
	  * @param l manually set page load timeout
	  */
	 public void setPageLoadTimeout(long l) {
	  lngPageLoadTimeOut = l;
	 }

	  /**
	  * @param l this will set time for find element
	  */
	 public void setElementDetectionTimeout(long l) {
	  lngElementDetectionTimeOut = l;
	    
	 }

	  /**
	  * @param sBrowserType
	  * @param sUrl
	  * Open browser is return by getBrowserTypeIndexed method
	  */
	 public void openBrowser(String sBrowserType, String sUrl){
	  try{
	   
	   switch (getBrowserTypeIndexed(sBrowserType)) {
	   case 1:
	    System.setProperty("webdriver.gecko.driver","src/resources/geckdriver.exe");
	    driver = new FirefoxDriver();
	    break;
	   case 2:
	    
	    System.setProperty("webdriver.ie.driver", "src/esources/IEDriverServer.exe");
	    driver = new InternetExplorerDriver();
	    break;
	    
	   case 3:
	    System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
	    driver = new ChromeDriver();
	    break;
	   default:
	    throw new Exception("Unknow Browser Type = "+ sBrowserType);
	    
	   }
	      
	   if(sUrl.isEmpty()){
	   
	    sUrl = "about:blank";
	    }
	   
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   
	   driver.manage().timeouts().pageLoadTimeout(lngPageLoadTimeOut, TimeUnit.SECONDS);
	   
	   driver.manage().timeouts().implicitlyWait(lngElementDetectionTimeOut, TimeUnit.SECONDS);
	   
	   driver.get(sUrl);
	   
	   Thread.sleep(2000);
	   
	   
	  } catch (Throwable t){
	   t.printStackTrace();
	  }
	 }
	 
	 
	 /**
	  *  close all browser
	  */
	 public void closeBrowser(){
	  try{
	   if(driver != null){
	    driver.quit();
	   }
	   
	  } catch(Throwable t){
	   t.printStackTrace();
	  }
	 }
	 
	 /**
	  * @param sBrowserType
	  * @return
	  * this method will return int value depend on browser  passed by user
	  */
	 private int getBrowserTypeIndexed(String sBrowserType){
	  sBrowserType = sBrowserType.toLowerCase().trim();
	  
	  if(sBrowserType.isEmpty()){
	   return -1;
	  }
	  
	  if(sBrowserType.equals("ff") || sBrowserType.equals("firefox")  || sBrowserType.equals("mozilla") || sBrowserType.equals("mozilla firefox")){
	   return 1;
	  }
	  
	  if(sBrowserType.equals("ie") || sBrowserType.equals("explorer")  || sBrowserType.equals("internet explorer")){
	   return 2;
	  }
	  
	  if(sBrowserType.equals("chrome") || sBrowserType.equals("google")  || sBrowserType.equals("google chrome")){
	   return 3;
	  }
	  
	  return -1;
	 }
}

	


