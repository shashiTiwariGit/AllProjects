package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class FirstSession {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="https://edgedev09.jaggedpeak.com/index.jp?edge=reportOrders.payments";
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Jars and Requirement\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions builder = new Actions(driver);
		//This method will login to Dev09
		login(driver);
		//Driver will be navigated to the page with JP grid
		driver.get(url);
		
		builder.moveToElement(driver.findElement(By.xpath("//span[text()='Payment Method Id']"))).perform();
		//driver.findElement(By.xpath("")).click();
		
		

		

		

	}
	public static WebDriver login(WebDriver driver) throws InterruptedException
	{
		driver.get("https://edgedev09.jaggedpeak.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("userNameInput")).sendKeys("IDM\\stiwari");
		driver.findElement(By.name("Password")).sendKeys("Kshitij@13");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.id("merchant-button")).click();
		
		driver.findElement(By.xpath("//li[@data-value='2']")).click();
		
		Thread.sleep(1000);
	
		driver.findElement(By.id("project-button")).click();
		driver.findElement(By.xpath("//li[@value='4']")).click();
		return driver;

	} 
	

}
