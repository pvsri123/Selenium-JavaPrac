package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverAllMethodsEx {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      
        // This will return current page URL.
                System.out.println("\n Page URL : " + driver.getCurrentUrl());

                // This will return Page Title
                System.out.println("\n Page Tittle : " + driver.getTitle());

                // This will return class name
                System.out.println("\n Class Name : " + driver.getClass());
                
                driver.findElement(By.linkText("REGISTER")).click();
                // driver will click on browser back
                driver.navigate().back();
             // /This will click on browser forward
                driver.navigate().forward();
                
                driver.findElement(By.linkText("SIGN-ON")).click();
                
                
                List<WebElement> element = driver.findElements(By.tagName("a"));
                System.out.println("\n How to get Size example: " + element.size());

                driver.findElement(By.name("userName")).sendKeys("savita20");
                
                WebElement ele5 = driver.findElement(By.name("password"));
                ele5.sendKeys("@Savita20");
                
                String css_val = ele5.getCssValue("background-color");
                System.out.println("\n Get CSS value example: " + css_val);
                String value = ele5.getAttribute("value");
                System.out.println("\n Get value example: " + value);
               
                WebElement ele1 = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[1]/font/b"));
                System.out.println("\n Get Text Example: " + ele1.getText());
                System.out.println("\n Get X Y axis location example: " + ele1.getLocation());
                System.out.println("\n How to get tag name example: " + ele1.getTagName());

                WebElement ele2 = driver.findElement(By.name("login"));
                System.out.println("\n getAttribute example Get Attribute named as src: "+ ele2.getAttribute("src"));
                // This will click on submit button
                ele2.submit();

                //This is used for check-box or radio button to check whether selected or not.
               // Boolean val = driver.findElement(By.xpath("//descendant::input[@name='tripType'][1]"))).isSelected();
                              
              //  System.out.println("\n isSelected example: " + val);

                //This will be useful when page have dynamic fields & we have to wait until element is displayed
             //   Boolean val1 = driver.findElement(By.xpath("//descendant::input[@name='tripType'][1]")).isDisplayed();
             //   System.out.println("\n isDisplayed example: " + val1);

                //This will be useful when we have to wait until element is enable
           //     Boolean val2 = driver.findElement(By.xpath("//descendant::input[@name='tripType'][1]")).isEnabled();
           //     System.out.println("\n isDisplayed example: " + val2);

                // This will click on browser refresh
                driver.navigate().refresh();

                // This will return page source
        System.out.println("\n Page Source : " + driver.getPageSource());

                driver.close();

	}

}
