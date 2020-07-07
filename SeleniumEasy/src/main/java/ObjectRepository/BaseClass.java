package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeTest
	public WebDriver initialteBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Training\\JarsandRequirement\\chromedriver_win32\\chromedriver1.exe");
		String url = "https://www.seleniumeasy.com/test/";
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, 10);		
		driver.manage().window().maximize();
		driver.get(url);
		try{
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
