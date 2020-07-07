package TestCases001;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObject.BaseClass;
import com.pageObject.LoginPage;

public class LoginTC001 extends BaseClass {

	@Test
	public void loginTest() {
		driver.manage().window().maximize();
		
		logger.info("Entered Url");
		LoginPage lp = new LoginPage(driver);
		lp.setUserID(userName);
		logger.info("Entered Username");
		lp.setPassword(password);
		logger.info("Entered Password");
		lp.clickSubmit();
		logger.info("Submit with Login Button");
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Test Case Passed");
		} else{
			Assert.assertTrue(false);
			logger.warn("test Case Failed");
		}
			
	}

}
