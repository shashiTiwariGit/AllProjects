package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEasyDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\JarsandRequirement\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/");
		driver.findElement(By.cssSelector("a.at-cv-button at-cv-lightbox-yesno at-cm-no-button")).click();
		driver.findElement(By.cssSelector("a#btn_basic_example")).click();
		driver.findElement(By.xpath("//a[text()='Select Dropdown List']")).click();
		driver.findElement(By.cssSelector("select#select-demo")).click();
	}

}
