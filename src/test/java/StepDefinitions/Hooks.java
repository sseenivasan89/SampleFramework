package StepDefinitions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import com.google.common.io.Files;
import Helpers.Utilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	public static final Duration EXPLICIT_WAIT_TIMEOUT_UNIT = Duration.ofSeconds(60);
	public static WebDriver driver;

	@Before
	public void startSetUp() throws IOException, ParseException {

		// data reading
		readingRunData();

		// browser selection
		browserSelections();
	}

	@SuppressWarnings("deprecation")
	@After
	public void tearDown(Scenario scenario) {
		try {
			if (scenario.isFailed() == true) {
				String screenshotName = scenario.getName().replaceAll(" ", "_");

				TakesScreenshot ts = (TakesScreenshot) driver;
				File sourcePath = ts.getScreenshotAs(OutputType.FILE);
				File DestinationPath = new File(
						System.getProperty("user.dir") + "/FailedScreenshots/" + screenshotName + ".png");
				Files.copy(sourcePath, DestinationPath);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			if (scenario.isFailed()) {
				scenario.write("this is my failure message");
				TakesScreenshot ts = (TakesScreenshot) driver;
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		driver.close();
		driver.quit();
		driver = null;
	}

	public void readingRunData() throws IOException, ParseException {
		Utilities jsonRead = new Utilities();
		jsonRead.readJsonData();
	}

	public void browserSelections() {
		// chrome
		if (Utilities.browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.silentOutput", "true");
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("disable-features=NetworkService");
			driver = new ChromeDriver(chromeOptions);
		}
		// firefox
		if (Utilities.browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			driver = new FirefoxDriver(firefoxOptions);
		}
		//driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(1050, 800));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

	}
}
