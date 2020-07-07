package RawTestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TableExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Training\\JarsandRequirement\\chromedriver_win32\\chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, 5);
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/");
		try{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Close']"))));
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		driver.findElement(By.id("btn_basic_example")).click();
		
	}

}
