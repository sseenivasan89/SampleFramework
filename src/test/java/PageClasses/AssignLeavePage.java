package PageClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Helpers.Utilities;
import StepDefinitions.Hooks;

public class AssignLeavePage {
	
	public static WebDriverWait wait;
	public static WebDriver driver;
	
	public AssignLeavePage() {
		driver = Hooks.driver;
		wait = new WebDriverWait(driver, Hooks.EXPLICIT_WAIT_TIMEOUT_UNIT);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[id='menu_leave_viewLeaveModule']")
	WebElement leaveTab;
	@FindBy(css = "[id='menu_leave_assignLeave']")
	WebElement assignLeaveTab;
	@FindBy(css = "[id='assignleave_txtEmployee_empName']")
	WebElement empNameTextBox;
	@FindBy(css = "[id='assignleave_txtLeaveType']")
	WebElement leaveTypeDropDownBox;
	@FindBy(css = "[id='assignleave_txtFromDate']")
	WebElement fromDateBox;
	@FindBy(css = "[id='assignleave_txtToDate']")
	WebElement toDateBox;
	@FindBy(css = "[id='assignleave_duration_duration']")
	WebElement durationDropDownBox;
	@FindBy(css = "[id='assignleave_txtComment']")
	WebElement commentBox;
	
	public void assignLeavePageActions() {
		leaveTab.click();
		wait.until(ExpectedConditions.elementToBeClickable(assignLeaveTab));
		assignLeaveTab.click();
	}
	
	public void assignLeaves() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(empNameTextBox));
		empNameTextBox.sendKeys(Utilities.firstName);
		Select sel = new Select(leaveTypeDropDownBox);
		sel.selectByIndex(2);
		fromDateBox.clear();
		fromDateBox.sendKeys(Utilities.dateCreation("yyyy-MM-dd", "5"));
		toDateBox.clear();
		toDateBox.sendKeys(Utilities.dateCreation("yyyy-MM-dd", "5"));
		toDateBox.sendKeys(Keys.TAB);
		Select sel1 = new Select(durationDropDownBox);
		sel1.selectByIndex(2);
		commentBox.sendKeys("Test");
		Thread.sleep(3000);
		Assert.assertEquals("Tests", commentBox.getText());
	}

}
