package StepDefinitions;

import PageClasses.AssignLeavePage;
import PageClasses.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AssignLeaveSteps {
	
	private AssignLeavePage AssignLeavePage;

	public AssignLeaveSteps(CommonMethods CommonMethods, AssignLeavePage AssignLeavePage) {
		this.AssignLeavePage = AssignLeavePage;
	}
		
	@Then("I Goto Assign Leave Page")
	public void i_Goto_Assign_Leave_Page() {
		AssignLeavePage.assignLeavePageActions();
	}
	
	@And("I Assign Leaves")
	public void i_Assign_Leaves() throws InterruptedException {
		AssignLeavePage.assignLeaves();
	}

}
