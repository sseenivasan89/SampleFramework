package StepDefinitions;

import PageClasses.AddingNewUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddingNewUserSteps {

	private AddingNewUserPage AddingNewUserPage;

	public AddingNewUserSteps(AddingNewUserPage AddingNewUserPage) {
		this.AddingNewUserPage = AddingNewUserPage;
	}

	@And("I Goto Admin Page")
	public void i_Goto_Admin_Page() throws InterruptedException {
		AddingNewUserPage.adminPageAction();
	}

	@Then("I Add New User")
	public void i_Add_New_User() throws InterruptedException {
		AddingNewUserPage.addNewUser();
	}
	
	

}
