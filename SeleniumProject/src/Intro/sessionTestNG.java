package Intro;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sessionTestNG {
	
	@AfterMethod
	public void afterMethod () {
		System.out.println("Inside after Mehtod");
	}
	@AfterClass
	public void afterClass () {
		System.out.println("Inside after Class");
	}
	@AfterSuite
	public void afterSuite () {
		System.out.println("Inside after Suite");
	}
	@AfterTest
	public void afterTest () {
		System.out.println("Inside after Test");
	}
	@BeforeMethod
	public void beforeMethod () {
		System.out.println("Inside Before Mehtod");
	}
	@BeforeClass
	public void beforeClass () {
		System.out.println("Inside Before Class");
	}
	@BeforeSuite
	public void beforeSuite () {
		System.out.println("Inside Before Suite");
	}
	@BeforeTest
	public void beforeTest () {
		System.out.println("Inside Before Test");
		
	}

	@Test
	public void firstTest () {
		System.out.println("Inside First Test");
		
	}
	
	@Test
	public void SecondTest () {
		System.out.println("Inside second Test");
		
	}




}
