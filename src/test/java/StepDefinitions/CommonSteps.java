package StepDefinitions;

import PageClasses.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonSteps {
	
	private CommonMethods CommonMethods;
	public CommonSteps(CommonMethods CommonMethods) {
		this.CommonMethods = CommonMethods;
	}
		
	@Given("I Login to Application")
	public void i_Login_to_Application() {
		CommonMethods.launchApplication();
		CommonMethods.loginToApplication();
	}

	@Then("I Logout form Application")
	public void i_Logout_form_Application() {
		CommonMethods.logoutFromApplication();
	}
		
	@Given("I Login to Application as {string}")
	public void i_Login_to_Application_as(String userId) {
		CommonMethods.launchApplication();
		CommonMethods.loginToApplicationWithGivenUser(userId);
	}
}
