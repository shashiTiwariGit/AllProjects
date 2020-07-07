package Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class LoanRelatedTestCases {
	@Test
	public void webLogin() {
		System.out.println("web Login");
	}
	@Test
	public void mobileLogin() {
		System.out.println("mobile Login");
	}
	@Test(groups=("Smoke"))
	public void mobileLogout() {
		System.out.println("mobile Login");
	}
	@Test
	public void APILogin() {
		System.out.println("API Login");
	}
}
