package com.seleniumEasy.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.seleniumEasy.pageObject.SeleniumEasyTestPage;

public class OpenHomePage extends BaseClass{
	
	@Test
	public void openHomePageTest() {
driver.manage().window().maximize();
		
		logger.info("Entered Url");
		SeleniumEasyTestPage lp = new SeleniumEasyTestPage(driver);
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
