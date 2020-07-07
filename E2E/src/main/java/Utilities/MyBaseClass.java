package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class MyBaseClass {
	// WebDriver creation
	public WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, 10);
	ReadConfig readConfig = new ReadConfig();
	@BeforeTest
	public WebDriver initializeDriver() throws FileNotFoundException {
		
		// Chrome
		if (readConfig.getBrowser().equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", readConfig.getChromeDriver());
			driver=new ChromeDriver();
			System.out.println("Chrome is initaialized");

		}
		// FireFox
		else if (readConfig.getBrowser().equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver",readConfig.getFirefoxDriver());
			driver=new FirefoxDriver();
		}
		// IE
		else if (readConfig.getBrowser().equals("IE")) {
			System.setProperty("webdriver.ie.driver",readConfig.getIEDriver());
			driver= new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		

	}
	public WebDriver goToTestPage(WebDriver driver){
		driver.get(readConfig.getBaseURL());
		try{
			
			WebElement close;
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Close']"))));
			driver.findElement(By.xpath("//a[@title='Close']")).click();
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		return driver;
	}
	

}
