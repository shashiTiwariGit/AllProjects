package com.seleniumEasy.testCases;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.seleniumEasy.utilities.ReadConfig;

public class BaseClass {
	ReadConfig readConfig = new ReadConfig();
	public String baseURL = readConfig.getApplicationURL();
	public String userName = readConfig.getuserName();
	public String password = readConfig.getpassword();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {

		logger = Logger.getLogger("MyProjectV2");
		BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");
		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readConfig.getchromePath());
			driver = new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.chrome.driver", readConfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.chrome.driver", readConfig.getIEPath());
			driver = new InternetExplorerDriver();
		}
		driver.get(baseURL);
		
		


	}

	@AfterClass
	public void tearDown() {
		driver.quit();	
	}
}
