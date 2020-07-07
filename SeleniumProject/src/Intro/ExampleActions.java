package Intro;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;





public class ExampleActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Jars and Requirement\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.name("q"));
		
		Actions builder = new Actions(driver);
		org.openqa.selenium.interactions.Action seriesOfActions = builder
				.moveToElement(element)
				.click()
				.keyDown(element,Keys.SHIFT)
				.sendKeys(element, "selenium")
				.keyUp(element, Keys.SHIFT)
				.doubleClick(element)
				.contextClick()
				.build();
		
		seriesOfActions.perform();
		

	}

}
