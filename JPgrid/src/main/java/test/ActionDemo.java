package test;


import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Training\\JarsandRequirement\\chromedriver_win32\\chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver);
		WebElement move= driver.findElement(By.cssSelector("a[class='nav-a nav-a-2']"));
		WebElement textBox = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(move).build().perform();
		List<WebElement> a= driver.findElements(By.xpath("iframes"));
		System.out.println(a.size());
		
		
		action.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("shashi").doubleClick().build().perform();
		
		
		

	}

}
