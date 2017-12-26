package selenium;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx06 {

	public static void main(String[] args) {
		
		System.out.println("Enter any country name:");
		
		Scanner sc = new Scanner(System.in);
		String myval = sc.nextLine();
		
		boolean myStatus = false;
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		Select mylist = new Select(driver.findElement(By.name("country")));
		//mylist.selectByVisibleText("INDIA");
		
		List<WebElement> options = mylist.getOptions();
		System.out.println(options.size());
		
		for(WebElement option:options){
			
			String x = option.getText();
			
			if(x.equalsIgnoreCase(myval)){
				myStatus = true;
				mylist.selectByVisibleText(x);
				System.out.println("Selected country found in the list");
				break;
			}
			
		}
		
		if(myStatus==false){
			System.out.println(myval+ " does not exists");
		}
	}

}
