package Test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class HomeRelatedTestCases {
	@AfterTest
	public void afterTestMethod() {
		System.out.println("You are in After Test");
	}

	@Test
	public void webLogin() {
		System.out.println("web Login Home");
	}

	@Test(enabled = false)
	public void mobileLogin() {
		System.out.println("mobile Login Home");
	}

	@Test(dependsOnMethods = {"webLogin"})
	public void APILogin() {
		System.out.println("API Login Home");
	}

	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("you are in beforeTest mehtod");
	}

	@DataProvider
	public void dataProvider() {

	}
}