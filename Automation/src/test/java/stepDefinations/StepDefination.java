package stepDefinations;

import org.junit.runner.RunWith;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

@RunWith(Cucumber.class)
public class StepDefination  {

	@Given("^initialize driver with chrome browser$")
	public void initialize_driver_with_chrome_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Given("^Click on Login link on Home page to land on secure sign in page$")
	public void click_on_Login_link_on_Home_page_to_land_on_secure_sign_in_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@When("^user enters \"([^\"]*)\" and Password and logs in$")
	public void user_enters_and_Password_and_logs_in(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("^Verfiy that user is succesfully logged in$")
	public void verfiy_that_user_is_succesfully_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}
}