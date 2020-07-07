package Intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleWait {
	
	public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "D:\\Training\\Jars and Requirement\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	// Implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

	driver.get("https://toolsqa.come/automation-practice-switch-window");
	
	driver.findElement(By.name("Timing Alert")).click();
	
	System.out.println("Timer JavaScript Alert is triggered");
	WebDriver wait = new ChromeDriver();
	}
}
