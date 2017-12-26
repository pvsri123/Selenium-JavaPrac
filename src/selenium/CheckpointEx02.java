package selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckpointEx02 {

	public static void main(String[] args) {
		//Test Case: Login to Indian Railways Online web portal
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("j_username")).sendKeys("gcreddy7");
		driver.findElement(By.className("loginPassword")).sendKeys("gld938");
		
		Scanner scan = new Scanner(System.in);//System.in is an Input stream
		System.out.println("Enter Captcha");
		String captcha = scan.nextLine();

		driver.findElement(By.className("loginCaptcha")).sendKeys(captcha);
		driver.findElement(By.id("loginbutton")).click();
		String url = driver.getCurrentUrl();
		if (url.equals("https://www.irctc.co.in/eticketing/home")){
			System.out.println("Login Successful - Passed");
			}
			else{
			System.out.println("Login Unsuccessful - Failed");    
			}
			driver.close();

	}

}
