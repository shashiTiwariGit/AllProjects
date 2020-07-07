package Test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@Test
	public void test001(){
		System.out.println("Test001");
	}
	@BeforeSuite
	public void beforeSuiteMethod(){
		System.out.println("before Suite");
	}
	@AfterSuite
	public void afterSuiteMethod(){
		System.out.println("After Suite Mehtod");
	}
	@Test(groups=("Smoke"))
	public void test002(){
		System.out.println("Test002");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Inside before method");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod(){
		System.out.println("Inside After method");
	}

}
