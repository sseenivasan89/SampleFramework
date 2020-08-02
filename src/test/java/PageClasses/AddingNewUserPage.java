package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.Utilities;
import StepDefinitions.Hooks;

public class AddingNewUserPage {
	
	public static WebDriverWait wait;
	public static WebDriver driver;
	
	public AddingNewUserPage() {
		driver = Hooks.driver;
		wait = new WebDriverWait(driver, Hooks.EXPLICIT_WAIT_TIMEOUT_UNIT);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[id='mainMenuFirstLevelUnorderedList']>li:nth-child(1)>a")
	WebElement adminTab;
	@FindBy(css = "[id='menu_admin_UserManagement']")
	WebElement userMgntTab;
	@FindBy(css = "[id='menu_admin_viewSystemUsers']")
	WebElement usersTab;
	@FindBy(css = "[id='btnAdd']")
	WebElement addButton;
	@FindBy(css = "[id='systemUser_employeeName_empName']")
	WebElement empNameTextBox;
	@FindBy(css = "[id='systemUser_userName']")
	WebElement userNameTextBox;
	
		
	public void adminPageAction() throws InterruptedException {
		adminTab.click();
		userMgntTab.click();
		usersTab.click();
		wait.until(ExpectedConditions.elementToBeClickable(addButton));
	}
	
	public void addNewUser() throws InterruptedException {
		Thread.sleep(2000);
		addButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(empNameTextBox));
		empNameTextBox.sendKeys(Utilities.firstName);
		userNameTextBox.sendKeys(Utilities.userName);
		Thread.sleep(5000);		
	}
	
}
