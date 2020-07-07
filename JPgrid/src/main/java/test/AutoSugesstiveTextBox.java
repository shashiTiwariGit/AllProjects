package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugesstiveTextBox {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Training\\JarsandRequirement\\chromedriver_win32\\chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("ben");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File( "D://screenshot.png"));
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		String expectedText="BENGALURU AIRPORT";
		int count=0;
		while(!text.equalsIgnoreCase(expectedText)){
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			count++;
			System.out.println(text);
			text=(String) js.executeScript(script);
			if (count<10)
				break;
		}
	}

}
