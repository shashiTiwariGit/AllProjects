package jira;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToJira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Jars and Requirement\\chromedriver_win32 (13)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jira.jaggedpeak.com/login.jsp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-form-username']")).sendKeys("stiwari");
		driver.findElement(By.xpath("//input[@id='login-form-password']")).sendKeys("Kshitij@14");//timesheet-mlink_lnk
		driver.findElement(By.xpath("//input[@id='login-form-submit']")).click();
		driver.findElement(By.xpath("//a[@id='tempo_menu']")).click();
		driver.findElement(By.xpath("//a[@id='timesheet-mlink_lnk']")).click();
		List divs=driver.findElements(By.className("cell_EDGE6I-13839_2020-01-01"));
		for (Object object : divs) {
			System.out.println(object);
		}
		
		
	}

}
