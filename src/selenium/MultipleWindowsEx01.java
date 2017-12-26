package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsEx01 {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/SignUp");
		
		String pgTitle=driver.getTitle();
		System.out.println("parent window title is: "+pgTitle);
		
		driver.findElement(By.linkText("Learn more")).click();
		
		//to get all the opened window ids
		
		Set<String> winHandles= driver.getWindowHandles();
		
		//to read each window id
		
		Iterator<String>handles= winHandles.iterator();
		
		String w1=handles.next();
		String w2=handles.next();
		
		driver.switchTo().window(w2);
		pgTitle=driver.getTitle();
		System.out.println("child window1 title is: "+pgTitle);
		
		driver.switchTo().window(w1);
		pgTitle=driver.getTitle();
		System.out.println("parent window title is: "+pgTitle);


	}

}
