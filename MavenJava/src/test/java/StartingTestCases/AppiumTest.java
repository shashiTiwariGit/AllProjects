package StartingTestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ReportAggregates;
import com.aventstack.extentreports.model.Author;
import com.aventstack.extentreports.model.Category;
import com.aventstack.extentreports.model.Device;
import com.aventstack.extentreports.model.Log;
import com.aventstack.extentreports.model.ScreenCapture;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.Test;

public class AppiumTest {
	ExtentReports eReporter;

	@BeforeTest
	public void config(){
		String path= System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter sparkReporter= new ExtentSparkReporter(path);
		sparkReporter.config().setReportName("Demo Automation Report");
		sparkReporter.config().setDocumentTitle("Extent Report");
		eReporter = new ExtentReports() ;
		eReporter.attachReporter(sparkReporter);
		eReporter.setSystemInfo("Tester", "Shash");
				
	}

	@Test
	public void AppiumBrowserProject() {
		ExtentTest test= eReporter.createTest("AppiumBrowserProject");
		System.setProperty("webdriver.chrome.driver",
				"D:\\Training\\JarsandRequirement\\chromedriver_win32\\chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		test.fail("Result Do Not match");
		eReporter.flush();
	}

	@Test
	public void AppiumBrowserProject2() {
		System.out.println("MavenProject Apium Class Broser Automation");
	}

}
