package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class edgeLogin {
	public static WebDriver login(WebDriver driver) throws InterruptedException
	{
		driver.get("https://edgedev09.jaggedpeak.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("userNameInput")).sendKeys("IDM\\stiwari");
		driver.findElement(By.name("Password")).sendKeys("Kshitij@14");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.id("merchant-button")).click();
		
		driver.findElement(By.xpath("//li[@data-value='2']")).click();
		
		Thread.sleep(1000);
	
		driver.findElement(By.id("project-button")).click();
		driver.findElement(By.xpath("//li[@value='4']")).click();
		return driver;

	} 
	public static WebDriver login(WebDriver driver, String url , String userName , String password) throws InterruptedException
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("userNameInput")).sendKeys(userName);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.id("merchant-button")).click();
		
		driver.findElement(By.xpath("//li[@data-value='2']")).click();
		
		Thread.sleep(1000);
	
		driver.findElement(By.id("project-button")).click();
		driver.findElement(By.xpath("//li[@value='4']")).click();
		return driver;

	} 
	public static WebDriver openUrl(WebDriver driver, String url) throws InterruptedException
	{
		driver.get(url);
		return driver;
		
	}
}
