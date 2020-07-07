package testCases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\JarsandRequirement\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=au");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("test123");
		driver.findElement(By.cssSelector("[name='pw']")).sendKeys("test1234");
		driver.findElement(By.cssSelector("[class='button r4 wide primary']")).click();
		String s = "hey , r u jhfglhgjh                 ghfkgk";
		
		
	}

}
