package Academy;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.MyBaseClass;

public class HomePage extends MyBaseClass {
	WebDriver driver;

	@Test
	public void basePageNavigation() throws FileNotFoundException {
		driver = initializeDriver();
		goToTestPage(driver);
		Assert.assertFalse(driver.getCurrentUrl().equals(""));

	}

}
