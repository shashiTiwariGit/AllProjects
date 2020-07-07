package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Training\\JarsandRequirement\\chromedriver_win32\\chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		WebDriverWait w=new WebDriverWait(driver, 5);
		Thread.sleep(5000);
		driver.findElement(By.id("travel_date")).click();
		List<WebElement> days = driver.findElements(By.cssSelector("td.day"));
		for (int i = 0; i < days.size(); i++) {
			if (days.get(i).getText().equals("23")) {
				days.get(i).click();
				break;
			}
		}

	}
}
