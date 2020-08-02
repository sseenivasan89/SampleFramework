package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Helpers.Utilities;
import StepDefinitions.Hooks;

public class CommonMethods {
	
	public static WebDriverWait wait;
	public static WebDriver driver;
	
	static String devUrl = "https://opensource-demo.orangehrmlive.com/";
	static String qaUrl = "https://opensource-demo.orangehrmlive.com/";
	static String uatUrl = "https://opensource-demo.orangehrmlive.com/";
	static String prodUrl = "https://opensource-demo.orangehrmlive.com/";
	
	public CommonMethods() {
		driver = Hooks.driver;
		wait = new WebDriverWait(driver, Hooks.EXPLICIT_WAIT_TIMEOUT_UNIT);
		PageFactory.initElements(driver, this);
	}

	public void launchApplication() {
		
		if(Utilities.environment.equalsIgnoreCase("dev")) {
			driver.get(devUrl);
		}
		else if(Utilities.environment.equalsIgnoreCase("qa")) {
			driver.get(qaUrl);
		}
		else if(Utilities.environment.equalsIgnoreCase("uat")) {
			driver.get(uatUrl);
		}
		else if(Utilities.environment.equalsIgnoreCase("prod")) {
			driver.get(prodUrl);
		}
	}

	@FindBy(css = "[name='txtUsername']")
	WebElement userName;
	@FindBy(css = "[name='txtPassword']")
	WebElement password;
	@FindBy(css = "[id='btnLogin']")
	WebElement loginButton;
	@FindBy(css = "[id='branding']>a>img")
	WebElement orangeHrmLogo;	
	@FindBy(css = "[id='welcome']")
	WebElement logoutIcon;
	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	WebElement logoutTab;	
	
	public void loginToApplication() {
		userName.sendKeys(Utilities.userName);
		password.sendKeys(Utilities.password);
		loginButton.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(orangeHrmLogo));
	}
	
	public void logoutFromApplication() {
		wait.until(ExpectedConditions.elementToBeClickable(logoutIcon));
		logoutIcon.click();
		logoutTab.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(loginButton));
	}
	
	public void loginToApplicationWithGivenUser(String userId) {
		userName.sendKeys(userId);
		password.sendKeys(Utilities.password);
		loginButton.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(orangeHrmLogo));
	}
}
