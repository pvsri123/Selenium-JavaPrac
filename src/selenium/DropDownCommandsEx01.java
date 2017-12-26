package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCommandsEx01 {

	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the FireFox driver
				WebDriver driver = new FirefoxDriver();
		 
				// Put an Implicit wait, 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
				// Launch the URL
				driver.get("http://toolsqa.wpengine.com/automation-practice-form");
				driver.manage().window().maximize();
				
				// Step 3: Select 'Continents' Drop down ( Use Id to identify the element )
				// Find Select element of "Single selection" using ID locator.
				
				Select objSelect = new Select(driver.findElement(By.id("continents")));
				
				// Step 4:) Select option 'Europe' (Use selectByvisible text)
				
				objSelect.selectByVisibleText("Europe");
				
				// Using sleep command so that changes can be noticed
				Thread.sleep(2000);

				// Step 5: Select option 'Africa' now (Use selectByIndex)
				
				objSelect.selectByIndex(2);
				Thread.sleep(2000);
				
				// Step 6: Print all the options for the selected drop down and select one option of your choice
				// Get the size of the Select element
				
				List<WebElement> objSize = objSelect.getOptions();
				int iListSize = objSize.size();
				System.out.println("Number of elements in the continents list:"+iListSize);
			
				// Setting up the loop to print all the selected options
			
				for(int i =0; i < iListSize ; i++){
					
					// Storing the value of the option	from dropdown list
					
					String sValue = objSelect.getOptions().get(i).getText();
					
					// Printing the stored value
				
					System.out.println(sValue);
				
					// Putting a check on each option that if any of the option is equal to 'Africa" then select it 
					if(sValue.equals("Africa")){
						objSelect.selectByIndex(i);
						break;
						}
					}	    
				// Kill the browser
				//driver.quit();
	}

}
